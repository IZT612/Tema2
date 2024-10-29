package englishexercises2;

import java.util.Scanner;

public class exercise01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hours;
		
		int minutes;
		
		int realHours;
		
		int realMinutes;
		
		do {
		
			System.out.println("Introduce the amount of hours that you see");
		
			hours = sc.nextInt();
			
		} while (hours < 1 || hours > 12);
		
		do {
			
			System.out.println("Introduce now the amount of minutes that you see");
		
			minutes = sc.nextInt();
			
		} while (minutes < 0 || minutes > 59);
		
		realHours = 12 - hours;
		
		realMinutes = 60 - minutes;
		
		if (realHours == 0) {
			
			realHours = 12;
			
		}
		
		if (realMinutes == 60) {
			
			realMinutes = 0;
			
		}
		
		if (realMinutes != 0) {
			
			realHours--;
			
		}
		
		System.out.println("The real hour is: " + realHours + ":" + realMinutes);
		
		sc.close();

	}

}
