/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5;
import tp02.ejercicio2.*;
import tp02.ejercicio3.*;
import tp04.ejercicio1.*;
/**
 *
 * @author Cocalibur
 */
public class AnalizadorArbol {
    
    
    //VOY A INTENTAR RESOLVERLO POR NIVELES YA QUE ES EL QUE "MAS SE ME FACILITA"
    //AUN ASI TENGO QUE ENCONTRAR LA FORMA DE PRACTICAR RECURSION
    
    //ESTOY TENIENDO UNA FALLA AL IGUAL QUE EN EL EJERCICIO 4 PARA PODER UNIR TODAS LAS LISTAS DE HIJOS QUE CONFORMARIAN EL ULTIMO NIVEL
    //POR ESO EN ESTE CASO DICE COMO SI QUISIERA DIVIDIR EL TOTAL DEL UTLIMO NIVEL (90) POR UNA CANTIDAD DE HIJOS (0) ERROR
    
    public int devolverMaximoPromedio (ArbolGeneral<AreaEmpresa>arbol){
        int fin = 0;
        if (arbol.esVacio()) {                                                  //SI ES VACIO RETORNO 0
            return 0;
        }
        else{                                                                   //SINO ES VACIO PROCESO
            int maxPromedio = -1;
            int promedio = 0;
            int total = 0;
            int totalHijos = 0;
            ArbolGeneral<AreaEmpresa> arbolAux = null;
            ColaGenerica<ArbolGeneral<AreaEmpresa>> cola = new ColaGenerica();
            cola.encolar(arbol);
            cola.encolar(null);
            
            while (!cola.esVacia()){
                arbolAux = cola.desencolar();
                if (arbolAux != null) {
                    fin = 0;
                    total += arbolAux.getDato().getDelay();
                    totalHijos++;
                    if (arbolAux.tieneHijos()) {
                        ListaGenerica<ArbolGeneral<AreaEmpresa>> hijos = arbolAux.getHijos();
                        hijos.comenzar();
                        while (!hijos.fin()) {
                            cola.encolar(hijos.proximo());
                        }
                    }
                }
                else{
                    fin++;
                    if (fin < 2) {                        
                        System.out.println("total: " + total);
                        System.out.println("cantHijos: " + totalHijos);
                        promedio = (int)(total / totalHijos);
                        System.out.println("promedio: " + promedio);
                        System.out.println("");
                        if (promedio > maxPromedio) {
                            maxPromedio = promedio;
                        }
                        total = 0;
                        totalHijos = 0;
                        cola.encolar(null);
                    }
                }
            }
        return maxPromedio;
        }
    }
    
    
   public int devolverMaximoPromedio2 (ArbolGeneral<AreaEmpresa>arbol){
        if (arbol.esVacio()) {                                                  //SI ES VACIO RETORNO 0
            return 0;
        }
        else{                                                                   //SINO ES VACIO PROCESO
            int promedio = 0;
            int total = 0;
            int totalHijos = 0;
            ArbolGeneral<AreaEmpresa> arbolAux = null;
            ColaGenerica<ArbolGeneral<AreaEmpresa>> cola = new ColaGenerica();
            cola.encolar(arbol);
            cola.encolar(null);
            
            while (!cola.esVacia()){
                arbolAux = cola.desencolar();
                if (arbolAux != null) {
                    totalHijos++;
                    total += arbolAux.getDato().getDelay();
                    if (arbolAux.tieneHijos()) {
                        ListaGenerica<ArbolGeneral<AreaEmpresa>> hijos = arbolAux.getHijos();
                        hijos.comenzar();
                        while (!hijos.fin()) {
                            cola.encolar(hijos.proximo());
                        }
                    }
                }
                else {                      
                    promedio = Math.max(promedio, (total/totalHijos));
                    if(!cola.esVacia()){
                        total = 0;
                        totalHijos = 0;
                        cola.encolar(null);
                    }
                }
            }
        return promedio;
        }
    } 
    
    
   
}
