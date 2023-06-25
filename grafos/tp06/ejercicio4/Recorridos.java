package ejercicio4;

import ejercicio3.Arista;
import ejercicio3.Grafo;
import ejercicio3.Vertice;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class Recorridos<T> {
    
    public ListaGenerica<Vertice<T>> dfs(Grafo<T> grafo){
        ListaGenerica<Vertice<T>> camino = new ListaEnlazadaGenerica<>();
        if(!grafo.esVacio()){
            Boolean [] marca = new Boolean[grafo.listaDeVertices().tamanio()];
            for (int i = 0; i < marca.length; i++) {
                /*DEBO INICIALIZAR EL ARRAY EN FALSE? */
                if (!marca[i]){
                    dfs(i, camino, grafo, marca);
                }
            }
        }
        return camino;
    }
    /*ESTE RECORRIDO DFS, NO CONSIDERA RESTRICCIONES Y SOLO RECORRE TODO EL GRAFO,
     * EN CASO DE QUERER ELIMINAR (NO CUMPLIMIENTO DE UNA RESTRICCION), ENTONCES USAMOS
     * UN BOOLEAN Y LUEGO DEL WHILE (TERMINO DE RECORRER SUS HIJOS), CADA ELEMENTO SE ELIMINA
     * A SI MISMO (IF(!CUMPLE){CMAINO.ELIMINAREN(CAMINO.TAMANIO())})
     */
    private void dfs(int i,ListaGenerica<Vertice<T>> camino, Grafo<T> grafo, Boolean[] marca){
         marca[i] = true;
         Vertice<T> v = grafo.vetice(i);
         System.out.println(v.dato());
         camino.agregarFinal(v);
         ListaGenerica<Arista<T>> adyacentes = grafo.listaDeAdyacentes(v);
         adyacentes.comenzar();
         while (!adyacentes.fin()){
            int j = adyacentes.proximo().verticeDestino().getPosicion();
            if(!marca[j]){
                dfs(j, camino, grafo, marca);
            }
         }
    }
}
