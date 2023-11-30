/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karta2;

public class PreguntaRespuesta {
    Preguntas ElementoJugando;
    Preguntas TipoPregunta;
    boolean Es_Correcta;
    String ResUsuario;
    boolean Es_Respuesta;
    Enum.Dificultad Dificultad;

    public Preguntas getElementoJugando() {
        return ElementoJugando;
    }

    public Preguntas getTipoPregunta() {
        return TipoPregunta;
    }

    public boolean isEs_Correcta() {
        return Es_Correcta;
    }

    public String getResUsuario() {
        return ResUsuario;
    }

    public boolean isEs_Respuesta() {
        return Es_Respuesta;
    }

    public Enum.Dificultad getDificultad() {
        return Dificultad;
    }
    
    
    
}
