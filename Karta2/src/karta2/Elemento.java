/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karta2;

import java.io.Serializable;

public class Elemento implements Serializable{
    int numA;
    String simbolo;
    String nombre;
    Enum.Periodo periodo;
    Enum.Grupo grupo;
    String clasificacion;
    double pesoA;
    double electronegatividad;

    public Elemento(int numA, String simbolo, String nombre, Enum.Periodo periodo, Enum.Grupo grupo, String clasificacion, double pesoA, double electronegatividad) {
        this.numA = numA;
        this.simbolo = simbolo;
        this.nombre = nombre;
        this.periodo = periodo;
        this.grupo = grupo;
        this.clasificacion = clasificacion;
        this.pesoA = pesoA;
        this.electronegatividad = electronegatividad;
    }

    public int getNumA() {
        return numA;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public double getPesoA() {
        return pesoA;
    }

    public double getElectronegatividad() {
        return electronegatividad;
    }

    public Enum.Periodo getPeriodo() {
        return periodo;
    }

    public Enum.Grupo getGrupo() {
        return grupo;
    }

    
    
}
