/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package karta2;

public enum Pregunta {
    POR_SIMBOLO(1),
    POR_PERIODO(2),
    POR_GRUPO(3),
    POR_CLASIFICACION(4),
    POR_PESOA(5),
    POR_ELECTRO(6);

    public int getNum() {
        return num;
    }
    
    Pregunta (int num) {
        this.num = num;
    }
            
    public int num;
}
