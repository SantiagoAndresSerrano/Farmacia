/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author santi
 */
public class ListaS<T> {
    private Nodo<T> cabeza=null;
    private int tam=0;

    public ListaS() {
    }
    
    public void insertarAlInicio(T info){
   
        
        Nodo<T> temp = this.cabeza;
        cabeza = new Nodo<T>(info, temp);
        tam++;
    }
    
    public int getTam(){
        return this.tam;
    }
    
   public T get(int pos){
   
       try{
       Nodo<T> nodoPedido=this.getPos(pos);
       return nodoPedido.getInfo();
       }catch(Exception e){
       return null;
       
       }
   
   }
   
   private Nodo<T> getPos(int pos){
   
   Nodo<T> t=this.cabeza;
   while(pos>0){
       
       t=t.getSig();
       pos--;
   }
   return t;
   }
    
    public String toString(){
        
        String msg="";
        Nodo<T> temp=cabeza;
        
        while(temp!=null){

            msg+=temp.getInfo();
            temp=temp.getSig();
        }
        
        return msg;
    }
}
