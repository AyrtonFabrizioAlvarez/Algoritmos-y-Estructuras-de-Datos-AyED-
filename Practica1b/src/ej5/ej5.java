package ej5;

import java.util.Iterator;

public class ej5 {

	public static void main(String[] args) {
		int[] vector = new int[10];
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int)(Math.random()*25+1); 
		}
		
		for (int j = 0; j < vector.length; j++) {
			System.out.print(vector[j] + " - ");
		}
		System.out.println("\n");
		
		double[] vectorMm = new double[3];
		vectorMm = maxMin(vector);
		System.out.println("maximo " + (int)vectorMm[1]);
		System.out.println("minimo " + (int)vectorMm[0]);
		System.out.println("promedio " + vectorMm[2]);
	}
        
        
	public static double[] maxMin(int[] vector) {
		int min = 999;
		int max = -1;
		int total = 0;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] > max) {
				max = vector[i];
			} else if (vector[i] < min) {
				min = vector[i];
			}
			total += vector[i];
		}
		
		double promedio = (double)total / (double)vector.length;	
		double[] vectorM = new double[3];

		vectorM[0] = min;
		vectorM[1] = max;
		vectorM[2] = promedio;
		
		return vectorM;
	}
	
}
