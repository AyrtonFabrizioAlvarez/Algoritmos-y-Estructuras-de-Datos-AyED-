/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;
import tp02.ejercicio2.*;
import tp04.ejercicio1.*;
/**
 *
 * @author Cocalibur
 */
public class RecorridosAG {
    
    //RECORRIDO PREORDEN
    public ListaGenerica<Integer> numerosImparesMayoresQuePreOrden (ArbolGeneral<Integer> a, Integer n){
        ListaGenerica<Integer> L = new ListaEnlazadaGenerica<Integer>();
        if (!a.esVacio()) {
            numerosImpares(L, a, n);
        }
        return L;
    }
    
    private void numerosImpares(ListaGenerica<Integer> L, ArbolGeneral<Integer> A, Integer n){
        if ( (A.getDato() % 2 == 1) && (A.getDato() > n) ){
            L.agregarFinal(A.getDato());
        }
        if (A.tieneHijos()) {
            ListaGenerica<ArbolGeneral<Integer>> hijos = A.getHijos();
            hijos.comenzar();
            while(!hijos.fin()){
                numerosImpares(L, hijos.proximo(), n);
            }
        }      
    }
    
    //RECORRIDO
    public ListaGenerica< Integer > numerosImparesMayoresQueInOrden (ArbolGeneral<Integer> a, Integer n){
        
    }
    
}
