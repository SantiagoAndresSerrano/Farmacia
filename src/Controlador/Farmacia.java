/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Medicina;
import Modelo.Receta;
import Modelo.Usuario;
import Util.ListaS;
import javax.swing.JOptionPane;

/**
 *
 * @author santi
 */
public class Farmacia 
{
    ListaS<Receta> recetas;
    ListaS<Usuario> usuario;
    int dias=0;
     
    public Farmacia()
    {
        recetas=new ListaS();
        usuario=new ListaS();
    }
    
    public void despacho() throws Exception
    {
    final int DIAS=5;
    final int SEMANAS=4;
  
        for (int i = 0; i < SEMANAS; i++) 
        {   
            
            for (int j = 0; j < DIAS; j++) {
                JOptionPane.showMessageDialog(null,"Dia: "+(j+1)+" Semana: "+(i+1));
                diaSiguiente();
            }
            
            
        }
    
    
    }
    
    public boolean diaSiguiente() throws Exception
    {
        ListaS<Usuario> usuariosDia=new ListaS();
        int cantidadRecetas=0;
       int salida=Integer.parseInt(JOptionPane.showInputDialog("Si desea saltarse el dia presione 0 de lo contrario presione 1"));
       
       if(salida==0)
       {
           dias++;
       }
        while(salida==1)
        {
            
            if(cantidadRecetas>100)
            {
                throw new Exception("Solo se pueden despachar 100 recetas por dia");  
            }
        
        
        
        String cedula=JOptionPane.showInputDialog("Ingrese su cedula");
        String nombre=JOptionPane.showInputDialog("Ingrese su Nombre");
        
        if(this.buscarCedula(usuariosDia, cedula)){
            throw new Exception("Solo puede hacer un despacho por dia");
        }
        
        Usuario u=new Usuario(nombre,cedula);         
        int cantidadMedicamentos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de medicamentos"));
        
        if(cantidadMedicamentos<=0 || cantidadMedicamentos>3)
        {
        throw new Exception("No se puede ingresar esa cantidad de medicamentos");
        }
        
        Receta receta=new Receta(cantidadMedicamentos);
        
        
        cantidadRecetas++;
        
        int i=0;
        while(i<cantidadMedicamentos)
        {
            String nombreMed=JOptionPane.showInputDialog("Nombre del medicamento "+(i+1));
            receta.agregarReceta(new Medicina(nombreMed), i);
            i++;
        }
        
        u.despacharReceta(receta);
        JOptionPane.showMessageDialog(null, "Receta despachada "+receta.recorrerMedicinas()+" al usuario "+u.getNombre());
        
        recetas.insertarAlInicio(receta);
        usuariosDia.insertarAlInicio(u);
        usuario.insertarAlInicio(u);
        salida=Integer.parseInt(JOptionPane.showInputDialog("Escriba 0 para ingresar al dia siguiente y 1 para continuar\nDia:"+(dias+1)));
        }
        
        dias++;
       
       return true; 
    }
    
    
    
    public Boolean buscarCedula( ListaS<Usuario> usuariosDia,String cedula){
    
        for (int i = 0; i < usuariosDia.getTam(); i++) {
            if(usuariosDia.get(i).getIdenficiacion().equals(cedula))
                return true;
        }
        
        
    return false;
    }
}
