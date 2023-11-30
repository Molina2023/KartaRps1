/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karta2;

import java.util.ArrayList;

/**
 *
 * @author nisit
 */
public class RandomAll {

    public static void main(String[] args) {
        ArrayList<Preguntas> array = new ArrayList<Preguntas>();
        ElementosObj obj = new ElementosObj();
        
        array = obj.DeterminarPreguntaIniciar(10);
    }
    
    
}
