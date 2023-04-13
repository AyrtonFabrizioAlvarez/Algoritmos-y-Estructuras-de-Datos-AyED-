package tp03.ejercicio1;
import tp02.ejercicio3.*;
public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;   
	private ArbolBinario<T> hijoDerecho; 

	
	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	
	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	 
	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo!=null;
	}

	 
	public boolean tieneHijoDerecho() {
		return this.hijoDerecho!=null;
	}

    public int contarHojas() {
        if (this.esVacio()){
            return 0;
        }
        else{
            if (this.esHoja()){
                return 1;
            }
            else{
            int aux = 0;
            if (this.tieneHijoIzquierdo()) {
                aux += this.getHijoIzquierdo().contarHojas();
            }
            if (this.tieneHijoDerecho()) {
                aux += this.getHijoDerecho().contarHojas();
            } 
            return aux;
        }
        }
    }

    public ArbolBinario<T> espejo() {
        if(this.esVacio()){
            return null;
        }
        else{
            ArbolBinario<T> arbolAux = new ArbolBinario(this.getDato());
            if (!this.esHoja()) {
                if (this.tieneHijoDerecho()){
                    arbolAux.agregarHijoIzquierdo(this.getHijoDerecho().espejo());
                }
                if (this.tieneHijoIzquierdo()){
                    arbolAux.agregarHijoDerecho(this.getHijoIzquierdo().espejo());
                }
            }
        return arbolAux;
        }
    }
    
    public int getAltura(ArbolBinario<T> A){
        if (A.esVacio()) {
            return 0;
        }
        else{
            if (!A.esHoja()) {
                if (A.tieneHijoIzquierdo()) {
                    return  aux + A.getAltura(A.getHijoIzquierdo());
                }
                if (A.tieneHijoDerecho()){
                    return aux + A.getAltura(A.getHijoDerecho());
                }
            }
            else{
                return 0;
            }
            return 0;
        }
    }


    public void entreNiveles(int n, int m){
        ArbolBinario<T> arbol = new ArbolBinario();
        ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica();
        cola.encolar(this);
        cola.encolar(null);
        while(!cola.esVacia()){
            arbol = cola.desencolar();
            if (arbol != null){
                System.out.println(arbol.getDato());
                if (arbol.tieneHijoIzquierdo()) {
                    cola.encolar(arbol.getHijoIzquierdo());
                }
                if (arbol.tieneHijoDerecho()) {
                    cola.encolar(arbol.getHijoDerecho());
                }
            }
            else if (!cola.esVacia()){
                System.out.println("");
                cola.encolar(null);
            }
        }
    }

	

}
