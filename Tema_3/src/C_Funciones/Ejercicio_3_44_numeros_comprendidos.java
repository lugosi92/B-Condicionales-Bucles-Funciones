package C_Funciones;

import java.util.Scanner;

public class Ejercicio_3_44_numeros_comprendidos {

	public static void main(String[] args) {
//Escribir una función a la que se le pasen dos enteros y muestre todos los números comprendidos entre ellos.
//Escribe un programa que utilice esta función, solicitando al usuario los dos números.
		
			Scanner sc = new Scanner(System.in);
		
		
			int num1;
			int num2;
			
			System.out.println("Introduce el primer numero");
			num1 = sc.nextInt();
			
			System.out.println("Introduce el segundo numero");
			num2 = sc.nextInt();
			
			Numcomp(num1,num2);
			
	}
	
	static void Numcomp (int inicio, int fin) {
		        if (inicio > fin) {//técnica común para asegurar antes de realizar alguna operación o cálculo en el programa.
		            int temp = inicio;
		            inicio = fin;
		            fin = temp;
		        }
		        for ( int i=inicio; i<fin; i++) {
		        	System.out.println(i+"");
		        }
					
				}
				
			
	}


