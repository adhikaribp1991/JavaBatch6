package com.syntax.class11;

import java.util.Scanner;

public class TaskUserPassword {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your user name");
		String userName=scan.next();
		System.out.println("Enter your password");
		String password=scan.next();
		System.out.println("Please comfirmed your password");
		String confirmedPassword=scan.next();
		if(userName.isEmpty() || password.isEmpty()){
			System.out.println("Username and password cannot be empty");
			if(password.length()<8) {
				System.out.println("Password is too short");
				
			}else if(password)
			
		}
		
		
	}

}
