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
            numerosImparesPreOrden(L, a, n);
        }
        return L;
    }
    
    private void numerosImparesPreOrden(ListaGenerica<Integer> L, ArbolGeneral<Integer> A, Integer n){
        if ( (A.getDato() % 2 == 1) && (A.getDato() > n) ){
            L.agregarFinal(A.getDato());
        }
        if (A.tieneHijos()) {
            ListaGenerica<ArbolGeneral<Integer>> hijos = A.getHijos();
            hijos.comenzar();
            while(!hijos.fin()){
                numerosImparesPreOrden(L, hijos.proximo(), n);
            }
        }
    }
    
    //RECORRIDO
    public ListaGenerica< Integer > numerosImparesMayoresQueInOrden (ArbolGeneral<Integer> a, Integer n){
        ListaGenerica<Integer> L = new ListaEnlazadaGenerica<Integer>();
        if (!a.esVacio()) {
            numerosImparesInOrden(L, a, n);
        }
        return L;
    }
    
    private void numerosImparesInOrden(ListaGenerica<Integer> L, ArbolGeneral<Integer> A, Integer n){
        if (A.tieneHijos()) {
            ListaGenerica<ArbolGeneral<Integer>> hijos = A.getHijos();
            
            //VOY A ANALIZAR EL HIJO MAS IZQUIERDO
            hijos.comenzar();
            numerosImparesInOrden(L, hijos.proximo(), n);
            
            //VOY A ANALIZAR LA RAIZ
            if ( (A.getDato() % 2 == 1) && (A.getDato() > n) ) {
                L.agregarFinal(A.getDato());
            }
            
            //ANALIZO EL RESTO DE LOS HIJOS
            while (!hijos.fin()) {
                numerosImparesInOrden(L, hijos.proximo(), n);
            }
        }
        else{
            if ( (A.getDato() % 2 == 1) && (A.getDato() > n) ) {
                L.agregarFinal(A.getDato());
            }
        }
    }
    
    public ListaGenerica<Integer> numerosImparesMayoresQuePostOrden (ArbolGeneral<Integer> a, Integer n){
        ListaGenerica<Integer> L = new ListaEnlazadaGenerica();
        if (!a.esVacio()) {
            numerosImparesPostOrden(L, a, n);
        }
        return L;
    }
    
    private void numerosImparesPostOrden(ListaGenerica<Integer> L, ArbolGeneral<Integer> A, Integer n){
        if (A.tieneHijos()) {
            ListaGenerica<ArbolGeneral<Integer>> hijos = A.getHijos();
            hijos.comenzar();
            while (!hijos.fin()) {
                numerosImparesPostOrden(L, hijos.proximo(), n);
            }
        }
        if ( (A.getDato() % 2 == 1) && (A.getDato() > n) ) {
                L.agregarFinal(A.getDato());
            }
    }
    
}
