package parte7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable "numero" donde guardaremos el numero que introduzca el usuario
		int numero = 0;
		
		// Creamos la variable "cifras" donde guardaremos cuantas cifras tiene el numero del usuario
		int cifras = 0;
		
		// Creamos una variable booleana "fin" donde guardaremos si el bucle debe dejar de verificar las cifras
		boolean fin = false;
		
		// Creamos una variable booleana "error" que servirá para pedir nuevamente el número si es incorrecto
		boolean error;
		
		// Creamos un bucle do-while para pedir un valor hasta que este sea correcto
		do {
			
			// Ponemos "error" como false para evitar bucles infinitos
			error = false;
			
			// Hacemos un try para ver si hay errores a la hora de pedir el numero
			try {
				
				// Pedimos el numero
				System.out.println("Introduzca un número para indicar cuantas cifras tiene");
				
				// Lo guardamos en "numero"
				numero = sc.nextInt();
				
				// Si el número no es mayor a 0 obligaremos al programa a lanzar un error
				assert (numero > 0) : "El número introducido debe ser mayor a 0";
				
			// Atrapamos cualquier posible error donde el usuario no introduzca un numero entero
			} catch (InputMismatchException e) {
				
				// Le indicamos que no puede contener texto ni decimales
				System.out.println("Debe introducir un número, no texto ni decimales");
				
				// Ponemos "error" como true
				error = true;
				
			// Atrapamos el error obligado en caso de no ser mayor a 0 
			} catch (AssertionError e) {
				
				// Le mostramos al usuario el mensaje donde decimos que debe ser mayor a 0
				System.out.println(e.getLocalizedMessage());
				
				// Ponemos "error" como true
				error = true;
			}
			
			// Limpiamos el scanner
			sc.nextLine();
			
		// Se repite mientras haya un error
		} while (error);
		
		// Creamos un bucle "for" donde iremos incrementando el divisor * 10 hasta que no se pueda dividir
		for (int divisor = 1 ; !fin ; divisor *= 10) {
			
			// Si se puede dividir entramos al condicional
			if (numero / divisor != 0) {
				
				// Incrementamos en 1 la cantidad de cifras
				cifras++;
				
			// Si no es el caso entramos en el else
			} else {
				
				// Ponemos "fin" como true
				fin = true;
				
			}
			
		}
		
		// Le mostramos al usuario las cifras que tenía su número
		System.out.println("El número tiene " + cifras + " cifras");
		
		// Cerramos el scanner
		sc.close();

	}

}
