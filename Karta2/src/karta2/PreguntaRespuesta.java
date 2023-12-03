/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karta2;

import static karta2.Enum.TipoPregunta.POR_CLASIFICACION;
import static karta2.Enum.TipoPregunta.POR_ELECTRO;
import static karta2.Enum.TipoPregunta.POR_GRUPO_AR;
import static karta2.Enum.TipoPregunta.POR_GRUPO_RO;
import static karta2.Enum.TipoPregunta.POR_PERIODO;
import static karta2.Enum.TipoPregunta.POR_PESOA;
import static karta2.Enum.TipoPregunta.POR_SIMBOLO;

public class PreguntaRespuesta {
    //En esta clase hay muchos getters y setters
    //A parte de eso solo hay un método, el que valida la respuesta del usuario
    
    private Pregunta PreguntaEstudiada;
    private boolean Correcta; //Si la primera vez que el usuario respondió, estaba correcto
    private String Respuesta; //La respuesta del usuario
//  private boolean IntentoCorrecto; //Si el usuario ya respondió correctamente la pregunta
    private Enum.Dificultad Dificultad; //La dificultad que decidió el usuario

    private String Mensaje = "";

    public PreguntaRespuesta(Pregunta ElementoEstudiado, boolean Correcta, String Respuesta, Enum.Dificultad Dificultad) {
        this.PreguntaEstudiada = ElementoEstudiado;
        this.Correcta = Correcta;
        this.Respuesta = Respuesta;
        this.Dificultad = Dificultad;
    }
    
    public void setPreguntaEstudiada(Pregunta PreguntaEstudiada) {
        this.PreguntaEstudiada = PreguntaEstudiada;
    }

    public void setCorrecta(boolean Correcta) {
        this.Correcta = Correcta;
    }

    public void setRespuesta(String Respuesta) {
        this.Respuesta = Respuesta;
    }
    
    public void setDificultad(Enum.Dificultad Dificultad) {
        this.Dificultad = Dificultad;
    }

    public Pregunta getPreguntaEstudiada() {
        return PreguntaEstudiada;
    }
    

    public boolean isCorrecta() {
        return Correcta;
    }

    public String getRespuesta() {
        return Respuesta;
    }

    public Enum.Dificultad getDificultad() {
        return Dificultad;
    }

    public boolean EvaluarRespuesta(Pregunta pregunta, String Respuesta) {
        String propiedad;
        boolean res = true;
        this.Mensaje = "";
        
            switch (pregunta.TipoPregunta) {
                case POR_SIMBOLO:
                    propiedad = "" + pregunta.ElementoEstudiado.getSimbolo();
                    if (!Respuesta.equalsIgnoreCase(propiedad)) {
                        this.Mensaje = "La respuesta correcta es " + pregunta.ElementoEstudiado.getSimbolo() + ".";
                        res = false;
                    }
                    break;
                case POR_PERIODO:
                    propiedad = "" + pregunta.ElementoEstudiado.getPeriodo();
                    if (!Respuesta.equalsIgnoreCase(propiedad)) {
                        this.Mensaje = "La this.Mensajepuesta correcta es " + pregunta.ElementoEstudiado.getPeriodo() + ".";
                        res = false;
                    }
                    break;
                case POR_GRUPO_RO:
                    propiedad = "" + pregunta.ElementoEstudiado.getGrupo();
                    if (!Respuesta.equalsIgnoreCase(propiedad)) {
                        this.Mensaje = "La respuesta correcta es " + pregunta.ElementoEstudiado.getGrupo() + ".";
                        res = false;
                    }
                    break;
                case POR_GRUPO_AR:
                    propiedad = "" + pregunta.ElementoEstudiado.getGrupo().getNumGrupo();
                    if (!Respuesta.equalsIgnoreCase(propiedad)) {
                        this.Mensaje = "La respuesta correcta es " + pregunta.ElementoEstudiado.getGrupo().getNumGrupo() + ".";
                        res = false;
                    }
                    break;
                case POR_CLASIFICACION:
                    propiedad = "" + pregunta.ElementoEstudiado.getClasificacion();
                    if (!Respuesta.equalsIgnoreCase(propiedad)) {
                        this.Mensaje = "La respuesta correcta es " + pregunta.ElementoEstudiado.getClasificacion() + ".";
                        res = false;
                    }
                    break;
                case POR_PESOA:
                    propiedad = "" + pregunta.ElementoEstudiado.getPesoA();
                    if (!Respuesta.equalsIgnoreCase(propiedad)) {
                        this.Mensaje = "La respuesta correcta es " + pregunta.ElementoEstudiado.getPesoA() + ".";
                        res = false;
                    }
                    break;
                case POR_ELECTRO:
                    propiedad = "" + pregunta.ElementoEstudiado.getElectronegatividad();
                    if (!Respuesta.equalsIgnoreCase(propiedad)) {
                        this.Mensaje = "La respuesta correcta es " + pregunta.ElementoEstudiado.getElectronegatividad() + ".";
                        res = false;
                    }
                    break;
                default:
                    break;
            }
            
        return res;
    }
    
}
