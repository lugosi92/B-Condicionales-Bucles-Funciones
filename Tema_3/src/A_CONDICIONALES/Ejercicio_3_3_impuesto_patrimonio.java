package A_CONDICIONALES;

import java.util.Scanner;

public class Ejercicio_3_3_impuesto_patrimonio {

	public static void main(String[] args) {
		// Para pagar el impuesto de Patrimonio se debe ser mayor de 16 años y tener unos ingresos iguales o superiores a 1000 € mensuales.
		//Escribe un programa que pregunte al usuario su edad y sus ingresos mensuales y muestre por pantalla si el usuario tiene que tributar o no.
		
		Scanner sc = new Scanner(System.in);
		
		int Patrimonio = 0;
		int edad = 0;
		
		System.out.println("Introduzca sus ingresos mensuales");
		Patrimonio = sc.nextInt();
		System.out.println("Introduzca su edad");
		edad = sc.nextInt();
		
		
		if (Patrimonio >= 1000 && edad >= 16) {
			System.out.println("Debe pagar impuestos");
		} else {
			System.out.println("No debe pagar impuestos");

		}
	}

}
