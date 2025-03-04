/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej24;

import ej23.Estudiante;
import tp02.ejercicio2.ListaEnlazadaGenerica;

/**
 *
 * @author Cocalibur
 */
public class pruebaMetodoAgregarGenerico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante[] vectorEstudiantes = new Estudiante[4];
        Estudiante E1 = new Estudiante("Ayrton", "Alvarez", 1, "a@a.com", "siempre viva 123");
        vectorEstudiantes[0] = E1;
        Estudiante E2 = new Estudiante("Felipe", "Massera", 2, "b@b.com", "siempre viva 456");
        vectorEstudiantes[1] = E2;
        Estudiante E3 = new Estudiante("Francisco", "Percara", 3, "c@c.com", "siempre viva 789");
        vectorEstudiantes[2] = E3;
        Estudiante E4 = new Estudiante("Gonzalez", "Joaquin", 4, "d@d.com", "siempre viva 000");
        vectorEstudiantes[3] = E4;
        ListaEnlazadaGenerica<Estudiante> estudiantes = new ListaEnlazadaGenerica();
        
        estudiantes.agregar(vectorEstudiantes);

        estudiantes.comenzar();
        while (!estudiantes.fin()) {
            System.out.println(estudiantes.proximo().toString());
        }
        
        Integer[] vectorEnteros = new Integer[10];
        for (int i = 0; i < 10; i++) {
            vectorEnteros[i] = i+1;
        }
        ListaEnlazadaGenerica<Integer> enteros = new ListaEnlazadaGenerica();
        
        System.out.println(enteros.agregar(vectorEnteros));
        
        enteros.comenzar();
        while (!enteros.fin()) {
            System.out.println(enteros.proximo());
        }
       
    }
    
}
