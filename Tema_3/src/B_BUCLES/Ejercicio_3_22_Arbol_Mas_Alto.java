package B_BUCLES;

import java.util.Scanner;

public class Ejercicio_3_22_Arbol_Mas_Alto {

	public static void main(String[] args) {
		// Un centro de investigación de la flora urbana necesita una aplicación que muestre cuál es el árbol más alto.
		//Para ello se introducirá por teclado la altura (en centímetros) de cada árbol (terminando la introducción de datos cuando se utilice -1 como altura). 
		//Los árboles se identifican mediante etiquetas con números únicos correlativos, comenzando en 0. 
		//Diseñar una aplicación que resuelva el problema planteado.
		
		Scanner sc = new Scanner(System.in);
		
		int arbol = 0;
		int arbolMasAlto = 0;
		
		while (true) {
			System.out.println("Introduce la altura " + arbol + " en cm");
			int altura = sc.nextInt(); //Almacena el valor de la altura leído en la variable
			
			if (altura ==-1) {
				System.out.println("Saliste del programa");
				break;
			}
			
			if ( altura > arbolMasAlto) {
				arbolMasAlto = altura;
			}
				arbol++;
				
			if (arbolMasAlto != -1) {
				System.out.println("Arbol mas alto"+ arbol + " "+ arbolMasAlto);
			}else {
				System.out.println("Aerror");
			}
			

			
			
		}
		
		

	}

	}

