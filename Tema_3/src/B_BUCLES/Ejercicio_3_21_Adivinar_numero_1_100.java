package B_BUCLES;

import java.util.Scanner;
import java.util.Random;
public class Ejercicio_3_21_Adivinar_numero_1_100 {




	public static void main(String[] args) {
		//Codificar el juego «el número secreto», que consiste en acertar un número entre 1 y 100 (generado aleatoriamente). 
		//Para ello se introduce por teclado una serie de números, para los que se indica: «mayor» o «menor», según sea mayor o menor con respecto al número secreto. 
		//El proceso terminará cuando el usuario acierta o cuando ya no quiere continuar (introduciendo un -1).
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		while (true) {
		
			int numeroAleatorio = random.nextInt(100)+1;
			int intentos;
		
		System.out.println("Introduce un numero entre 1 y 100");
		intentos = sc.nextInt();
		
		
		if ( intentos==-1) {
			break;
		}
		if ( intentos == numeroAleatorio) {
			System.out.println("Felicidades");
			break;
		}
		if (intentos<numeroAleatorio) {
			System.out.println("El numero es menor");
		}else {
			System.out.println("El numero es mayor");
		}
		
		
		
		
	}
}
}
