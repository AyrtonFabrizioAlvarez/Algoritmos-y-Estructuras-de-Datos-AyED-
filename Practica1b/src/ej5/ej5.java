package ej5;

public class ej5 {
    static Datos d;
	public static void main(String[] args) {
            int[] vector = new int[10];
            for (int i = 0; i < vector.length; i++) {
                vector[i] = (int)(Math.random()*25+1); 
            }

            for (int j = 0; j < vector.length; j++) {
                System.out.print(vector[j] + " - ");
            }
            System.out.println("\n");


            Datos d1 = maxMin(vector);
            System.out.println("maximo " + d1.getMaximo());
            System.out.println("minimo " + d1.getMinimo());
            System.out.println("promedio " + d1.getPromedio() + "\n");

            Datos d2 = new Datos();
            proceso2(vector, d2);
            System.out.println("maximo " + d2.getMaximo());
            System.out.println("minimo " + d2.getMinimo());
            System.out.println("promedio " + d2.getPromedio() + "\n");

            proceso3(vector);
            System.out.println("maximo " + d.getMaximo());
            System.out.println("minimo " + d.getMinimo());
            System.out.println("promedio " + d.getPromedio() + "\n");
	}
        
        
	public static Datos maxMin(int[] vector) {
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
            Datos d = new Datos();
            d.setMaximo(max);
            d.setMinimo(min);
            d.setPromedio((double)total/(double)vector.length);

            return d;
	}
        
        public static void proceso2(int[] vector, Datos d){
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

            d.setMaximo(max);
            d.setMinimo(min);
            d.setPromedio((double)total/(double)vector.length);
        }
       
        public static void proceso3(int[] vector){
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

            d = new Datos();
            d.setMaximo(max);
            d.setMinimo(min);
            d.setPromedio((double)total/(double)vector.length);
        }
	
}
