package A_CONDICIONALES;

import java.util.Scanner;

public class devolver_dia_siguiente {

	public static void main(String[] args) {
		//Modificar el código del Ejercicio 3.9 para que, cuando la fecha sea correcta, el programa devuelva además la fecha del día siguiente

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el dia--> ");
		int dia = sc.nextInt();
		
		System.out.println("Introduce el mes--> ");
		int mes = sc.nextInt();
		
		System.out.println("Introduce el año--> ");
		int año = sc.nextInt();
		
		if ( año<=2023) {
			System.out.println("Año correcto");
		}else {
			System.out.println("Año incorrecto");
		}
		
		if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
		}else if (dia<=31 && dia>=1) { 
			System.out.println("Mes y dia correcto");
	
			if (mes==4 || mes==6 || mes==9 || mes==11) {
			} else if(dia<=30 && dia>=1) {
				System.out.println("Mes y dia correcto");
			}
			if (mes==2) {
			} else if(dia<=28 && dia>=1) {
				System.out.println("Mes y dia correcto");
				
			
		
			
			
		dia++;
		
		if (dia==31) {
			dia =0;
			
			if (mes==12) {
			mes=0;
			dia++;
			
			
			
		System.out.println("La fecha actual es"+año+mes+dia);
		
		}
		}
	}
}
}
}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	