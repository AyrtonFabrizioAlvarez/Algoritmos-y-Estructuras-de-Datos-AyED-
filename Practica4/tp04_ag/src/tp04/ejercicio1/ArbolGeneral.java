package tp04.ejercicio1;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio3.ColaGenerica;

public class ArbolGeneral<T> {
	private T dato;
	private ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();

        
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public void setHijos(ListaGenerica<ArbolGeneral<T>> hijos) {
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ArbolGeneral(T dato) {
		this.dato = dato;
	}

	public ArbolGeneral(T dato, ListaGenerica<ArbolGeneral<T>> hijos) {
		this(dato);
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ListaGenerica<ArbolGeneral<T>> getHijos() {
		return this.hijos;
	}

	public void agregarHijo(ArbolGeneral<T> unHijo) {

		this.getHijos().agregarFinal(unHijo);
	}

	public boolean esHoja() {

		return !this.tieneHijos();
	}
	
	public boolean tieneHijos() {
		return !this.hijos.esVacia();
	}
	
	public boolean esVacio() {

		return this.dato == null && !this.tieneHijos();
	}

	

	public void eliminarHijo(ArbolGeneral<T> hijo) {
		if (this.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
			if (hijos.incluye(hijo)) 
				hijos.eliminar(hijo);
		}
	}
	
	public ListaEnlazadaGenerica<T> preOrden() {
		return null;
	}
	
	public Integer altura(){
            if (this.esHoja()) {
                return 0;
            }
            else{
                int max = -1;
                ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
                hijos.comenzar();
                while (!hijos.fin()) {
                    int cant = 1 + hijos.proximo().altura();
                    max = Math.max(cant, max);
                }
                return max;
            }
	}

	public Integer nivel(T dato) {
            int nivel = 0;
            boolean encontre = false;
            ArbolGeneral<T> arbolAux = null;
            ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica();
            cola.encolar(this);
            cola.encolar(null);
            while ( (!cola.esVacia()) && (!encontre) ) {
                arbolAux = cola.desencolar();
                if (arbolAux != null) {
                    if (arbolAux.getDato() == dato) {
                        encontre = true;
                    }
                    else if (arbolAux.tieneHijos()) {
                        ListaGenerica<ArbolGeneral<T>> hijos = arbolAux.getHijos();
                        hijos.comenzar();
                        while (!hijos.fin()) {
                        cola.encolar(hijos.proximo());
                        }
                    }
                }
                else {
                    nivel++;
                    cola.encolar(null);
                }
            }
            return nivel;
	}

	public Integer ancho() {
            int max = -1;
            int nodos = 0;
            ArbolGeneral<T> arbolAux = null;
            ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica();
            cola.encolar(this);
            cola.encolar(null);
            while (!cola.esVacia()) {
                arbolAux = cola.desencolar();
                if (arbolAux != null) {
                    nodos++;
                    if (arbolAux.tieneHijos()) {
                        ListaGenerica<ArbolGeneral<T>> hijos = arbolAux.getHijos();
                        hijos.comenzar();
                        while (!hijos.fin()) {
                            cola.encolar(hijos.proximo());
                        }
                        cola.encolar(null); //NOSE EXACTAMENTE DONDE ENCOLAR EL NULL PARA NO TENER CASOS DE ERROR
                    }                       //EN ESTE CASO TENIENDO UN NIVEL CONFORMADO POR HIJOS DE 2 NODOS DISTINTOS
                }                           // EN ESE CASO CONTARIA POR SEPARADO LOS HIJOS DE CADA NODO
                else{
                    if (nodos > max) {
                        max = nodos;   
                    }
                    //cola.encolar(null);   //ANTES ENCOLABA ACA PERO NO VOLVIA A ENTRAR PARA ACTUALIZAR EL MAXIMO DEL ULTIMO NIVEL
                    nodos = 0;
                }
            }
            return max;
	}
        
        public Boolean esAncestro(T a, T b){
            
        }
}