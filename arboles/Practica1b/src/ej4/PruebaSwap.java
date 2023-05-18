package ej4;

public class PruebaSwap {

	/*public static void main(String[] args) {
		
	//NO PASA NADA YA QUE LSO PARAMETROS SE PASAN POR VALOR
	//ESO SIGNIFICA QUE SE GENERA UNA COPIA Y NO CAMBIA SU VALOR ORIGINAL
		
		int x = 2;
		int y = 3;
		swap1(x, y);
		System.out.println(x + " - " + y);
		
		int k = 2;
		int n = 3;
		swap2(k, n);
		System.out.println(k + " - " + n);
	}*/
	
	public static void swap1 (int x, int y) {
		 if (x < y) {
			 int tmp = x ;
			 x = y ;
			 y = tmp;
		 } 
	}
	
	public static void swap2 (Integer x, Integer y) {
		if (x < y) {
			 int tmp = x ;
			 x = y ;
			 y = tmp;
		}
	}
	
	 public static void main(String[] args) {
		 int a = 1, b = 2;
		 Integer c = 3, d = 4;
		 swap1(a,b);
		 swap2(c,d);
		 System.out.println("a=" + a + " b=" + b) ;
		 System.out.println("c=" + c + " d=" + d) ;
	}

}
