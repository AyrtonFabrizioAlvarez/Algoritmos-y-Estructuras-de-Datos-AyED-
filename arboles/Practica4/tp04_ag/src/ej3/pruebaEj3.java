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
public class pruebaEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolGeneral<Integer> a1 = new ArbolGeneral<Integer>(5);
        ArbolGeneral<Integer> a2 = new ArbolGeneral<Integer>(1);
        ArbolGeneral<Integer> a3 = new ArbolGeneral<Integer>(3);
        ListaGenerica<ArbolGeneral<Integer>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
        hijos.agregarFinal(a1);
        hijos.agregarFinal(a2);
        hijos.agregarFinal(a3);
        ArbolGeneral<Integer> a = new ArbolGeneral<Integer>(7, hijos);
        
        RecorridosAG recorrido = new RecorridosAG();
        System.out.println("RECORRIDO PREORDEN");
        imprimir(recorrido.numerosImparesMayoresQuePreOrden(a, 1));
        System.out.println("");
        System.out.println("");
        System.out.println("RECORRIDO INORDEN");
        imprimir(recorrido.numerosImparesMayoresQueInOrden(a, 1));
        System.out.println("");
        System.out.println("");
        System.out.println("RECORRIDO POSTORDEN");
        imprimir(recorrido.numerosImparesMayoresQuePostOrden(a, 1));
        System.out.println("");
        System.out.println("");
        System.out.println("RECORRIDO POR NIVELES");
        imprimir(recorrido.numerosImparesMayoresQuePorNiveles(a, 1));
    }
    
    public static void imprimir(ListaGenerica<Integer> L){
        L.comenzar();
        while (!L.fin()) {
            System.out.println(L.proximo());
        }
    }
    
}
