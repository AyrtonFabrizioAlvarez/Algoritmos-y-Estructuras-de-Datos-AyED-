/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej12;
import tp02.ejercicio1.ListaDeEnteros;
import tp02.ejercicio1.ListaDeEnterosConArreglos;
/**
 *
 * @author Cocalibur
 */
public class ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaDeEnterosConArreglos L = new ListaDeEnterosConArreglos();
        
        L.agregarFinal(1);
        L.agregarFinal(2);
        L.agregarFinal(3);
        L.agregarFinal(32);
        L.agregarFinal(123);
        L.agregarFinal(64);
        L.agregarFinal(140);
        
        //L.comenzar();
        while (!L.fin()) {
            System.out.println(L.proximo());            
        }
    }
    
}
