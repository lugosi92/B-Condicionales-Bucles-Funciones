package C_Funciones;

import java.util.Scanner;

public class Ejercicio_3_43_imrpirmi_eco {

	public static void main(String[] args) {
		// Diseña la función eco() a la que se le pasa como parámetro un número n y muestra en pantalla n veces el mensaje “Eco...”.
		//Escribe un programa que utilice esta función solicitando al usuario el valor de n.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el numero de veces que quieras que haya ECO");
		int n= sc.nextInt();
		eco(n);
		
	}

	private static void eco(int n) {
		for (int i=0; i<=n ; i++) {
			System.out.println("Eco..");
		}
			
		
	}

}
