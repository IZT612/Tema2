package parte7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable "numero" donde guardaremos el numero introducido por el usuario
		int numero = 0;
		
		// Creamos la variable "numeroBucle" donde guardaremos el numero del usuario y modificaremos en un proximo bucle 
		int numeroBucle;
		
		// Creamos una variable booleana "error" donde verificaremos si se ha cometido un error introduciendo el numero
		boolean error;
		
		// Creamos una variable booleana "capicua" para verificar si el numero es capicua
		boolean capicua = false;
		
		// Creamos una variable "numeroInvertido" donde guardaremos el numero invertido para ver si es capicua
		int numeroInvertido = 0;
		
		// Hacemos un do-while para verificar si el numero introducido es correcto
		do {

			error = false;

			try {

				System.out.println("Introduzca un número para indicar cuantas cifras tiene");

				numero = sc.nextInt();

				assert (numero > 0) : "El número introducido debe ser mayor a 0";

			} catch (InputMismatchException e) {

				System.out.println("Debe introducir un número, ni texto ni decimales");

				error = true;

			} catch (AssertionError e) {

				System.out.println(e.getLocalizedMessage());

				error = true;
			}
			
			sc.nextLine();

		} while (error);
		
		// Guardamos el numero que usaremos en el bucle como el numero del usuario
		numeroBucle = numero;
		
		// Hacemos un while para invertir el número, este se repetirá siempre que el numero del bucle sea distinto a 0
		while (numeroBucle != 0) {
			
			// Creamos una variable que solo usaremos en este bucle, para conseguir el ultimo digito
			int ultimoDigito;
			
			// Obtenemos el ultimo digito del numero
			ultimoDigito = numeroBucle % 10;
			
			// Lo colocamos delante, multiplicando lo anterior por 10 para así invertir el orden
			numeroInvertido = numeroInvertido * 10 + ultimoDigito;
			
			// Dividimos el número del bucle entre 10 para quitarle ese ultimo digito que hemos obtenido
			numeroBucle /= 10;
			
		}
		
		// Si el número es igual al numero invertido entramos al condicional
		if (numero == numeroInvertido) {
			
			// Y ponemos que el numero si es capicua
			capicua = true;
			
		// Si no, entramos al else
		} else {
			
			// Donde ponemos que el numero no es capicua
			capicua = false;
			
		}
		
		
		// Si es capicua, entramos al condicional
		if (capicua) {
			
			// Le informamos al usuario que el numero es capicua
			System.out.println("El numero " + numero + " es capicúa");
			
		// Si no, entramos al else
		} else {
			
			// Y le informamos al usuario que el numero no es capicua
			System.out.println("El numero " + numero + " no es capicúa");
			
		}
		
		// Cerramos el scanner
		sc.close();
		
    }
}