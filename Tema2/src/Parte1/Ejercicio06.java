package Parte1;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		int b;
		
		int c;
		
		double resultadoPositivo;
		
		double resultadoNegativo;
		
		System.out.println("Introduzca el valor de a para calcular x");
		
		a = sc.nextInt();
		
		System.out.println("Introduzca el valor de b");
		
		b = sc.nextInt();
		
		System.out.println("Introduzca el valor de c");
		
		c = sc.nextInt();
		
		resultadoPositivo = ((-b + Math.sqrt(b * b - 4 * a * c )) / (2 * a));
		
		resultadoNegativo = ((-b - Math.sqrt(b * b - 4 * a * c )) / (2 * a));
		
		System.out.println(resultadoPositivo);
		
		System.out.println(resultadoNegativo);
		
		sc.close();

	}

}
