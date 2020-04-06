/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Util.ListaS;

/**
 *
 * @author santi
 */
public class Usuario {
    
    private String nombre;
    private String idenficiacion;
   
    private ListaS<Receta> recetas;

    public Usuario() {
       
    }
    
    public void despacharReceta(Receta receta){
    recetas.insertarAlInicio(receta);
    }
    
    public Usuario(String nombre, String idenficiacion) {
         recetas=new ListaS();
        this.nombre = nombre;
        this.idenficiacion = idenficiacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdenficiacion() {
        return idenficiacion;
    }

    public void setIdenficiacion(String idenficiacion) {
        this.idenficiacion = idenficiacion;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + idenficiacion + '}';
    }
    
    
    
}
