package A_CONDICIONALES;
import java.util.Scanner;
public class Ejercicio_3_12_1_segundo_mas {

	public static void main(String[] args) {
		// Escribir un programa que pida una hora en el formato horas, minutos y segundos y muestre a continuación que hora será un segundo más tarde. 
		//Por ejemplo: hora actual (10:41:59) -> hora actual + 1 segundo -> (10:42:00)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la hora--> ");
		int hora = sc.nextInt();
		System.out.println("Introduce la minuto--> ");
		int minuto = sc.nextInt();
		System.out.println("Introduce la segundo--> ");
		int segundo = sc.nextInt();
		
		segundo++;
		
		if (segundo==60) {
			segundo = 0;
				minuto++;
				
				if (minuto==60) {
					minuto=0;
					hora++;
					
					if(hora==24) {
						hora=0;
					}
					
				}
			
		}
		
		System.out.println("La hora es"+hora + minuto + segundo);
		
		
				

	}

}
