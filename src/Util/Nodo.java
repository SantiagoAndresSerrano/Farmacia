/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author santi
 * @param <T>
 */
public class Nodo<T> {
        private T info;
    private Nodo<T> sig;
    
     Nodo(){
        
    }

     Nodo(T info, Nodo<T> sig) {
        this.info = info;
        this.sig = sig;
    }

     T getInfo() {
        return info;
    }

     void setInfo(T info) {
        this.info = info;
    }

     Nodo<T> getSig() {
        return sig;
    }

     void setSig(Nodo<T> sig) {
        this.sig = sig;
    }
    
    
}
