/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej21;
import tp02.ejercicio2.*;
/**
 *
 * @author Cocalibur
 */
public class ej21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaEnlazadaGenerica <Integer> L = new ListaEnlazadaGenerica();
        
        for (int i = 0; i < 10; i++) {
            L.agregarFinal(i);
        }
        
        L.comenzar();
        while (!L.fin()) {
            System.out.println(L.proximo());
        }
    }
    
}
