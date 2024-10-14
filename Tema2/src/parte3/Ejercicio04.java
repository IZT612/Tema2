package parte3;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// La variable "numero" será para guardar el numero introducido por el usuario
		int numero;
		
		// La variable "cifra1" será para guardar la primera cifra del numero
		int cifra1;
		
		// La variable "cifra2" será para guardar la segunda cifra del numero
		int cifra2;
		
		// La variable "cifra1String" será para guardar la primera cifra en texto
		String cifra1String;
		
		// La variable "cifra2String" será para guardar la segunda cifra en texto
		String cifra2String;
		
		// Le pedimos al usuario que introduzca el numero
		System.out.println("Introduzca un número del 0 al 99");
		
		// Guardamos el numero en la variable "numero"
		numero = sc.nextInt();
		
		// Obtenemos la primera cifra y la guardamos en "cifra1"
		cifra1  = numero / 10;
		
		// Obtenemos la segunda cifra y la guardamos en "cifra2"
		cifra2 = numero % 10;
		
		// Hacemos un switch con los valores de "cifra1" para psarlos a texto en "cifra1String" teniendo en cuenta que es la decena
		cifra1String = switch(cifra1) {
		
		case 1 -> {
			yield "dieci";
		}
		
		case 2 -> {
			yield "veinti";
		}
		
		case 3 -> {
			yield "treinta";
		}
		
		case 4 -> {
			yield "cuarenta";
		}
		
		case 5 -> {
			yield "cincuenta";
		}
		
		case 6 -> {
			yield "sesenta";
		}
		
		case 7 -> {
			yield "setenta";
		}
		
		case 8 -> {
			yield "ochenta";
		}
		
		case 9 -> {
			yield "noventa";
		}
		
		default -> {
			yield "";
		}
		
		};
		
		// Hacemos un switch con "cifra2" para pasarlo a texto en "cifra2String" teniendo en cuenta que es la unidad
		cifra2String = switch(cifra2) {
		
		case 1 -> {
			yield "uno";
		}
		
		case 2 -> {
			yield "dos";
		}
		
		case 3 -> {
			yield "tres";
		}
		
		case 4 -> {
			yield "cuatro";
		}
		
		case 5 -> {
			yield "cinco";
		}
		
		case 6 -> {
			yield "seis";
		}
		
		case 7 -> {
			yield "siete";
		}
		
		case 8 -> {
			yield "ocho";
		}
		
		case 9 -> {
			yield "nueve";
		}
		
		default -> {
			yield "";
		}
		
		
		};
		
		if (numero < 0 || numero > 99) {
			
			System.out.println("El número no está entre 0 y 99");
			
		}
		
		// Y ahora hacemos ifs y else ifs para cubrir tambien todas las posibles excepciones, como por ejemplo si es 0, es una excepcion ya que no guardamos el 0 como una unidad posible
		else if (numero == 0) {
				
				System.out.println("El número es cero");
				
		// Si es 10 es una excepcion
		} else if (numero == 10) {
				
				System.out.println("El número es diez");
				
		// Si esta entre 0 y 10 simplemente mostramos la unidad
		} else if (numero > 0 && numero < 10){
				
				System.out.println("El número es " + cifra2String);
				
		// Si es 11 es una excepcion
		} else if (numero == 11) {
			
				System.out.println("El número es once");
				
		// Si es 12 es una excepcion
		} else if (numero == 12) {
				
				System.out.println("El número es doce");
				
		// Si es 13 es una excepcion
		} else if (numero == 13) {
				
				System.out.println("El número es trece");
				
		// Si es 14 es una excepcion
		} else if (numero == 14) {
				
				System.out.println("El número es catorce");
				
		// Si es 15 es una excepcion
		} else if (numero == 15) {
				
				System.out.println("El número es quince");	
				
		// Si es 20 es una excepcion
		} else if (numero == 20) {
			
			System.out.println("El número es veinte");
			
		// Si es mayor a 15 y menor a 30 combinamos ambas cifras sin conjuncion
		} else if (numero > 15 && numero < 30) {
				
				System.out.println("El número es " + cifra1String + cifra2String);
			
		// Si es una decena exacta exceptuando el 10 y 20 que ya comprobamos antes (ya que son excepciones a lo que teniamos en el switch), mostramos simplemente la decena
		}  else if ((numero % 10) == 0) {
			
			System.out.println("El número es " + cifra1String);
			
		// Si no es nada de lo anterior, mostramos ambas cifras con la conjuncion "y" en medio
		} else {
				
				System.out.println("El número es " + cifra1String + " y " + cifra2String);
				
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
