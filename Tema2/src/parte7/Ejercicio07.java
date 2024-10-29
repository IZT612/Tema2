package parte7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable "numero" donde guardaremos el número introducido por el usuario
		int numero = 0;
		
		// Creamos una variable booleana "error" donde guardaremos si el valor introducido por el usuario dará error o no
		boolean error;
		
		// Hacemos un bucle do-while para hacer que el usuario introduzca un valor correcto
		do {
			
			// Ya que esto se puede repetir si el error es true, al inicio de cada iteración lo ponemos como false
			error = false;
			
			// Hacemos un try para ver si algo de dentro nos da error
			try {
			
				// Le pedimos al usuario un número
				System.out.println("Introduzca un número para mostrar una pirámide de números hasta ese número");
			
				// Introducimos el número en la variable "numero"
				numero = sc.nextInt();
				
				// Hacemos un assert para que nos devuelva un error si el número no es mayor o igual a 1
				assert (numero >= 1) : "El número introducido debe ser 1 o mayor";
			
			// Capturamos el error Mismatch (si lo hay), en caso de que introduzca texto
			} catch (InputMismatchException e) {
				
				// Le decimos al usuario que no puede introducir texto
				System.out.println("No se puede introducir texto");
				
				// Hay error así que lo ponemos como true
				error = true;
				
			// La otra posibilidad es que ponga un número no válido, es decir nos devolverá el error que forzamos con el assert, y lo capturamos
			} catch (AssertionError e) {
				
				// Le mostramos al usuario el mensaje del assert que causó este error
				System.out.println(e.getLocalizedMessage());
				
				// Ponemos error como true
				error = true;
				
			// Finalmente limpiamos el scanner
			} finally {
				
				sc.nextLine();
				
			}
			
		// El bucle se repetirá mientras haya un error
		} while (error);
		
		// Creamos un for el cual irá incrementando cada iteración, y se repetirá hasta que alcance el número del usuario, representa las filas
		for (int numeroActual = 1 ; numeroActual <= numero ; numeroActual++) {
			
			// Creamos un for el cual irá mostrando números del 1 hasta el número correspondiente a cada fila
			for (int numeroPrintCreciente = 1 ; numeroPrintCreciente <= numeroActual ; numeroPrintCreciente++) {
				
				System.out.print(numeroPrintCreciente + " ");
				
			}
			
			// Creamos otro for el cual hará lo mismo que el anterior pero decreciendo hasta el 1
			for (int numeroPrintDecreciente = numeroActual - 1 ; numeroPrintDecreciente >= 1 ; numeroPrintDecreciente--) {
				
				System.out.print(numeroPrintDecreciente + " ");
				
			}
			
			// Hacemos un println para cambiar de fila
			System.out.println();
			
		}
		

	}

}
