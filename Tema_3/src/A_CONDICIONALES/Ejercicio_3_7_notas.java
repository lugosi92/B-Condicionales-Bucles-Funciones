package A_CONDICIONALES;

import java.util.Scanner;

public class Ejercicio_3_7_notas {

	public static void main(String[] args) {
		// Pedir una nota entera de 0 a 10 y mostrarla de forma literal de la siguiente forma: (de 0 a 4) - > Insuficiente. (5) -> Suficiente. (6) -> Bien. (7 y 8) -> Notable. (9 y 10) -> Sobresaliente.
		//a) Utilizando una estructura if – else.
	    //b) Utilizando una estructura switch.
		
		Scanner sc = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Escribir una nota entera");
		nota = sc.nextInt();
		
		if (nota<=4) {
			System.out.println("Insuficiente");
		}else if (nota ==5) {
			System.out.println("Suficiente");
		}else if (nota==6) {
			System.out.println("Bien");
		}else if (nota<=7) {
			System.out.println("Notable");
		}else if (nota<=9) {
			System.out.println("Sobresaliente");
		}
	}
}
