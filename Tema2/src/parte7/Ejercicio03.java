package parte7;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos las variables "numeroA" y "numeroB" donde guardamos los numeros introducidos por el usuario
		int numeroA;
		int numeroB;
		
		// Creamos la variable "menor" donde guardaremos el número más pequeño
		int menor;
		
		// Creamos la variable "mcd" donde guardaremos el máximo comun divisor
		int mcd = 0;
		
		// Creamos la variable booleana "hayMcd" donde guardaremos si se ha encontrado máximo comun divisor
		boolean hayMcd = false;
		
		// Creamos un bucle do-while para que introduzca un valor correcto
		do {
		
			// Le pedimos al usuario el primer numero
			System.out.println("Introduzca el primer número");
			
			// Lo guardamos en la variable "numeroA"
			numeroA = sc.nextInt();
		
		// Se repite mientras el número sea 0
		} while (numeroA == 0);
		
		// Creamos un bucle do-while para que introduzca un valor correcto
		do {
			
			// Le pedimos al usuario el primer numero
			System.out.println("Introduzca ahora el segundo número");
			
			// Lo guardamos en la variable "numeroB"
			numeroB = sc.nextInt();
			
		// Se repite mientras el número sea 0
		} while (numeroB == 0);
		
		// Si el número A es menor al número B lo ponemos como menor
		if (numeroA < numeroB) {
			
			menor = numeroA;
			
		// Si es al contrario, el B será menor
		} else if (numeroB < numeroA) {
			
			menor = numeroB;
			
		// Si no es el caso, son iguales, solo hay un posible máximo comun divisor
		} else {
			
			menor = 0;
			mcd = numeroA;
			hayMcd = true;
			
		}
		
		// Creamos un bucle for, con un contador que empieza como el menor de los 2, y se repite hasta que haya maximo comun divisor, tambien vamos restando el contador -1 por cada iteracion
		for (int i = menor ; !hayMcd ; i--) {
			
			// Comprobamos si puede dividir a ambos números y entramos al condicional si es el caso
			if (numeroA % i == 0 && numeroB % i == 0) {
				
				// El máximo comun divisor será el contador
				mcd = i;
				
				// Hemos encontrado maximo comun divisor asi que ponemos "hayMcd" como true
				hayMcd = true;
				
			}
			
		}
		
		// Le mostramos al usuario el máximo comun divisor
		System.out.println("El máximo común divisor es: " + mcd);
		
		// Cerramos el scanner
		sc.close();

	}

}
