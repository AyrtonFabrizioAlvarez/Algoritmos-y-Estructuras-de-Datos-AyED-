
package ancestro;

import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class Parcial {
    public boolean esAncestro (ArbolGeneral<Integer> a, int num1, int num2){
        boolean cumple = false;
        if (!a.esVacio()) {
            ArbolGeneral<Integer> arbolAux1 = buscar(a, num1);
            if (arbolAux1 != null) {
                arbolAux1 = buscar(arbolAux1, num2);
                if (arbolAux1 != null) {
                    cumple = true;
                }
            }
        }
        return cumple;
    }
    
    public ArbolGeneral<Integer> buscar(ArbolGeneral<Integer> a, int num){
        ArbolGeneral<Integer> aux = null;
        if (a.getDato().equals(num)) {
            aux = a;
        }
        else{
            ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
            hijos.comenzar();
            while ( (!hijos.fin()) && (aux == null) ) {
                aux = buscar(hijos.proximo(), num);
            }
        }
        return aux;
    }
}
