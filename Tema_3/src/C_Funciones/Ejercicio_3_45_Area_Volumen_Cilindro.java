package C_Funciones;

import java.util.Scanner;

public class Ejercicio_3_45_Area_Volumen_Cilindro {

	public static void main(String[] args) {
		//Realizar una función que calcule y muestre el área o el volumen de un cilindro, según se especifique.
		//Para distinguir un caso de otro se le pasará como opción un número: 1 para el área o 2 para el volumen.
		
		//Además, la función recibirá como parámetros el radio de la base y la altura del cilindro
		
		//Escribir un programa que solicite al usuario el tipo de cálculo que desea realizar y los valores de la altura (h) y el radio (r) de un cilindro.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca 1 si quiere saber el area o Introduzca 2 si quiere saber el volumen ");
		int opcion = sc.nextInt();
		

		System.out.println("Introduce el Radio");
		double radio = sc.nextDouble();
		
		System.out.println("Introduce la altura");
		double altura = sc.nextDouble();

		
		if(opcion==1) {
			double area = cilindroArea(radio, altura);
			System.out.println("El area del cilindro es "+area);
		}else if(opcion ==2) {
			double volumen = cilindroVol( radio,  altura);
			System.out.println("El volumen del cilindro es "+volumen);
		}
	}

	public static double cilindroArea(double radio, double altura) {
		
		double AreaL= (int) (2 * Math.PI * radio * altura);
		double AreaT =(int) (2 * Math.PI * (radio*2)  +  AreaL);
		return AreaT;
	
	}
	public static double cilindroVol(double radio, double altura) {
		double volumen = (int) (Math.PI *(radio*2)*altura);
		return volumen;
		
	}
}

