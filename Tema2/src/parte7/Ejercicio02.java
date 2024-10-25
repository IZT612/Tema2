package parte7;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		int sumaPrimos = 0;
		
		boolean primo;
		
		System.out.println("Introduzca un número");
		
		numero = sc.nextInt();
		
		for (int numerosPrimos = 2 ; numerosPrimos < numero ; numerosPrimos++) {
			
			primo = true;
			
			for (int i = 2 ; primo && i != numerosPrimos ; i++ ) {
				
				if (numerosPrimos % i == 0 && primo) {
					
					primo = false;
					
				}
				
			}
			
			if (primo) {
				
				System.out.println(numerosPrimos);
				sumaPrimos++;
			}
					
		}
		
		System.out.println("Son " + sumaPrimos + " números primos en total");

		
		sc.close();

	}

}
