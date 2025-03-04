/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej16;
import tp02.ejercicio1.*;
/**
 *
 * @author Cocalibur
 */
public class ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaDeEnterosEnlazada L = calcularSucesion(6);
        L.comenzar();
        while (!L.fin()) {
            System.out.println(L.proximo());
        }
    }
    
    public static ListaDeEnterosEnlazada calcularSucesion(int n){
        ListaDeEnterosEnlazada L;
        if (n == 1){
            L = new ListaDeEnterosEnlazada();
        }
        else{
            if (n % 2 == 0){
                L = calcularSucesion(n/2);
            }
            else{
                L = calcularSucesion(3*n+1);
            }
            
        }
        L.agregarInicio(n);
        return L;    
    }
     
    
}
