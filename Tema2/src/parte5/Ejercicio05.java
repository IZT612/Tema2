package parte5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Random random = new Random();
		
		int numero;
		
		int mayorQue;
		
		int menorQue;
		
		String respuesta;
		
		
		
		do {
			
			numero = random.nextInt(1,101);
			
			System.out.println(numero);
			
			respuesta = sc.nextLine();
			
			if (respuesta.equals("menor")) {
				
				mayorQue = numero;
				
			}
			
			
		} while (true);

	}

}
