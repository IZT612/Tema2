package englishexercises2;

import java.util.Scanner;

public class exercise02 {

	public static void main(String[] args) {
		
		int pay;
		
		int price;
		
		int change;
		
		int twohundred = 0;
		
		int onehundred = 0;
		
		int fifty = 0;
		
		int twenty = 0;
		
		int ten = 0;
		
		int five = 0;
		
		int two = 0;
		
		int one = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Whats the price?");
		
		price = sc.nextInt();
		
		System.out.println("How much does the client pay?");
		
		pay = sc.nextInt();
		
		change = pay - price;
		
		if (change >= 200) {
			
			twohundred = change / 200;
			
			change = change - twohundred * 200;
			
		}
		if (change >= 100) {
			
			onehundred = change / 100;
			
			change = change - onehundred * 100;
			
		}
		if (change >= 50) {
			
			fifty = change / 50;
			
			change = change - fifty * 50;
			
		}
		if (change >= 20) {
			
			twenty = change / 20;
			
			change = change - twenty * 20;
			
		}
		if (change >= 10) {
			
			ten = change / 10;
			
			change = change - ten * 10;
			
		}
		if (change >= 5) {
			
			five = change / 5;
			
			change = change - five * 5;
			
		}
		if (change >= 2) {
			
			two = change / 2;
			
			change = change - two * 2;
			
		}
		if (change >= 1) {
			
			one = change / 1;
			
			change = change - one * 1;
			
		}
		
		System.out.println("The change is: ");
		
		System.out.println( twohundred + " coins of two euros");
		System.out.println( onehundred + " coins of one euro");
		System.out.println( fifty + " coins of fifty cents");
		System.out.println( twenty + " coins of twenty cents");
		System.out.println( ten + " coins of ten cents");
		System.out.println( five + " coins of five cents");
		System.out.println( two + " coins of two cents");
		System.out.println( one + " coins of one cents");
				
		
		sc.close();
		
		
		
	}

}
