package B_BUCLES;

import java.util.Scanner;

public class ejercicio_3_31_Tabla_del_1_al_10 {

	public static void main(String[] args) {
		//Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10.
		
		for(int i=1; i<=10; i++) {
			System.out.println("La tabla de multiplicar es" + i);
			
			for (int j=1; j<=10; j++) {
				int resultado = i * j;
				System.out.println(i+ "x" +j+"=" + resultado);
			}
			System.out.println();
		}
		
	}
}