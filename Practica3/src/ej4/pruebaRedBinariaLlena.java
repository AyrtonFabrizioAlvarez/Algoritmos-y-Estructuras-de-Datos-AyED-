/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;

import tp03.ejercicio1.ArbolBinario;

/**
 *
 * @author Cocalibur
 */
public class pruebaRedBinariaLlena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolBinario <Integer> A = new ArbolBinario(1);
        

        ArbolBinario <Integer> HI = new ArbolBinario(2);
        ArbolBinario <Integer> HD = new ArbolBinario(3);
        
        ArbolBinario <Integer> HI21 = new ArbolBinario(4);
        ArbolBinario <Integer> HD21 = new ArbolBinario(6);
        ArbolBinario <Integer> HI22 = new ArbolBinario(5);
        ArbolBinario <Integer> HD22 = new ArbolBinario(7);
        
        A.agregarHijoIzquierdo(HI);
        HI.agregarHijoIzquierdo(HI21);
        HI.agregarHijoDerecho(HD21);
        
        A.agregarHijoDerecho(HD);
        HD.agregarHijoIzquierdo(HI22);
        HD.agregarHijoDerecho(HD22);
        
        RedBinariaLlena red = new RedBinariaLlena(A);
        System.out.println(red.retardoReenvio());
    }
    
}
