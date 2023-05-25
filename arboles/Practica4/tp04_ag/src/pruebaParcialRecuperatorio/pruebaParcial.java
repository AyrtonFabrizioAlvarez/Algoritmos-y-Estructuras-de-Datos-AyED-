package pruebaParcialRecuperatorio;

import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class pruebaParcial {

    public static void main(String[] args) {
        ArbolGeneral<Integer> a1 = new ArbolGeneral(10);
        ArbolGeneral<Integer> a2 = new ArbolGeneral(8);
        ArbolGeneral<Integer> a3 = new ArbolGeneral(42);
        ArbolGeneral<Integer> a4 = new ArbolGeneral(-5);
        ArbolGeneral<Integer> a5 = new ArbolGeneral(5);
        ArbolGeneral<Integer> a6 = new ArbolGeneral(22);
        ArbolGeneral<Integer> a7 = new ArbolGeneral(19);
        ArbolGeneral<Integer> a8 = new ArbolGeneral(-9);
        ArbolGeneral<Integer> a9 = new ArbolGeneral(-6);
        ArbolGeneral<Integer> a10 = new ArbolGeneral(28);
        ArbolGeneral<Integer> a11 = new ArbolGeneral(55);
        ArbolGeneral<Integer> a12 = new ArbolGeneral(18);
        ArbolGeneral<Integer> a13 = new ArbolGeneral(4);
        
        a1.agregarHijo(a2);
        a1.agregarHijo(a3);
        a1.agregarHijo(a4);
        
        a2.agregarHijo(a5);
        a2.agregarHijo(a6);
        
        a4.agregarHijo(a7);
        a4.agregarHijo(a8);
        
        a5.agregarHijo(a13);
        
        a6.agregarHijo(a10);
        a6.agregarHijo(a11);
        a6.agregarHijo(a12);
        
        a7.agregarHijo(a13);
        
        //recorrido(a1);
        
        ParcialArboles p = new ParcialArboles(a1);
        ListaGenerica<Integer> l = p.camino(2);
        
        l.comenzar();
        while(!l.fin()){
            System.out.println(l.proximo());
        }
        
        
        
    }
    
    public static void recorrido (ArbolGeneral<Integer> a){
        if(!a.esVacio()){
            System.out.println(a.getDato());
            if (a.tieneHijos()) {
                ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
                hijos.comenzar();
                while (!hijos.fin()) {
                    recorrido(hijos.proximo());
                }
            }
        }
    }
    
}
