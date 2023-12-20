package A_CONDICIONALES;

import java.util.Scanner;

public class Ejercicio_3_2_caslcular_division {
	public static void main(String[] args) {
		//Ejercicio 3.2.-
		//a) Escribe un programa que pida dos números enteros y que calcule su división, escribiendo si la división es exacta o no.
     	//b) Mejorar el programa haciendo que tenga en cuenta que no se lleva a cabo una división por cero.
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2;

		
		System.out.println("Introducir el primer numero entero: ");
		n1 = sc.nextInt();
		
		System.out.println("Introducir el segundo numero entero: ");
		n2 = sc.nextInt();
				
		
		if (n1/n2 ==0) {
			System.out.println("el resultado exacto");
		} else {
			System.out.println("La division no es exacta");
		}
		
		if ( n1/n2 !=0) {
			System.out.println("El residuo no es exacto");
		} else {
		System.out.println("El residuo es exacto");
	}

}
}
	