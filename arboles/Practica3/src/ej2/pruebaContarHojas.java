/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;
import tp02.ejercicio2.*;
import tp03.ejercicio1.*;
/**
 *
 * @author Cocalibur
 */
public class pruebaContarHojas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolBinario <Integer> A = new ArbolBinario();
        

        ArbolBinario <Integer> HI = new ArbolBinario(20);
        ArbolBinario <Integer> HD = new ArbolBinario(30);
        ArbolBinario <Integer> HI21 = new ArbolBinario(40);
        ArbolBinario <Integer> HI22 = new ArbolBinario(45);
        ArbolBinario <Integer> HD21 = new ArbolBinario(50);
        ArbolBinario <Integer> HD22 = new ArbolBinario(55);
        
        A.agregarHijoIzquierdo(HI);
        HI.agregarHijoIzquierdo(HI21);
        HI.agregarHijoDerecho(HD21);
        
        A.agregarHijoDerecho(HD);
        HD.agregarHijoIzquierdo(HI22);
        HD.agregarHijoDerecho(HD22);
        
        System.out.println(A.contarHojas());

        
        
    }
    
}
