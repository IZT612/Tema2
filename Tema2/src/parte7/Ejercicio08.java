package parte7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		
		int ultimoNumero;
		
		boolean error = false;
		
		do {
			
			try {
				
				System.out.println("Introduzca un número mayor al anterior");
				
				numero = sc.nextInt();
				
			} catch  (InputMismatchException e) {
				
				System.out.println("No puede introducir texto");
				error = true;
				
			}
			
			
		} while (numero != 0 || error);

	}

}
