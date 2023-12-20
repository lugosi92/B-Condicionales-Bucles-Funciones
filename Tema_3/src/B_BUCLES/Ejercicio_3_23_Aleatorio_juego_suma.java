package B_BUCLES;

import java.util.Scanner;

public class Ejercicio_3_23_Aleatorio_juego_suma {
	public static void main(String[] args) {
		//Desarrollar un juego que ayude a mejorar el cálculo mental de la suma.
		//El jugador tendrá que introducir la solución de la suma de dos números aleatorios comprendidos entre 1 y 100. 
		//Mientras la solución introducida sea correcta, el juego continuará. 
		//En caso contrario, el programa terminará y mostrará el número de operaciones realizadas correctamente.
		Scanner sc = new Scanner(System.in);
		
		int suma =0;
		int aleatorio1,aleatorio2;
		int respuesta = 0;
		
		do {
			aleatorio1 = (int) (Math.random()*100)+1;
			aleatorio2 = (int) (Math.random()*100)+1;

			System.out.println("Introduce la suema de " +aleatorio1+ "y" +aleatorio2);
			System.out.println("Introduce la suma");
			suma=sc.nextInt();
			respuesta = (aleatorio1 + aleatorio2);
		}while(suma==(aleatorio1+aleatorio2));
	
		
	}

}
