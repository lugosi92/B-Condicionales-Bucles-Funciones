package A_CONDICIONALES;

import java.util.Scanner;

public class Ejercicio_3_9_fecha_correcta {

	public static void main(String[] args) {
		// Escribir un programa que pida al usuario el día, mes y año de una fecha, e indicar si la fecha es correcta. 
		//Hay que tener en cuenta que los meses tienen 28, 30 y 31 días. No se considerarán los años bisiestos.	
		Scanner sc = new Scanner(System.in);

		// Escribir un programa que pida al usuario el día, mes y año de una fecha
		
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
			
		}
		
		
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/* Escribir un programa que pida al usuario el día, mes y año de una fecha,
        System.out.print("Ingrese el día: ");
        int dia = scanner.nextInt();

        System.out.print("Ingrese el mes: ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese el año: ");
        int año = scanner.nextInt();

        if (mes >= 1 && mes <= 12) {
            int maxDiasEnMes;	//Hay que tener en cuenta que los meses tienen 28, 30 y 31 días.
            if (mes == 2) {
                maxDiasEnMes = 28;
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                maxDiasEnMes = 30;
            } else {
                maxDiasEnMes = 31;
            }
            
            //indicar si la fecha es correcta
            if (dia >= 1 && dia <= maxDiasEnMes) {
                System.out.println("La fecha es correcta.");
            } else {
                System.out.println("La fecha es incorrecta.");
            }
        } else {
            System.out.println("La fecha es incorrecta.");
        }

        scanner.close();
    }
}*/
				
	
		 