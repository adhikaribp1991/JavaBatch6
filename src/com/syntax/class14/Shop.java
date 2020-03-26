package com.syntax.class14;

import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {
		//creating an object
		//instanciate phone class
		
		Phone phone1=new Phone();
		phone1.make="iphone";
		phone1.model="11maxpro";
		phone1.color="Black";
		phone1.playVideo();
		phone1.makePhoneCall();
		phone1.playMusic();
		
		
		Phone phone2=new Phone();
		phone2.make="Android";
		phone2.model="S20+";
		phone2.color="White";
		
		Phone phone3=new Phone();
		phone3.make="Nokia";
		phone3.model="Nokia8110";
		
		String str="hello";
		 str=str.replace("hello", "welcome");
		 Scanner scan=new Scanner(System.in);
		 scan.nextLine();
		 
		 
	}

}
