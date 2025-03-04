
package ancestro;
import tp04.ejercicio1.*;
public class pruebaAncestro {

    public static void main(String[] args) {
        ArbolDePrueba a = new ArbolDePrueba();
        Parcial p = new Parcial();
        
        System.out.println("esAncestro? : "+ p.esAncestro(a.getArbol(), 3, 22));
    }
    
}
