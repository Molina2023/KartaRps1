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
    VIIIB_8(8),
    VIIIB_9(9),
    VIIIB_10(10),
    IB(11),
    IIB(12),
    IIIA(13),
    IVA(14),
    VA(15),
    VIA(16),
    VIIA(17),
    VIIIA(18);

    public int getNum() {
        return num;
    }
    
    private Grupo (int num) {
        this.num = num;
    }
            
    private int num;
    
}