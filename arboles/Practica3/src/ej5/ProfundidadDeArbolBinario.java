/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5;
import tp03.ejercicio1.*;
import tp02.ejercicio3.*;
/**
 *
 * @author Cocalibur
 */
public class ProfundidadDeArbolBinario {
    private ArbolBinario <Integer> A;
    
    public ProfundidadDeArbolBinario(ArbolBinario<Integer> unArbol){
        this.A = unArbol;
    }
    
    public ArbolBinario getArbol(){
        return this.A;
    }
    
    public int sumaElementosProfundidad(int p){
        return sumaElementosProfundidad(this.getArbol(), p);
    }
    
    private int sumaElementosProfundidad(ArbolBinario<Integer> A, int p){
        int nivel = 0;
        int total = 0;
        ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica();
        ArbolBinario<Integer> arbol = null;
        cola.encolar(A);
        cola.encolar(null);
        while ( (!cola.esVacia()) && (nivel <= p) ) {
            arbol = cola.desencolar();
            if (arbol != null) {
                if (nivel == p) {
                    total += arbol.getDato();
                }
                if (arbol.tieneHijoIzquierdo()) {
                    cola.encolar(arbol.getHijoIzquierdo());
                }
                if (arbol.tieneHijoDerecho()) {
                    cola.encolar(arbol.getHijoDerecho());
                }
            }
            else if (!cola.esVacia()){
                cola.encolar(null);
                nivel++;
            }
        }
        return total;
    }
}
