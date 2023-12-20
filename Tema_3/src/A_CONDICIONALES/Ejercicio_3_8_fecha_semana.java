package A_CONDICIONALES;

import java.util.Scanner;

public class Ejercicio_3_8_fecha_semana {

	public static void main(String[] args) {
		// Escribir un programa que solicite al usuario un número comprendido entre 1 y 7, correspondiente al día de la semana. 
		//El programa mostrará en pantalla el nombre del día correspondiente: 1 -> Lunes, 2 -> Martes, etc.
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = 0;
		
		System.out.println("Introducir numero del 1 al 7");
		n1 =sc.nextInt();
		
		switch (n1) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Numero no valido");
		
		}
		
		

	}

}
