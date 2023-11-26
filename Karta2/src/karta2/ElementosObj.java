/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karta2;

import java.util.ArrayList;


public class ElementosObj {
    ArrayList<Elemento> arrayEle = new ArrayList<Elemento>();
    
    
    public ElementosObj (){
    
    }
    void Load (){
        arrayEle.add(new Elemento (1, "H", "el Hidrógeno", Periodo.PERIODO1, Grupo.IA, "gas", 1.008, 2.1));
        
    }
    
}
