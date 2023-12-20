package B_BUCLES;

import java.util.Scanner;

public class Ejercicio_3_27_tabla_multiplicar {

	public static void main(String[] args) {
		// Implementar una aplicación que pida al usuario un número comprendido entre 1 y 10. 
		// Hay que mostrar la tabla de multiplicar de dicho número, asegurándose de que el número introducido se encuentra en el rango solicitado.

		Scanner sc = new Scanner(System.in);
		
		int resultado;
		
		System.out.println("Introduce un numero comprendido entre el 1 y el 10");
		int numCom = sc.nextInt();
		
		
		if(numCom>=1 && numCom<=10) {
			for (int i=1; i<=10; i++) {
				resultado = numCom * i;
				System.out.println(numCom + "x" + i + "=" + resultado);
				
			}
		}
	}

}
