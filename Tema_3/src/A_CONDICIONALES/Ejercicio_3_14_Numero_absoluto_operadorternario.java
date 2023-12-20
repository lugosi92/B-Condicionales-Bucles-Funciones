package A_CONDICIONALES;

import java.util.Scanner;

public class Ejercicio_3_14_Numero_absoluto_operadorternario {

	public static void main(String[] args) {
		// Utiliza el operador ternario para calcular el valor absoluto de un número que se solicita al usuario por teclado.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		int numero = sc.nextInt();
		
		int valorAbsoluto = (numero<0) ? -numero : numero;
		
		
		System.out.println("El valor absoluto es :" + valorAbsoluto);
		
		

	}

}
