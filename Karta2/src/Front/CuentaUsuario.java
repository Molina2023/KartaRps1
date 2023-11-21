/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Front;

import java.io.Serializable;

/**
 *
 * @author Isis
 */
public class CuentaUsuario implements Serializable{
    String nombre,passw;
    public CuentaUsuario (String nombre, String passw){
        this.nombre=nombre;
        this.passw=passw;
    }
}
