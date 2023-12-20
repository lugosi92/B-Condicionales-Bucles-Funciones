package A_CONDICIONALES;

import java.util.Scanner;

public class Ejercicio_3_1_Ordenar_min_max {

	public static void main(String[] args) {
		//Escribir un programa que solicite al usuario dos números enteros y los muestre ordenados de mayor a menor.

		
	Scanner sc = new Scanner(System.in);
	
	
		//Variables Entrada
		int num1, num2;
		
	    //Solicitudes
	System.out.println("Introduce numero 1: " );
	num1 = sc.nextInt();
	
	System.out.println("Introduce numero 2: " );
	num2 = sc.nextInt();
	
	    //Formulas
	if ( num1 >= num2) {
		System.out.println("El orden es " + num1 + " " + num2 );
	} else {
	System.out.println("El orden es " + num2 + " " + num1 );
	
	    //Salida
	}
	}
}

