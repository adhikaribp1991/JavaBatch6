package com.syntax.class15;

public class Palindrome {
	
	void isPalindrome(String isPalin) {
		for(int i=isPalin.length()-1;i>=0;i-- ) {
			
		}	
		
		if(isPalin.equalsIgnoreCase("RaDar")) {
			System.out.println("Given string is palindrome");
		}else {
			System.out.println("Given string is not palindrome");
		
		}
	}
		public static void main(String [] args) {
		Palindrome isPal=new Palindrome();
		isPal.isPalindrome("radar");
			
		}
	}


