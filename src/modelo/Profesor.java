/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Carlos
 */
public class Profesor extends Persona {
    private String despacho;

    public Profesor() {
    }

    public Profesor(String despacho) {
        this.despacho = despacho;
    }

    public Profesor(String despacho, String nombre, String apellido, int cedula, Direccion direccion) {
        super(nombre, apellido, cedula, direccion);
        this.despacho = despacho;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    @Override
    public String toString() {
        return "DATOS DEL PROFESOR:"+"\n"+
                "Nombre: "+getNombre()+"\n"+
                "Apellido:"+getApellido()+"\n"+
                "Cédula: "+getCedula()+"\n"+
                "Direccion: "+getDireccion()+"\n"+
                "Despacho: "+getDespacho();
                
    }
    
    @Override
    public void identificacion() {
        System.out.println("Nombre de la clase es: Profesor");
    }
    
    
    
}
