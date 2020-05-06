package com.syntax.class33;

public class InfoAboutExpection {
	public static void main(String[] args) {
		String str="Hello";
		try {
		char character=str.charAt(10);//=new StringIndexOutOfBoundsException Object
		System.out.println(character);
		}catch(StringIndexOutOfBoundsException se) {
			//to get info about the exception
			//se.printStackTrace();//name message about Exception, where it occours
			//System.out.println(se);
			System.out.println(se.getMessage());
			
		}
		System.out.println("-----END OF PROGRAM--------");
	}

}
