/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;
import java.util.Scanner;
/**
 *
 * @author Coco
 */
public class Practica1b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el numero inferior");
        int inf = s.nextInt();
        System.out.println("Inggrese el numero superior");
        int sup = s.nextInt();
        
        ejercicioA(inf, sup);
        ejercicioB(inf, sup);
        ejercicioC(inf, sup);

        
        
    }
        public static void ejercicioA(int inf, int sup){
            for (int i = inf; i <= sup; i++) {
                System.out.println(i);
            }
        }
        
        public static void ejercicioB(int inf, int sup){
            while (inf <= sup) {
                System.out.println(inf);
                inf++;
            }
        }
        
        public static void ejercicioC(int inf, int sup){
            if (inf <= sup) {
                System.out.println(inf);
                ejercicioC((inf+1), sup);
            }  
        }
    
}
