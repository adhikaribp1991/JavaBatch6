package com.syntax.class12;

public class TaskInClass2 {

	public static void main(String[] args) {
//Create a String and if the String is not empty perform the following: 
//	if the String has an odd number of characters and has 3 or more characters,
//print the character in the middle of the String.
		String str="Sundays";
		
		if(!(str.isEmpty())) {
			if ((str.length()%2!=0)){
				if(str.length()>=3) {
					char letter=str.charAt((str.length()-1)/2);
					System.out.println(letter);
					
					
				}else {
					System.out.println("String has less than 3 characters");
				}
				
			}else {
				System.out.println("String has even number of character");
			}
			
			
		}else {
			System.out.println("String is empty");
		}


	}

}
