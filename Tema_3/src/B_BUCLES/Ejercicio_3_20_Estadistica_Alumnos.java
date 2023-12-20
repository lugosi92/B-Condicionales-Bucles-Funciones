package B_BUCLES;

import java.util.Scanner;

public class Ejercicio_3_20_Estadistica_Alumnos {

	public static void main(String[] args) {
		//Implementar una aplicación para calcular datos estadísticos de las edades de los alumnos de un centro educativo. 
		//Se introducirán datos hasta que uno de ellos sea negativo, y se mostrará: 
		//la suma de todas las edades introducidas, la media, el número de alumnos, y cuántos son mayores de edad.
		Scanner sc = new Scanner(System.in);
		

		int sumEdad = 0;
		int cantAlumnos = 0;
		int mayorEdad = 0;
		
		while(true) {
			System.out.println("Introuce la edad--> ");
			int edad = sc.nextInt();
			
			if(edad < 0) {
				break;
			}
			
			sumEdad += edad;
			cantAlumnos++;
			
			if (edad>=18) {
				mayorEdad++;
			}
			
			if (cantAlumnos>0) {
				int media = sumEdad /cantAlumnos;
			
			System.out.println("La suma de edades " + sumEdad);
			System.out.println("La media " + media);
			System.out.println("La cantidad de alumnos " + cantAlumnos);
			System.out.println("Mayores de edad " + mayorEdad);
			} else {
				System.out.println("Valor incorrecto");
			}
		}
		
		
		}
	}

