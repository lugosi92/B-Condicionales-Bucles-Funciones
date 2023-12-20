package A_CONDICIONALES;

import java.util.Scanner;

public class Ejercicio_3_14_numeros_escritos {

	public static void main(String[] args) {
		// Pedir un número entre 0 y 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar: cincuenta y seis. 
		//(Para simplificar mostrar los números de la decena como diez y uno, diez y dos, ... en lugar de once, doce,...)

		  Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese un número entre 0 y 99: ");
	        int numero = scanner.nextInt();
	        
	        if (numero>=0 && numero<=99) {
	        	
	        	  int decenas = numero / 10;
	                int unidades = numero % 10;
	 
	                if (decenas > 1) {
	                	switch(decenas) {
	                	
	                     case 2: 
	                    	 System.out.println("Veinte");
	                }
	        	
	        }
	        }
	}
}



