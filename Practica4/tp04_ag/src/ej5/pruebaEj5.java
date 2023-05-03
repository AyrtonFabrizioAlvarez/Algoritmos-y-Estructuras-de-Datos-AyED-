/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

/**
 *
 * @author Cocalibur
 */
public class pruebaEj5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        
        AreaEmpresa emp1 = new AreaEmpresa("M", 14);
        AreaEmpresa emp2 = new AreaEmpresa("J", 13);
        AreaEmpresa emp3 = new AreaEmpresa("K", 25);
        AreaEmpresa emp4 = new AreaEmpresa("L", 10);
        AreaEmpresa emp5 = new AreaEmpresa("A", 4);
        AreaEmpresa emp6 = new AreaEmpresa("B", 7);
        AreaEmpresa emp7 = new AreaEmpresa("C", 5);
        AreaEmpresa emp8 = new AreaEmpresa("D", 6);
        AreaEmpresa emp9 = new AreaEmpresa("E", 10);
        AreaEmpresa emp10 = new AreaEmpresa("F", 18);
        AreaEmpresa emp11 = new AreaEmpresa("G", 9);
        AreaEmpresa emp12 = new AreaEmpresa("H", 12);
        AreaEmpresa emp13 = new AreaEmpresa("I", 19);
        
        
        
        ArbolGeneral<AreaEmpresa> a10 = new ArbolGeneral(emp11);
        ArbolGeneral<AreaEmpresa> a11 = new ArbolGeneral(emp12);
        ArbolGeneral<AreaEmpresa> a12 = new ArbolGeneral(emp13);
        ListaGenerica<ArbolGeneral<AreaEmpresa>> hijos4 = new ListaEnlazadaGenerica();   //HIJOS DE LA RAIZ (1)
        hijos4.agregarFinal(a10);
        hijos4.agregarFinal(a11);
        hijos4.agregarFinal(a12);
        
        ArbolGeneral<AreaEmpresa> a7 = new ArbolGeneral(emp8);
        ArbolGeneral<AreaEmpresa> a8 = new ArbolGeneral(emp9);
        ArbolGeneral<AreaEmpresa> a9 = new ArbolGeneral(emp10);
        ListaGenerica<ArbolGeneral<AreaEmpresa>> hijos3 = new ListaEnlazadaGenerica();   //HIJOS DE LA RAIZ (3)
        hijos3.agregarFinal(a7);
        hijos3.agregarFinal(a8);
        hijos3.agregarFinal(a9);
        
        ArbolGeneral<AreaEmpresa> a4 = new ArbolGeneral(emp5);
        ArbolGeneral<AreaEmpresa> a5 = new ArbolGeneral(emp6);
        ArbolGeneral<AreaEmpresa> a6 = new ArbolGeneral(emp7);
        ListaGenerica<ArbolGeneral<AreaEmpresa>> hijos2 = new ListaEnlazadaGenerica();   //HIJOS DE LA RAIZ (5)
        hijos2.agregarFinal(a4);
        hijos2.agregarFinal(a5);
        hijos2.agregarFinal(a6);
        
        ArbolGeneral<AreaEmpresa> a1 = new ArbolGeneral(emp2, hijos2);
        ArbolGeneral<AreaEmpresa> a2 = new ArbolGeneral(emp3, hijos4);
        ArbolGeneral<AreaEmpresa> a3 = new ArbolGeneral(emp4, hijos3);
        ListaGenerica<ArbolGeneral<AreaEmpresa>> hijos = new ListaEnlazadaGenerica();   //HIJOS DE LA RAIZ (7)
        hijos.agregarFinal(a1);
        hijos.agregarFinal(a2);
        hijos.agregarFinal(a3);
        
        ArbolGeneral<AreaEmpresa> a = new ArbolGeneral(emp1, hijos);  //RAIZ
        
        
        AnalizadorArbol analizador = new AnalizadorArbol();
        System.out.println("");
        System.out.println(analizador.devolverMaximoPromedio2(a));
    }
    
}
