package parte4;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable "edad" donde guardaremos la edad introducida por el usuario
		int edad;
		
		// Creamos la variable "suma" donde guardaremos la suma de todas las edades
		int suma = 0;
		
		// Creamos la variable "contadorTotal" donde guardaremos la cantidad de alumnos que se han introducido
		int contadorTotal = 0;
		
		// Creamos la variable "contadorMayores" donde guardaremos la cantidad de alumnos que son mayores de edad
		int contadorMayores = 0;
		
		// Le pedimos al usuario que introduzca la edad del alumno.
		System.out.println("Introduzca la edad del alumno. Introduzca un número negativo para finalizar el programa");
		
		// Introducimos el valor recibido en la variable "edad"
		edad = sc.nextInt();
		
		// Creamos un bucle mientras que la edad sea mayor a 0
		while (edad > 0) {
			
			// Sumamos 1 al contador total
			contadorTotal++;
			
			// Sumamos la edad a la variable "suma"
			suma += edad;
			
			// Mediante un operador ternario comprobamos si la edad es mayor o igual a 18 sumamos 1 al contador de mayores de edad, si no, no lo modificamos
			contadorMayores = edad >= 18 ? contadorMayores + 1 : contadorMayores;
			
			// Le pedimos al usuario que introduzca nuevamente la edad
			System.out.println("Introduzca la edad del alumno. Introduzca un número negativo para finalizar el programa");
			
			// Introducimos el valor recibido en la variable "edad"
			edad = sc.nextInt();
			
		}
		
		// Si no se han introducido edades positivas entramos en el condicional
		if (contadorTotal == 0) {
			
			// Le informamos al usuario de que no ha introducido ningun alumno
			System.out.println("No se ha introducido ningún alumno");
			
		// Si es correcto, le mostramos todo lo que pide
		} else {
			
			// Mostramos la suma de todas las edades
			System.out.println("La suma de todas las edades es " + suma);
			
			// Mostramos la media de todas las edades
			System.out.println("La media de las edades es " +((double) suma /  contadorTotal));
			
			// Mostramos la cantidad total de alumnos
			System.out.println("La cantidad de alumnos totales es de: " + contadorTotal);
			
			// Si no se han introducido mayores de edad entramos en el condicional
			 if (contadorMayores == 0) {
				 
				// Le mostramos al usuario que no ha introducido alumnos mayores de edad
				System.out.println("No se han introducido alumnos mayores de edad");
				 
			// Si no es el caso procedemos
			 } else {
				 
				 // Y le mostramos al usuario la cantidad de alumnos mayores de edad
				System.out.println("La cantidad de alumnos mayores de edad es de: " + contadorMayores);
				 
			 }
			
		}
		
		// Cerramos el scanner
		sc.close();
			
	}
		
		
		
}
