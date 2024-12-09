/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Direccion;
import modelo.Profesor;

/**
 *
 * @author Carlos
 */
public class Main {
    public static void main(String[] args) {
        
        Direccion d1= new Direccion("Bonilla y Salinas", "Ibarra", 4472, "Ecuador");
        
        Profesor p1=new Profesor("Inspección", "Carlos", "Bedoya", 2101288765, d1);
        
        System.out.println(p1.toString());
        
        p1.identificacion();
    }   
    
}
