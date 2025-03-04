/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

/**
 *
 * @author Cocalibur
 */
public class pruebaEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
            TENEMOS UN ARBOL
        
                7    
                |    
                5 - 1 - 3
                |       |
                44      11 - 12 - 21 - 22
        */
        
        
        ArbolGeneral<Integer> a8 = new ArbolGeneral<Integer>(44);
        ListaGenerica<ArbolGeneral<Integer>> hijos3 = new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();   //HIJOS DE LA RAIZ (5)
        ArbolGeneral<Integer> a4 = new ArbolGeneral<Integer>(11);
        ArbolGeneral<Integer> a5 = new ArbolGeneral<Integer>(12);
        ArbolGeneral<Integer> a6 = new ArbolGeneral<Integer>(21);
        ArbolGeneral<Integer> a7 = new ArbolGeneral<Integer>(22);
        ListaGenerica<ArbolGeneral<Integer>> hijos2 = new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();   //HIJOS DE LA RAIZ (3)
        hijos2.agregarFinal(a4);
        hijos2.agregarFinal(a5);
        hijos2.agregarFinal(a6);
        hijos2.agregarFinal(a7);
        ArbolGeneral<Integer> a1 = new ArbolGeneral<Integer>(5, hijos3);
        ArbolGeneral<Integer> a2 = new ArbolGeneral<Integer>(1);
        ArbolGeneral<Integer> a3 = new ArbolGeneral<Integer>(3, hijos2);
        ListaGenerica<ArbolGeneral<Integer>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();   //HIJOS DE LA RAIZ (7)
        hijos.agregarFinal(a1);
        hijos.agregarFinal(a2);
        hijos.agregarFinal(a3);
        ArbolGeneral<Integer> a = new ArbolGeneral<Integer>(7, hijos);  //RAIZ
        
        System.out.println("Altura del arbol: " + a.altura());
        System.out.println("");
        System.out.println("Nivel de profundidad del valor 11: " + a.nivel2(11));
        System.out.println("");
        System.out.println("Ancho del arbol: " + a.ancho());
    }
    
}
