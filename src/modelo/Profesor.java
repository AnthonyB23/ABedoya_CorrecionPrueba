/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Carlos
 */
public class Profesor {
    private String calle;
    private String ciudad;
    private int codPostal;
    private String pais;

    public Profesor() {
    }

    public Profesor(String calle, String ciudad, int codPostal, Stgring pais) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codPostal = codPostal;
        this.pais = pais;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "LA DIRECCIÓN ES:"+"\n"+
                "Calle:"+getCalle()+"\n"+
                "Ciudad:"+getCiudad()+"\n"+
                "Código Postal"+getCodPostal()+"\n"+
                "País:"+getPais();
    }
    
    
    
    
}
