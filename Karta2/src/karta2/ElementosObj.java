/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karta2;

import java.util.ArrayList;


public class ElementosObj {
    ArrayList<Elemento> arrayEle = new ArrayList<Elemento>();
    
    
    public ElementosObj (){
        arrayEle.add(new Elemento (1, "H", "el Hidrógeno", Periodo.PERIODO1, Grupo.IA, "gas", 1.008, 2.1));
        arrayEle.add(new Elemento (1, "H", "el Hidrógeno", Periodo.PERIODO1, Grupo.IA, "gas", 1.008, 2.1));
    }
    
    private Preguntas DeterminarElemento(){
        int numElemento = (int) (Math.random() * 0);
        int tipoPregunta = (int) (Math.random() * 6);
        System.out.println(tipoPregunta);
        Preguntas item = new Preguntas();
        item.ElementFind = arrayEle.get(0);
        item.QuestionType = Pregunta.values()[tipoPregunta];
        return item;
    }
    
    public ArrayList<Preguntas> DeterminarPregunta (int numPreguntas) {
        ArrayList<Preguntas> item = new ArrayList<Preguntas>();
        
        for (int i = 0; i < numPreguntas; i++) {
            item.add(DeterminarElemento());
            System.out.println(item.get(i).getElementFind());
            System.out.println(item.get(i).getQuestionType());
        }
        return item;
    }
    
    
}
