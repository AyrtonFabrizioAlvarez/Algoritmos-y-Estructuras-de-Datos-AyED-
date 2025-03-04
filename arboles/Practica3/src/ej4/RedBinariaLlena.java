/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;
import tp03.ejercicio1.*;
import tp02.ejercicio2.*;
/**
 *
 * @author Cocalibur
 */
public class RedBinariaLlena {
    private ArbolBinario <Integer> A; 
    
    public RedBinariaLlena(ArbolBinario <Integer> unArbol){
        this.A = unArbol;
    }
    
    public int retardoReenvio(){
        return retardoReenvio(A);
    }
    
    
    private int retardoReenvio(ArbolBinario<Integer>arbol){
        if (arbol.esVacio()) {
            return 0;
        }
        else{
            if (!arbol.esHoja()) {
                return arbol.getDato() + Math.max(retardoReenvio(arbol.getHijoIzquierdo()), retardoReenvio(arbol.getHijoDerecho()));
            }
            else{
                return arbol.getDato();
            }
        }
    }
}
