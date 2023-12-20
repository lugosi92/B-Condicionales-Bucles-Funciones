package B_BUCLES;
import java.util.Scanner;
public class Ejercicio_3_19_mostrar_tipo_numero {

	public static void main(String[] args) {
		//Escribir un programa que muestre, para cada número introducido por teclado, si es par, si es positivo y su cuadrado.
		//El proceso se repetirá hasta que el número introducido sea cero.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introducir numero--> ");
		int num = sc.nextInt();
		
		//Analizar numero
		if (num!=0) {
		
			//Par o impar
		if (num %2==0) { 
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
		
		//Positivo o negativo
		if  (num /2==0) {
			System.out.println("Negativo");
		}else {
			System.out.println("Positivo");
		}
		
	
		
	}
		//El cuadrado
		int numCuadrado = num*num;
		System.out.println("El numero cuadrado es" + numCuadrado);
}
	
	
	
}

