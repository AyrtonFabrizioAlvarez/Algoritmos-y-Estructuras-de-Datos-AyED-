/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02.ejercicio3;
import tp02.ejercicio2.*;
/**
 *
 * @author Coco
 */
public class PilaGenerica<T> {
    private ListaEnlazadaGenerica<T> pila;
    
    public PilaGenerica(){
        this.pila = new ListaEnlazadaGenerica();
    }
    
    public void apilar(T element){
        this.pila.agregarFinal(element);
    }
    
    public T desapilar(){
        if (!this.pila.esVacia()) {
            T aux = this.pila.elemento(this.pila.tamanio());
            this.pila.eliminarEn(this.pila.tamanio());
            return aux;    
        }
        else{
            return null;
        }
        
    }
    
    public T tope(){
        return this.pila.elemento(this.pila.tamanio());
    }
    
    public boolean esVacia(){
        return this.pila.esVacia();
    }
}
