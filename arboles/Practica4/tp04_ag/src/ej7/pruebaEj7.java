/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7;

import ej5.AreaEmpresa;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

/**
 *
 * @author Cocalibur
 */
public class pruebaEj7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        ArbolGeneral<String> a12 = new ArbolGeneral('M');
        ArbolGeneral<String> a13 = new ArbolGeneral('N');
        ListaGenerica<ArbolGeneral<String>> hijos5 = new ListaEnlazadaGenerica();   //HIJOS DE LA RAIZ (J)
        hijos5.agregarFinal(a12);
        hijos5.agregarFinal(a13);
        
        ArbolGeneral<String> a11 = new ArbolGeneral('L');
        ListaGenerica<ArbolGeneral<String>> hijos4 = new ListaEnlazadaGenerica();   //HIJOS DE LA RAIZ (G)
        hijos4.agregarFinal(a11);
        
        
        ArbolGeneral<String> a7 = new ArbolGeneral('H');
        ArbolGeneral<String> a8 = new ArbolGeneral('I');
        ArbolGeneral<String> a9 = new ArbolGeneral('J', hijos5);
        ArbolGeneral<String> a10 = new ArbolGeneral('K');
        ListaGenerica<ArbolGeneral<String>> hijos3 = new ListaEnlazadaGenerica();   //HIJOS DE LA RAIZ (D)
        hijos3.agregarFinal(a7);
        hijos3.agregarFinal(a8);
        hijos3.agregarFinal(a9);
        hijos3.agregarFinal(a10);
        
        
        ArbolGeneral<String> a5 = new ArbolGeneral('F');
        ArbolGeneral<String> a6 = new ArbolGeneral('G', hijos4);
        ListaGenerica<ArbolGeneral<String>> hijos2 = new ListaEnlazadaGenerica();   //HIJOS DE LA RAIZ (C)
        hijos2.agregarFinal(a5);
        hijos2.agregarFinal(a6);
        
        ArbolGeneral<String> a1 = new ArbolGeneral('B');
        ArbolGeneral<String> a2 = new ArbolGeneral('C', hijos2);
        ArbolGeneral<String> a3 = new ArbolGeneral('D', hijos3);
        ArbolGeneral<String> a4 = new ArbolGeneral('E');
        ListaGenerica<ArbolGeneral<String>> hijos = new ListaEnlazadaGenerica();   //HIJOS DE LA RAIZ (A)
        hijos.agregarFinal(a1);
        hijos.agregarFinal(a2);
        hijos.agregarFinal(a3);
        hijos.agregarFinal(a4);
        
        ArbolGeneral<String> a = new ArbolGeneral('A', hijos);  //RAIZ
        
        RedDeAguaPotable red = new RedDeAguaPotable(a);
        System.out.println(red.minimoCaudal(1000.0));
        
    }
    
}
