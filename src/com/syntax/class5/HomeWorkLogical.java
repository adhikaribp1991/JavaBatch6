package com.syntax.class5;
import java.util.Scanner;

public class HomeWorkLogical {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your hour");
		int hour =scan.nextInt();
		String timeOfday;
		
		if (hour>=1 && hour<=11) {
			timeOfday="Morning";
			
			
		}else if(hour>=12 && hour<=15) {
			timeOfday="Afternoon";
			
		}else if(hour>=16 && hour<=20) {
			timeOfday="Evening";
			
		}else if(hour>=21 && hour<=24) {
			timeOfday="Night";
		}else {
			timeOfday="Unknown";
		}
		//if timeOfday>24 the result is unknown. if we donot want a see the result unknown we put reverse(Not) sign.
		if(!timeOfday.equals("Unknown")) {
		System.out.println("Right now is "+timeOfday);
	}
	}
}
