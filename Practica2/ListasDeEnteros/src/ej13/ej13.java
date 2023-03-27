/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej13;
import tp02.ejercicio1.ListaDeEnteros;
import tp02.ejercicio1.ListaDeEnterosEnlazada;
import tp02.ejercicio1.NodoEntero;
/**
 *
 * @author Cocalibur
 */
public class ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaDeEnterosEnlazada L = new ListaDeEnterosEnlazada();
        
        L.agregarFinal(1);
        L.agregarFinal(12);
        L.agregarFinal(31);
        L.agregarFinal(421);
        L.agregarFinal(125);
        L.agregarFinal(71);
        L.agregarFinal(4);
        
        L.comenzar();
        while (!L.fin()) {
            Integer x = L.proximo();
            System.out.println(x);
        }
    }
    
}
