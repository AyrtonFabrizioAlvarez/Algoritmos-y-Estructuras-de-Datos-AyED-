/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio1;
import tp02.ejercicio2.*;
/**
 *
 * @author Coco
 */
public class ContarArbol {
    private ArbolBinario<Integer> A;
    
    public ContarArbol(ArbolBinario <Integer> arbolContar){
         this.A = arbolContar;
    }
    
    public ListaEnlazadaGenerica<Integer> numerosPares(){
        ListaEnlazadaGenerica<Integer> L = new ListaEnlazadaGenerica();
        contarPares(L, this.A);
        return L;
    }

    private ListaEnlazadaGenerica<Integer> contarPares(ListaEnlazadaGenerica<Integer> L, ArbolBinario<Integer> A){
    if (A.esVacio()){
        return null;
    }
    else{       
        if(A.tieneHijoIzquierdo()){
            L = contarPares(L, A.getHijoIzquierdo());
        }
        if(A.getDato() % 2 == 0){
            L.agregarFinal(A.getDato());
        }
        if(A.tieneHijoDerecho()){
            L = contarPares(L, A.getHijoDerecho());
        } 
    }
    return L;
    }
}
