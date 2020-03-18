package com.syntax.class6;

import java.util.Scanner;

public class SwitchExercise {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter your country");
		String country=scan.nextLine();
		String favouriteFood;
		switch(country.toUpperCase()) {
		case "MOROCCO":
			favouriteFood="couscous";
			break;
		case "belarus":
			favouriteFood="Potato";
			break;
		case"turkey":
			favouriteFood="Baklava";
			break;
		case "afganisthan":
			favouriteFood="Mantu";
			break;
		case "kazakhstan":
			favouriteFood="Beshparmak";
			break;
		default:
			favouriteFood="Unknown";
			
		}
		System.out.println(favouriteFood);

	}

}
