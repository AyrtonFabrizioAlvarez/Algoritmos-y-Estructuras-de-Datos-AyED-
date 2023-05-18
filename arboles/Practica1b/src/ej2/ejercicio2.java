package ej2;

import java.util.Scanner;

public class ejercicio2 {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int x = s.nextInt();
		while (x != 0) {
			int[] vector = new int[x];	//DUDA ya que tengo que mostrarlo lo instancie al igual que en proceso
			vector = proceso(x);
			for (int i = 0; i < vector.length; i++) {
				System.out.print(vector[i] + "-");
			}
			System.out.println("\n");
			System.out.println("Ingrese un numero: ");
			x = s.nextInt();
		}
		
	}
	
	public static int[] proceso(int n) {
		int[] vector = new int[n];
		int x = 0;
		for (int i = 0; i < vector.length; i++) {
			x += n;
			vector[i] = x;
		}
		return vector;
	}

}
