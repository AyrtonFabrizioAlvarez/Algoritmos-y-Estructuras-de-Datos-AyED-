/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

/**
 *
 * @author Cocalibur
 */
public class pruebaej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            /*
            TENEMOS UN ARBOL
        
                7    
                |    
                5 - 1 - 3
                        |
                        11 - 12 - 21 - 22
        */
        
        ArbolGeneral<Integer> a4 = new ArbolGeneral(11);
        ArbolGeneral<Integer> a5 = new ArbolGeneral(12);
        ArbolGeneral<Integer> a6 = new ArbolGeneral(21);
        ArbolGeneral<Integer> a7 = new ArbolGeneral(22);
        ListaGenerica<ArbolGeneral<Integer>> hijos2 = new ListaEnlazadaGenerica();   //HIJOS DE LA RAIZ (3)
        hijos2.agregarFinal(a4);
        hijos2.agregarFinal(a5);
        hijos2.agregarFinal(a6);
        hijos2.agregarFinal(a7);
        ArbolGeneral<Integer> a1 = new ArbolGeneral(5);
        ArbolGeneral<Integer> a2 = new ArbolGeneral(1);
        ArbolGeneral<Integer> a3 = new ArbolGeneral(3, hijos2);
        ListaGenerica<ArbolGeneral<Integer>> hijos = new ListaEnlazadaGenerica();   //HIJOS DE LA RAIZ (7)
        hijos.agregarFinal(a1);
        hijos.agregarFinal(a2);
        hijos.agregarFinal(a3);
        ArbolGeneral<Integer> a = new ArbolGeneral(7, hijos);  //RAIZ
        
        System.out.println(a.esAncestro(7, 5));
    }
    
}
