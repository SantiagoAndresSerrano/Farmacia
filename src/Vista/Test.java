/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Farmacia;

/**
 *
 * @author santi
 */
public class Test {
    public static void main(String[] args) throws Exception {
       Farmacia f=new Farmacia();
       try{
       f.despacho();
       }catch(Exception e){
       
           System.out.println(e.getMessage());
       }
    }
}
