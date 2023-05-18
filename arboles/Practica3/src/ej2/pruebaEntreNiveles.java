/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

import tp03.ejercicio1.ArbolBinario;

/**
 *
 * @author Cocalibur
 */
public class pruebaEntreNiveles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolBinario <Integer> A = new ArbolBinario(10);
        

        ArbolBinario <Integer> HI = new ArbolBinario(20);
        ArbolBinario <Integer> HD = new ArbolBinario(30);
        ArbolBinario <Integer> HI21 = new ArbolBinario(40);
        ArbolBinario <Integer> HI22 = new ArbolBinario(50);
        ArbolBinario <Integer> HD21 = new ArbolBinario(60);
        ArbolBinario <Integer> HD22 = new ArbolBinario(75);
        
        A.agregarHijoIzquierdo(HI);
        HI.agregarHijoIzquierdo(HI21);
        HI.agregarHijoDerecho(HD21);
        
        A.agregarHijoDerecho(HD);
        HD.agregarHijoIzquierdo(HI22);
        HD.agregarHijoDerecho(HD22);
        
        
        A.entreNiveles(0, 1);
        //System.out.println(A.getAltura());
    }
    
}
