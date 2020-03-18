package com.syntax.class7;

import java.util.Scanner;

public class LoopsAndScanner {

	public static void main(String[] args) {
		int num=1;
		String name=null;
		while(num<5) {
		Scanner scan=new Scanner(System.in);
		
			
			num++;
		System.out.println("Enter your name");
		
		 name=scan.nextLine();
		
		
		
		}
		System.out.println("Good afternoon "+name);
	}

}
