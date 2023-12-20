package C_Funciones;

import java.util.Scanner;

public class Ejercicio_3_46_numero_mayor {

	public static void main(String[] args) {
		// Escribe una función que reciba como parámetros dos números enteros y devuelva el mayor de ambos (máximo de ambos). 
		//Escribe un programa que solicite al usuario los dos números y obtenga el máximo a través de la función.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce numero 1");
		int num1 = sc.nextInt();
		
		System.out.println("Introduce numero 2");
		int num2 = sc.nextInt();
		
		int maximo = numMax(num1,num2);
		System.out.println("El nnumero mayor entre "+num1+ " y " +num2+ " es "+ maximo);
	}
	
		private static int numMax(int num1 , int num2) {

			if (num1>num2) {
				return num1;
			}else{
				return num2;
			
			
		}
		

	}
}
