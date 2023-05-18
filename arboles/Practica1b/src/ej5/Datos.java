/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5;

/**
 *
 * @author Coco
 */
public class Datos {
   private int maximo;
   private int minimo;
   private double promedio;
   
   
   public Datos() {
   }
   
   //GETTERS
   public int getMaximo() {
       return maximo;
   }
   public int getMinimo() {
       return minimo;
   }
   public double getPromedio() {
       return promedio;
   }
   //SETTERS
   public void setMaximo(int maximo) {
     this.maximo = maximo;
   }
   public void setMinimo(int minimo) {
      this.minimo = minimo;
   }
   public void setPromedio(double promedio) {
       this.promedio = promedio;
   }
    
}
