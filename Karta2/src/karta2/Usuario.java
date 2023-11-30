/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karta2;

import java.io.Serializable;
import java.util.ArrayList;

public class Usuario implements Serializable{
    String nombreUsuario;
    String contraseña;
    int medallas_ORO;
    int medallas_PLATA;
    int medallas_BRONCE;
    String logros;
    public Usuario(String nombreUsuario, String contraseña, int medallas_ORO, int medallas_PLATA, int medallas_BRONCE, String logros) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.medallas_ORO = medallas_ORO;
        this.medallas_PLATA = medallas_PLATA;
        this.medallas_BRONCE = medallas_BRONCE;
        this.logros = logros;
    }
    public Usuario (String nombreUsuario, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }
    
    
    
}
