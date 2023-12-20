package A_CONDICIONALES;

import java.util.Scanner;

public class Ejercicio_3_11_sumar_1_dia {

	public static void main(String[] args) {
		//Pedir dos fechas y mostrar el número de días que hay de diferencia. Suponer que todos los meses tienen 30 días.

		Scanner sc =  new Scanner(System.in);
		
		//Pedir dos fechas
		System.out.println("Introduce dia 1--> ");
		int dia1 = sc.nextInt();
		System.out.println("Introduce mes 1--> ");
		int mes1 = sc.nextInt();
		System.out.println("Introduce año 1--> ");
		int año1 = sc.nextInt();
		
		System.out.println("Introduce dia 2--> ");
		int dia2 = sc.nextInt();
		System.out.println("Introduce mes 2--> ");
		int mes2 = sc.nextInt();
		System.out.println("Introduce año 2--> ");
		int año2 = sc.nextInt();
		
		
		//Transofrar todo a dias
		
		int diasFecha1 = dia1 + mes1*30 + año1*365;
		int diasFecha2 = dia2 + mes2*30 + año2*365;
		
		int diasDiferencia = (diasFecha1>diasFecha2) ? diasFecha1-diasFecha2 : diasFecha2-diasFecha1;
		
		System.out.println("La diferencia de dias es de" + diasDiferencia + "dias");
        
		
		
			
			
			
			
			
			
		}
	}
	


