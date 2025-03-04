/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7;
import tp04.ejercicio1.*;
import tp02.ejercicio2.*;
import tp02.ejercicio3.*;
/**
 *
 * @author Cocalibur
 */
public class RedDeAguaPotable {
    private ArbolGeneral<String> red;

	public RedDeAguaPotable(ArbolGeneral<String> arbol) {
		this.red = arbol;
	}

	public double minimoCaudal(double caudal) {
		return calcularCaudalMinimo(red, caudal);
	}

	private double calcularCaudalMinimo(ArbolGeneral<String> subred, double caudal) {
		if (subred.esHoja())
			return caudal;

		double caudalActual = caudal / subred.getHijos().tamanio();
		double caudalMinimo = caudalActual;
		ListaGenerica<ArbolGeneral<String>> hijos = subred.getHijos();
		hijos.comenzar();
		while (!hijos.fin()){
			caudalMinimo = Math.min(caudalMinimo, calcularCaudalMinimo(hijos.proximo(), caudalActual));
                }
		return caudalMinimo;
	}     
}
