package A_CONDICIONALES;


import java.util.Scanner;

public class Ejercicio_3_4_operador_ternario {

	public static void main(String[] args) {
		// Escribe un programa que declare una variable N de tipo entero y le asigne un valor. 
		//A continuación debe mostrar una serie de mensajes indicando si el valor de N es positivo o negativo, si es par o impar, si es múltiplo de 5,
		//si es múltiplo de 10 y si es mayor o menor que 36. 
		//Considera el 0 como positivo. Utiliza el operador ternario ( ? : ) dentro del println.

		Scanner sc = new Scanner(System.in);
		
		//Variables Entrada
		int N=0;
		
		
	    //Solicitudes
		System.out.println("Introducir numero--> ");
		N = sc.nextInt();
		
	    //Formulas
		System.out.println(N>=0? "Positivo" : "Negativo");
		System.out.println(N%2==0? "PAR" : "IMPAR");
		System.out.println(N%5==0? "MULTIPLO DE 5" : "NO MULTIPLO DE 5");	
		System.out.println(N%10==0? "MULTIPLO DE 10" : "NO MULTIPLO DE 10");
		System.out.println(N>=36? "ES MAYOR DE 36" : "ES MENOR DE 36");
		
	    //Salida
		
	}

}
