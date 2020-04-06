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
public class Receta {
    
    private Medicina[] medicinas;

    public Receta(int cantidad) throws Exception 
    {
        if(cantidad>3 || cantidad<0)
            throw new Exception("No se puede ingresar esa cantidad de medicamentos");
        
        medicinas=new Medicina[cantidad];
        
    }

    Receta() {
    }

    public Medicina[] getMedicinas() {
        return medicinas;
    }
    public void agregarReceta(Medicina m,int posicion) throws Exception{
    
    if(posicion>medicinas.length || posicion<0){
    throw new Exception("No se puede ingresar esa cantidad");
    }
    if(medicinas==null){
    throw new Exception("No se ha dado un indice");
    }
    
    this.medicinas[posicion]=m;
    
    }
    public void setMedicinas(Medicina[] medicinas) {
        this.medicinas = medicinas;
    }
    public String recorrerMedicinas(){
    String msg="";
    
        for (int i = 0; i < medicinas.length; i++) {
            msg+=medicinas[i].getNombre()+",";
        }
    return msg;
    
    }
    @Override
    public String toString() {
        return "Receta{" + "medicinas=" + recorrerMedicinas()+ '}';
    }

    
    
    
    
    
}
