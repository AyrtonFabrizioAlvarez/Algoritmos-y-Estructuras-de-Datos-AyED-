/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;
import tp02.ejercicio3.*;
import java.util.Scanner;
/**
 *
 * @author Cocalibur
 */
public class ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese una el string para saber si es balanceado");
        String word = s.next();
        if (esBalanceado(word)){
            System.out.println("El string " + word + " es balanceado");
        }
        else{
            System.out.println("El string " + word + " no es balanceado");
        }
    }
    
    public static boolean esBalanceado(String word){
        
        PilaGenerica P = new PilaGenerica();
        boolean balanceado = true;
        int i = 0;
        while ((i < word.length()) && (balanceado)) {
            char opuesto = obtenerOpuesto(word.charAt(i));

            if (esApertura(word.charAt(i))){
                P.apilar(word.charAt(i));
            }
            else if (word.charAt(i-1) == opuesto){
                P.desapilar();
            }
            else {
                balanceado = false;
            }
            if (word.charAt(1) == opuesto){
                P.desapilar();
            }
            i++;
        }

        if (P.esVacia()) {
            return true;
        }
        else{
            return false;
        }
    }
    
    public static boolean esApertura(char c){
        switch (c) {
            case '(', '{', '[': return true;
        }
        return false;
    }
    
    public static char obtenerOpuesto(char c){
        switch (c) {
            case ')': return '(';
            case '}': return '{';
            case ']': return '[';
        }
        return ' ';
    }
    
}