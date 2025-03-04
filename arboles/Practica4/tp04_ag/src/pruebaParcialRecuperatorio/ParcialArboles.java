/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaParcialRecuperatorio;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

/**
 *
 * @author Cocalibur
 */
public class ParcialArboles {
    private ArbolGeneral<Integer> arbol;
    
    public ParcialArboles(ArbolGeneral<Integer> a){
        this.arbol = a;
    }
    
    public ListaGenerica<Integer> camino(int num){
        ListaGenerica<Integer> camino = new ListaEnlazadaGenerica();
        if (!this.arbol.esVacio()){
            resolver(this.arbol, camino, num);
        }
        return camino;
    }
    
    private boolean resolver(ArbolGeneral<Integer> a, ListaGenerica<Integer> camino, int num){
        boolean noCumple = false;
        if (a.getDato() % num == 0){
            System.out.println("agrego el " + a.getDato());
            camino.agregarFinal(a.getDato());
        }
        else{
            noCumple = true;
        }
        if ((!a.esHoja()) && (!noCumple)){
            System.out.println("aca");
            ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
            hijos.comenzar();
            while ((!hijos.fin()) && (!noCumple)){
                System.out.println("entrando");
                noCumple = resolver(hijos.proximo(), camino, num);
            }
        }
        else{
            if (a.getDato() % num == 0){
                noCumple = false;
            }
        }
        return noCumple;
    }
}
