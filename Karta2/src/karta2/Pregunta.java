/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karta2;

public class Pregunta {
    //Esta es la clase Pregunta, solo tiene dos propiedades:
    //Solo se necesita de estas dos cosas para saber la pregunta, la respuesta, poder validarlo, etc
    
    Elemento ElementoEstudiado;
    Enum.TipoPregunta TipoPregunta;

    public Elemento getElementoJugando() {
        return ElementoEstudiado;
    }

    public Enum.TipoPregunta getTipoPregunta() {
        return TipoPregunta;
    }
    
    
    
}
