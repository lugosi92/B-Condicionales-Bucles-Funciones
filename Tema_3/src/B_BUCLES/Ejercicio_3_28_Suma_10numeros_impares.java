package B_BUCLES;

import java.util.Scanner;

public class Ejercicio_3_28_Suma_10numeros_impares {
	public static void main(String[] args) {
		// Diseñar un programa que muestre la suma de los 10 primeros números impares.
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int suma=0;
		
		for(int i=0; i<=10; i++) {
		System.out.println("Introduce 10 numeros enteros");
		num = sc.nextInt();
		
		if (num%2!=0) {
			//variable sumar
			suma+=num;
		
		}
		System.out.println("La suma de los numeros impares es"+suma);
		}
	}
}

