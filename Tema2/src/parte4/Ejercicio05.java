package parte4;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int edad;
		
		int suma = 0;
		
		double contadorTotal = 0;
		
		double contadorMayores = 0;
		
		System.out.println("Introduzca la edad del alumno. Introduzca un número negativo para finalizar el programa");
		
		edad = sc.nextInt();
		
		while (edad > 0) {
			
			contadorTotal++;
			
			suma += edad;
			
			contadorMayores = edad >= 18 ? contadorMayores + 1 : contadorMayores;
			
			System.out.println("Introduzca la edad del alumno. Introduzca un número negativo para finalizar el programa");
			
			edad = sc.nextInt();
			
		}
		
		if (contadorTotal == 0) {
			
			System.out.println("No se ha introducido ningún alumno");
			
		} else {
			
			System.out.println("La suma de todas las edades es " + suma);
			System.out.println("La media de las edades es " + (suma / contadorTotal));
			System.out.println("La cantidad de alumnos totales es de: " + contadorTotal);
			System.out.println("La cantidad de alumnos mayores de edad es de: " + contadorMayores);
			
		}
		
		sc.close();
			
	}
		
		
		
}
