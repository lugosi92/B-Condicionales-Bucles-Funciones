package B_BUCLES;

import java.util.Scanner;

public class Ejercicio_3_26_10num_media {

	public static void main(String[] args) {
		// Pedir 10 números enteros por teclado y mostrar el valor medio.
		
		Scanner sc= new Scanner(System.in);
		
		int media=0;
		int suma=0;
		int contnumeros=0;
		
		
		for (int i = 1; i<=10;i++) {	
		System.out.println("Introduce 10 numeros enteros");
		int num=sc.nextInt();
		
		
		//suma de los numeros
		suma += num;
		//contador
		contnumeros++;
		//media
		media= suma/contnumeros;
		
		
	
		}
		
		System.out.println("La media de los numeros es"+media);
		
	}

}
