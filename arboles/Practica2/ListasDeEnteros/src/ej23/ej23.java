/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej23;
import tp02.ejercicio2.*;
/**
 *
 * @author Cocalibur
 */
public class ej23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaEnlazadaGenerica <Estudiante> estudiantes = new ListaEnlazadaGenerica();
        
        Estudiante E1 = new Estudiante("Ayrton", "Alvarez", 1, "a@a.com", "siempre viva 123");
        estudiantes.agregarFinal(E1);
        Estudiante E2 = new Estudiante("Felipe", "Massera", 2, "b@b.com", "siempre viva 456");
        estudiantes.agregarFinal(E2);
        Estudiante E3 = new Estudiante("Francisco", "Percara", 3, "c@c.com", "siempre viva 789");
        estudiantes.agregarFinal(E3);
        Estudiante E4 = new Estudiante("Gonzalez", "Joaquin", 4, "d@d.com", "siempre viva 000");
        estudiantes.agregarFinal(E4);
        
        estudiantes.comenzar();
        while (!estudiantes.fin()) {
            System.out.println(estudiantes.proximo().toString());
        }
        
        
    }
    
}
