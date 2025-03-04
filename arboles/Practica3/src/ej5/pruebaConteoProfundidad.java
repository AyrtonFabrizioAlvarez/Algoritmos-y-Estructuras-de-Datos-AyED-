/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5;
import tp03.ejercicio1.*;
/**
 *
 * @author Cocalibur
 */
public class pruebaConteoProfundidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolBinario <Integer> A = new ArbolBinario(1);     //NIVEL 0
        

        ArbolBinario <Integer> HI = new ArbolBinario(2);    //NIVEL 1
        ArbolBinario <Integer> HD = new ArbolBinario(3);
        
        ArbolBinario <Integer> HI21 = new ArbolBinario(4);  //NIVEL 2
        ArbolBinario <Integer> HD21 = new ArbolBinario(6);
        ArbolBinario <Integer> HI22 = new ArbolBinario(5);
        ArbolBinario <Integer> HD22 = new ArbolBinario(7);
        
        A.agregarHijoIzquierdo(HI);
        HI.agregarHijoIzquierdo(HI21);
        HI.agregarHijoDerecho(HD21);
        
        A.agregarHijoDerecho(HD);
        HD.agregarHijoIzquierdo(HI22);
        HD.agregarHijoDerecho(HD22);
        
        
        ProfundidadDeArbolBinario conteo = new ProfundidadDeArbolBinario(A);
        System.out.println(conteo.sumaElementosProfundidad(1));
    }
    
}
