package B_BUCLES;

import java.util.Scanner;

public class Ejercicio_3_36 {

	public static void main(String[] args) {
		// Realiza un programa que nos pida un número n y nos diga cuántos números hay entre 1 y n que sean primos.
		//Un número primo es aquel que solo es divisible por 1 y por sí mismo. Por ejemplo, con n = 8 la salida sería:
			Scanner sc = new Scanner(System.in);
			int numero =0, contador=0;
			
			System.out.println("Introducir numero: ");
			numero=sc.nextInt();
			
			for(int i=1; i<=numero; i++) {
				for(int j=1; j<i; j++) {
					if(i%j!=0) {
						System.out.println(j);
					}
				}
			}

		}

	}
