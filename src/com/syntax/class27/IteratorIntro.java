package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorIntro {
	public static void main(String[] args) {
		// creating arraylist of chocolate
		ArrayList<String> chocolate=new ArrayList<>();
		chocolate.add("Kinder");
		chocolate.add("Kit kat");
		chocolate.add("Godiva");
		chocolate.add("Snikers");
		
		//creating arraylist of sweets
		ArrayList<String> sweets=new ArrayList<>();
		sweets.add("Ice cream");
		sweets.add("Cheese cream");
		sweets.addAll(chocolate);
		
		System.out.println(sweets.size()); 
		System.out.println(sweets);
		System.out.println("-------------------------");
		
		//we want to iterate through collection
		Iterator<String> it=sweets.iterator();
		
		while(it.hasNext()) {
			String element=it.next();
			if(element.equals("Ice cream")) {
				it.remove();
			}
			
			
		}
		System.out.println(sweets);
		
		
	}

}
