/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author santi
 */
public class Medicina 

{
    private String nombre;

    
    public Medicina(){}
    
    public Medicina(String nombre) {
        this.nombre = nombre;
      
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    @Override
    public String toString() {
        return "Medicina{" + "nombre=" + nombre+ '}';
    }
    
    
}
