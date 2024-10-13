package parte3;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		// Se necesitan mínimo 3 pruebas, para los 2 casos donde el número no es de 8 digitos y un número correcto con un DNI que ya conozcamos
		
		/* Prueba 1
		 * 
		 * Valor de entrada ---> 2
		 * Resultado esperado ---> "El número introducido es erróneo"
		 * Resultado obtenido ---> "El número introducido es erróneo"
		 */
		
		/* Prueba 2
		 * 
		 * Valor de entrada ---> 128947891
		 * Resultado esperado ---> "El número introducido es erróneo"
		 * Resultado obtenido ---> "El número introducido es erróneo"
		 */
		
		/* Prueba 3
		 * 
		 * Valor de entrada ---> 54179723
		 * Resultado esperado ---> "La letra de su DNI será: A"
		 * Resultado obtenido ---> "La letra de su DNI será: A"
		 */
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos una variable entera "numeroDni" donde guardaremos el numero del DNI del usuario
		int numeroDni;
		
		// Creamos una variable entera "numeroDeLetra" donde guardaremos el número que determina que letra tendrá el DNI
		int numeroDeLetra;
		
		// Creamos una variable tipo String "letraDni" donde guardaremos la letra del DNI
		String letraDni;
		
		// Le pedimos al usuario que introduzca su DNI
		System.out.println("Introduzca el número de su DNI para ver que letra le corresponde");
		
		// Leemos el teclado e introducimos el valor recibido en la variable "numeroDni"
		numeroDni = sc.nextInt();
		
		// Primero comprobamos si el número tiene 8 digitos
		if (numeroDni >= 10000000 && numeroDni <= 99999999) {
		
		// Si es el caso procedemos con normalidad, calculando el número que determinará la letra del DNI, y lo guardamos en la variable "numeroDeLetra"
		numeroDeLetra = numeroDni % 23;
		
		// Hacemos un switch para aplicarle a "letraDni" la letra correspondiente segun el valor de "numeroDeLetra"
		letraDni = switch (numeroDeLetra) {
		
		// Si "numeroDeLetra" es 0, la letra será T
		case 0 -> {
			yield "T";
		}
		
		// Si "numeroDeLetra" es 1, la letra será R
		case 1 -> {
			yield "R";
		}
		
		// Si "numeroDeLetra" es 2, la letra será W
		case 2 -> {
			yield "W";
		}
		
		// Si "numeroDeLetra" es 3, la letra será A
		case 3 -> {
			yield "A";
		}
		
		// Si "numeroDeLetra" es 4, la letra será G
		case 4 -> {
			yield "G";
		}
		
		// Si "numeroDeLetra" es 5, la letra será M
		case 5 -> {
			yield "M";
		}
		
		// Si "numeroDeLetra" es 6, la letra será Y
		case 6 -> {
			yield "Y";
		}
		
		// Si "numeroDeLetra" es 7, la letra será F
		case 7 -> {
			yield "F";
		}
		
		// Si "numeroDeLetra" es 8, la letra será P
		case 8 -> {
			yield "P";
		}
		
		// Si "numeroDeLetra" es 9, la letra será D
		case 9 -> {
			yield "D";
		}
		
		// Si "numeroDeLetra" es 10, la letra será X
		case 10 -> {
			yield "X";
		}
		
		// Si "numeroDeLetra" es 11, la letra será B
		case 11 -> {
			yield "B";
		}
		
		// Si "numeroDeLetra" es 12, la letra será N
		case 12 -> {
			yield "N";
		}
		
		// Si "numeroDeLetra" es 13, la letra será J
		case 13 -> {
			yield "J";
		}
		
		// Si "numeroDeLetra" es 14, la letra será Z
		case 14 -> {
			yield "Z";
		}
		
		// Si "numeroDeLetra" es 15, la letra será S
		case 15 -> {
			yield "S";
		}
		
		// Si "numeroDeLetra" es 16, la letra será Q
		case 16 -> {
			yield "Q";
		}
		
		// Si "numeroDeLetra" es 17, la letra será V	
		case 17 -> {
			yield "V";
		}
		
		// Si "numeroDeLetra" es 18, la letra será H
		case 18 -> {
			yield "H";
		}
		
		// Si "numeroDeLetra" es 19, la letra será L
		case 19 -> {
			yield "L";
		}
		
		// Si "numeroDeLetra" es 20, la letra será C
		case 20 -> {
			yield "C";
		}
		
		// Si "numeroDeLetra" es 21, la letra será K
		case 21 -> {
			yield "K";
		}
		
		// Si "numeroDeLetra" es 22, la letra será E
		case 22 -> {
			yield "E";
		}
		
		// Es imposible que "numeroDeLetra" tenga otro valor, pero ponemos el default para evitar errores en el código
		default ->{
			yield "N/A";
		}
		
		};
		
		// Le mostramos al usuario la letra de su DNI
		System.out.println("La letra de su DNI será: " + letraDni);
		
		// Si no es un número con 8 dígitos el número es erroneo
		} else {
			
			// Se lo mostramos al usuario
			System.out.println("El número introducido es erróneo");
			
		}
		
		// Cerramos el scanner
		sc.close();
		
	}

}
