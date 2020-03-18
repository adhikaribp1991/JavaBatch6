package com.syntax.class12;

public class StringManupulations {

	public static void main(String[] args) {
		String str="Good Morning Students!";
		char letter1=str.charAt(0);
		System.out.println(letter1);
		
		char letter8=str.charAt(8);
		System.out.println(letter8);
		//char someLetter=str.charAt(55);
		
		//System.out.println(someLetter);
		//Get all character 1 by 1 from a string
		
		char letter;
		for(int i=0;i<str.length(); i++) {
			letter=str.charAt(i);
			System.out.print(letter+" ");
			
		}
		System.out.println();
		System.out.println("-------indexof() Function--------");
		
		String name="Syntax Technologies";
		int index=name.indexOf("T");
		System.out.println(index);
		
		index=name.indexOf(" ");
		System.out.println(index);
		
		index=name.indexOf("Syntax");
		System.out.println(index);
		
		index=name.indexOf("!");
		System.out.println(index);
		
		index=name.indexOf("o");
		System.out.println(index);
		
		index=name.lastIndexOf("o");
		System.out.println("o="+index);
	}

}
