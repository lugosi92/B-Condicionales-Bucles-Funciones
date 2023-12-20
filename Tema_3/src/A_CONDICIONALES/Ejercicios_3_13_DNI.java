package A_CONDICIONALES;

import java.util.Scanner;

public class Ejercicios_3_13_DNI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduza su DNI sin la letra");
		int numeroDNI = sc.nextInt();
		
		int numeroLetra = numeroDNI % 23;
		
		System.out.println("El numero de tu DNI es" + numeroLetra);

	}

}
