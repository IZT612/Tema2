package parte5;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable "num" donde guardaremos el numero introducido por el usuario del que mostraremos la tabla de multiplicar
		int num;
		
		// Creamos la variable "contador" la cual determinará si el bucle se repite o no, además de por qué numero se multiplica el numero del usuario
		int contador = 0;
		
		// Le pedimos al usuario un numero
		System.out.println("Introduzca un número para mostrar la tabla de multiplicar");
		
		// Introducimos el valor en "num"
		num = sc.nextInt();
		
		// Creamos un do while
		do {
			
			// Incrementamos el contador
			contador++;
			
			// Multiplicamos el numero por el contador y lo mostramos al usuario
			System.out.println(num + " * " + contador + " = " + (num * contador));
			
		// Repetimos mientras el contador sea menor a 10, ya que cuando sea 10 habremos acabado
		} while (contador < 10);
		
		// Cerramos el scanner
		sc.close();

	}

}
