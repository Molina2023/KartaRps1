package karta2;

import java.util.ArrayList;
import java.util.Random;

/*
Esta clase tiene todo lo relacionado a la ronda
Tiene los métodos: 
    DeterminarPreguntas y DeterminarElemento
    CargarArrayRespuestas
    EncontrarPreguntaAnterior
    RecibePaquete
    CargarSiguientePregunta
    CambiarDificultad
*/
public class Ronda {
    private Usuario Usuario;
    //Es el array de las preguntas diferentes que se le harán al Usuario
    private ArrayList<Pregunta> arrayPreguntasPartida = new ArrayList<Pregunta>();
    private ArrayList<Pregunta> arrayPreguntasHechas = new ArrayList<Pregunta>();
    private int PosicionPreguntaHecha = -1;
    
    //Lista del paquetito al final de la ronda
    private ArrayList<PreguntaRespuesta> arrayRespuestas = new ArrayList<PreguntaRespuesta>();
    
    
    private Enum.Medalla Medalla;
    private int i = 0;

    TablaPeriodica tablaPeriodica = new TablaPeriodica();
    
    public Usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(Usuario Usuario) {
        this.Usuario = Usuario;
    }

    public ArrayList<Pregunta> getArrayPreguntasPartida() {
        return arrayPreguntasPartida;
    }

    public ArrayList<PreguntaRespuesta> getArrayRespuestas() {
        return arrayRespuestas;
    }

    public Enum.Medalla getMedalla() {
        return Medalla;
    }

    //Crea una pregunta de la clase Pregunta (elemento + tipo de pregunta) y lo devuelve
    public Pregunta DeterminarElemento() {
        int numElemento = (int) (Math.random() * 118);
        int tipoPregunta = (int) (Math.random() * 4);
        //        System.out.println(tipoPregunta);
        
        Pregunta item = new Pregunta(); //Crea el objeto
        //Asigna el número random del elemento a la propiedad del objeto Pregunta
        item.ElementoEstudiado = tablaPeriodica.arrayTablaPeriodica.get(numElemento);
        //Asigna un tipo de pregunta random a la propiedad del objeto Pregunta
        item.TipoPregunta = Enum.TipoPregunta.values()[tipoPregunta];
        return item;
    }

    //Crea un paquete de preguntas random (objeto de la clase Pregunta), recibe el número de preguntas
    public void DeterminarPreguntas(int numPreguntas) {
        //el this. significa que va a agregar las preguntas al array público de esta clase
        this.arrayPreguntasPartida = new ArrayList<Pregunta>();
        this.i = 0;
        for (int i = 0; i < numPreguntas; i++) {
            this.arrayPreguntasPartida.add(DeterminarElemento());
        }
    }
    
    //Este método agrega el objeto PreguntaRespuesta y lo agrega al array tipo PreguntaRespuesta: arrayRespuestas
    public void CargarArrayRespuestas (Pregunta ElementoEstudiado, boolean Correcta, String Respuesta, Enum.Dificultad Dificultad) {
        PreguntaRespuesta PreguntaRespuesta = new PreguntaRespuesta(ElementoEstudiado, Correcta, Respuesta, Dificultad);
        PreguntaRespuesta PreguntaAnterior;
        PreguntaAnterior = EncontrarPreguntaAnterior(ElementoEstudiado);
        CambiarDificultad(PreguntaAnterior, PreguntaRespuesta);
        
        this.arrayRespuestas.add(PreguntaRespuesta);
    }
    
    //Este método busca en el arrayRespuestas la vez anterior que se preguntó una pregunta específica
    public PreguntaRespuesta EncontrarPreguntaAnterior (Pregunta PreguntaBuscada) {
        //Se crea un array sin la pregunta Buscada para buscar el último índice de la pregunta antes de ese
        ArrayList<Pregunta> arrayCortado = new ArrayList<Pregunta>();
        for (int j = 0; j < this.arrayRespuestas.size()-1; j++) {
            arrayCortado.add(this.arrayRespuestas.get(j).getPreguntaEstudiada());
        }
        //Busca el índice de la pregunta
        int IndexPreguntaBuscada = 0;
        try {
            IndexPreguntaBuscada = arrayCortado.lastIndexOf(PreguntaBuscada);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        PreguntaRespuesta PreguntaRespuestaEncontrada;
        PreguntaRespuestaEncontrada = this.arrayRespuestas.get(IndexPreguntaBuscada);
        return PreguntaRespuestaEncontrada;
        
    }
    
    /*
    Este método hace todo: guardar el objeto en el arrayRespuestas, Evaluar la dificultad, 
    elegir la siguiente Pregunta
    Determina si el Usuario decidió fácil pero se equivocó
    Lo manda a CargarArrayRespuestas, donde le cambia la dificultad si es necesario
    y lo guarda en el array
    Va a CargarSiguientePregunta y regresa un array de las siguientes preguntas que va a preguntar
    Regresa la pregunta de la iteración i y aumenta i
    */
    public Pregunta RecibePaquete (Pregunta ElementoEstudiado, boolean Correcta, String Respuesta, Enum.Dificultad Dificultad) {
        if (Correcta == false && Dificultad == Enum.Dificultad.FACIL) {
            Dificultad = Enum.Dificultad.MEDIO;
        }
        CargarArrayRespuestas(ElementoEstudiado, Correcta, Respuesta, Dificultad);
        ArrayList<Pregunta> arraySiguientePregunta;
        arraySiguientePregunta = CargarSiguientePregunta();
        for (int j = 0; j < arraySiguientePregunta.size(); j++) {
            this.arrayPreguntasHechas.add(arraySiguientePregunta.get(j));
        }
        Pregunta SiguientePregunta;
        SiguientePregunta = arrayPreguntasHechas.get(i);
        i++;
        return SiguientePregunta;
    }
            
            
    /*Este método determina la siguiente pregunta que se va a preguntar
        Utiliza dos indices para comparar con las preguntas que ya se hicieron, esto es para saber si en esa
        iteración se debe agregar una pregunta al arrayPreguntasPartida, es decir determina si es hora de 
        repetir una pregunta, decidiendo conforme a la dificultad que eligió el usuario.
        
    */
    public ArrayList<Pregunta> CargarSiguientePregunta () {
        
        ArrayList<Pregunta> SiguientePregunta = new ArrayList<Pregunta>(); //La pregunta que va a regresar
        int IndiceMedio = 0;//Usar para comparar con la pregunta que se hizo hace 3 preguntas
        int IndiceDificil = 0;//Para comparar con la pregunta que se hizo hace 5 preguntas
        int contador = 0; //Un contador para saber cuántas preguntas diferentes se han hecho
        Enum.Dificultad Dificultad;
            //El programa consigue la dificultad de la pregunta del IndiceMedio
            //El programa consigue la dificultad de la pregunta del IndiceDificil, si existe
            //Si la dificultad del IndiceMedio es Medio, agrega esa pregunta al final del arrayPreguntasPartida
            //Si la dificultad del IndiceDificil es Dificil, agrega esa pregunta al final del array
        if (i < 4) {
            //El programa repite las preguntas 3 preguntas después por lo menos
            SiguientePregunta.add(this.arrayPreguntasPartida.get(i));
            this.PosicionPreguntaHecha++;
        } else if (i == 4 || i == 5) {
            IndiceDificil = i-4;
            if (this.arrayRespuestas.get(IndiceDificil).getDificultad().equals(Enum.Dificultad.DIFICIL)) {
                SiguientePregunta.add(this.arrayRespuestas.get(IndiceDificil).getPreguntaEstudiada());
            }
        } else {
            //Debe determinar si el IndiceDificil es un indice que existe en el array
            if (IndiceDificil >= this.arrayPreguntasPartida.size()) {
                IndiceMedio = i-6;
                
            } else {
                IndiceMedio = i-6;
                IndiceDificil = i-4;
                if (this.arrayRespuestas.get(IndiceMedio).getDificultad().equals(Enum.Dificultad.MEDIO)) {
                    SiguientePregunta.add(this.arrayRespuestas.get(IndiceMedio).getPreguntaEstudiada());
                }
                if (this.arrayRespuestas.get(IndiceDificil).getDificultad().equals(Enum.Dificultad.DIFICIL)) {
                    SiguientePregunta.add(this.arrayRespuestas.get(IndiceDificil).getPreguntaEstudiada());
                }
                if (SiguientePregunta.size() == 0 && 
                    this.arrayPreguntasPartida.size() != this.arrayRespuestas.size() &&
                    this.PosicionPreguntaHecha != this.arrayPreguntasPartida.size()) {
                    SiguientePregunta.add(this.arrayPreguntasPartida.get(this.PosicionPreguntaHecha));
                    this.PosicionPreguntaHecha++;
                }
            }
        }
        
        return SiguientePregunta;
    }
    
    /*
    Este método se usa para saber si se va a cambiar la dificultad, tratándose de una Pregunta especial
    La Pregunta Especial se activa cuando el usuario se equivoca pero elije la dificultad Fácil
    PreguntaAnterior se refiere a la Pregunta Anterior en el arrayPreguntasPartida
    */
    public void CambiarDificultad(PreguntaRespuesta PreguntaAnterior, 
        PreguntaRespuesta PreguntaActual){
        
        //Si la anterior el usuario eligió fácil y se equivocó por primera vez, por lo que se 
        //cambió a Medio
        if (PreguntaAnterior.isCorrecta()== false && 
            PreguntaAnterior.getDificultad() == Enum.Dificultad.MEDIO &&
            PreguntaActual.getDificultad() == Enum.Dificultad.FACIL) {
            PreguntaActual.setDificultad(Enum.Dificultad.DIFICIL);
        }
        //Si el usuario se volvió a equivocar y puso fácil, continua en Dificil
        if (PreguntaAnterior.isCorrecta() == false &&
            PreguntaAnterior.getDificultad() == Enum.Dificultad.DIFICIL &&
            PreguntaActual.getDificultad() == Enum.Dificultad.FACIL) {
            PreguntaActual.setDificultad(Enum.Dificultad.DIFICIL);
        }
        //Si el usuario respondió correcto después de que se cambiara a dificil, regresa a medio
        if (PreguntaAnterior.isCorrecta() == true &&
            PreguntaAnterior.getDificultad() == Enum.Dificultad.DIFICIL &&
            PreguntaActual.getDificultad() == Enum.Dificultad.FACIL) {
            PreguntaActual.setDificultad(Enum.Dificultad.MEDIO);
        }
        
    }
            
    /*        
    Estos siguientes dos métodos están sobrecargando DeterminarElemento y DeterminarPreguntas, 
    esto es porque dará los mismos resultados que los 2 de arriba, pero se le envía diferentes parámetros,
    lo que significa que hará cosas diferentes con esos parámetros para devolver los mismos resultados.
    En este caso también regresa paquetes de la clase Pregunta, pero con los tipos de pregunta que decida
    el usuario.
    lo hice pensado para el menú pero aún quien sabe.
    */
    public Pregunta DeterminarElemento(int elemento, int simbolo, int grupo, int periodo, int clasificacion) {
        Pregunta item = new Pregunta();
        int numElemento = (int) (Math.random() * 118);
        item.ElementoEstudiado = tablaPeriodica.arrayTablaPeriodica.get(numElemento);
        ArrayList<Enum.TipoPregunta> arrayx = new ArrayList<Enum.TipoPregunta>();
        if (elemento == 1) {
            arrayx.add(Enum.TipoPregunta.POR_ELEMENTO);
        }
        if (simbolo == 1) {
            arrayx.add(Enum.TipoPregunta.POR_SIMBOLO);
        }
        if (grupo == 1) {
            arrayx.add(Enum.TipoPregunta.POR_GRUPO_AR);
            arrayx.add(Enum.TipoPregunta.POR_GRUPO_RO);
        }
        if (periodo == 1) {
            arrayx.add(Enum.TipoPregunta.POR_PERIODO);
        }
        if (clasificacion == 1) {
            arrayx.add(Enum.TipoPregunta.POR_CLASIFICACION);
        }
        Random rand = new Random();
        item.TipoPregunta = arrayx.get(rand.nextInt(arrayx.size()));
        return item;
    }

    public void DeterminarPreguntas(int numPreguntas, int elemento, int simbolo, int grupo, int periodo, int clasificacion) {
        this.arrayPreguntasPartida = new ArrayList<Pregunta>();
        for (int i = 0; i < numPreguntas; i++) {
            this.arrayPreguntasPartida.add(DeterminarElemento(elemento, simbolo, grupo, periodo, clasificacion));
        }
    }
        
}
