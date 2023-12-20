package A_CONDICIONALES;

import java.util.Scanner;

public class Ejercicio_3_5_devolver_numero_cifras {

	public static void main(String[] args) {
		//Escribe un programa que solicite un número entre 0 y 9.999 y devuelva el número de cifras. 
		//Por ejemplo “765 tiene 3 cifras”, “36 tiene 2 cifras”.

		Scanner sc = new Scanner(System.in);
		//Variables Entrada
		int Num;
	
		
	       //Solicitudes
		System.out.println("Escribe un numero del 0 al 9999-->");
		Num = sc.nextInt();
		
	       //Formulas
		if ( Num>=0 && Num<=9) {
			System.out.println("El numero tiene 1 cifras");
		} else 	if ( Num>=10 && Num<=99) {
			System.out.println("El numero tiene 2 cifras");
		} else 	if ( Num>=100 && Num<=999) {
			System.out.println("El numero tiene 3 cifras");
		} else 	if ( Num>=1000 && Num<=9999) {
			System.out.println("El numero tiene 4 cifras");
		}
		
	      //Salida
		
	
	}

}
