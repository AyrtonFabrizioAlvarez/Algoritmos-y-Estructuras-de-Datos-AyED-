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
public class ColaGenerica<T> {
    private ListaEnlazadaGenerica<T> cola;
    
    public ColaGenerica(){
        this.cola = new ListaEnlazadaGenerica();
    }
    
    public void encolar(T element){        
        this.cola.agregarFinal(element);
    }
    
    public T desencolar(){
        if (!this.cola.esVacia()) {
            T aux = this.cola.elemento(1); 
            this.cola.eliminarEn(1);
            return aux;            
        }
        else{
            return null;
        }
    }
    
    public T tope(){
        if (!this.cola.esVacia()) {  
            return this.cola.elemento(this.cola.tamanio());
        }
        else{
            return null;
        }
    }
    
    public boolean esVacia(){
        return this.cola.esVacia();
    }
}
