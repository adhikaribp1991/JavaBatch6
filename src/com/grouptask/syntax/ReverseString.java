package com.grouptask.syntax;

public class ReverseString {

	public static void main(String[] args) {
		//Write a java program to reverse String? 
		//Reverse a string word by word?
		String name="Bishnu Prasad Adhikari";
		String []Reverse=name.split(" ");
		
		
		for(int i=Reverse.length-1; i>=0;i--) {
			
		System.out.print(Reverse[i]+ " ");	
			
		}
		
		

	}

}
