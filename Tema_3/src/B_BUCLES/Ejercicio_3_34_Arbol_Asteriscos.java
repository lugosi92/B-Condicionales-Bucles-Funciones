package B_BUCLES;
import java.util.Scanner;
public class Ejercicio_3_34_Arbol_Asteriscos {

	public static void main(String[] args) {
		// Pedir por consola un número n y dibujar un triángulo rectángulo de n elementos de lado,
		//utilizando para ello asteriscos (*). Por ejemplo, para n = 4:
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce le numero n para el triangulo");
		int n = sc.nextInt();
		
		for ( int i = 1; i<=n ; i++) {
			for(int j = 1; j<=i; j++) {
				
				System.out.println("*");
			}
			
		}
		
			

	}

}
