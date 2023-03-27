/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej15;
import tp02.ejercicio1.ListaDeEnterosEnlazada;
/**
 *
 * @author Cocalibur
 */
public class ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaDeEnterosEnlazada L = new ListaDeEnterosEnlazada();
        
        L.agregarFinal(1);
        L.agregarFinal(2);
        L.agregarFinal(3);
        L.agregarFinal(4);
        
        L.comenzar();
        proceso(L);
    }
    
    public static void proceso(ListaDeEnterosEnlazada L){
        if (!L.fin()) {
            Integer x = L.proximo();
            proceso(L);
            System.out.println(x);
        }
    }
}
