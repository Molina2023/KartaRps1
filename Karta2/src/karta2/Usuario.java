/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karta2;

import java.io.Serializable;
import java.util.ArrayList;

public class Usuario implements Serializable{
    //esta clase implements Serializable, la usaremos para guardar los archivos
    String nombreUsuario;
    String contraseña;
    int medallas_ORO;
    int medallas_PLATA;
    int medallas_BRONCE;
    ArrayList<String> logros = new ArrayList<String>();
    
    public Usuario (String nombreUsuario, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }
    
    
    
}
