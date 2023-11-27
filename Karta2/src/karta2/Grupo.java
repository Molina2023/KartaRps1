/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package karta2;

/**
 *
 * @author nisit
 */
public enum Grupo {
    IA(1),
    IIA(2),
    IIIB(3),
    IVB(4),
    VB(5),
    VIB(6),
    VIIB(7),
    VIIIB(8),
    IB(9),
    IIB(10),
    IIIA(11),
    IVA(12),
    VA(13),
    VIA(14),
    VIIA(15),
    VIIIA(16);

    public int getNum() {
        return num;
    }
    
    private Grupo (int num) {
        this.num = num;
    }
            
    private int num;
    
}