package com.syntax.class5;

import java.util.Scanner;

public class Task1LogicalOperator {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter your person height");
		int height= xyz.nextInt();
		
		if (height<60) {
			System.out.println("The person is short");
		}else if(height>60 && height<=72) {
			System.out.println("The height of the person is medium");

	}else if(height>72) {
		System.out.println("The person is tall");
	}else {
		System.out.println("This result is not mentioned above");
	}

}
}