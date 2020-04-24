package com.syntax.class30;

import java.util.*;

import com.syntax.class14.Shop;

public class AllMapss {
	public static void main(String[] args) {
		Map<String, Integer> grocery=new HashMap<>();
		grocery.put("Milk", 1);
		grocery.put("Cucumber", 3);
		grocery.put("Banana", 12);
		grocery.put("Cheese", 2);
		grocery.put("grapes", 3);
		System.out.println(grocery);
		
		//create a map of item to buy (item, quantity) in which we want save the order
		Map<String, Integer> household=new LinkedHashMap<>();
		household.put("Lysol", 4);
		household.put("Sanitizer", 2);
		household.put("paper towel", 5);
		household.put("toilet Paper", 3);
		household.put("face mask", 50);
		System.out.println(household);
		
		//create a map in which we store all previous items in ascending order
		Map<String, Integer> shopping=new TreeMap<>(grocery);
		//shopping.putAll(grocery);
		shopping.putAll(household);
		System.out.println(shopping);
		
		//get all keys
		System.out.println("---------printing all keys using for loop--------------");
		for(String shop:shopping.keySet()) {
		System.out.println(shop);
		
		}
		System.out.println("---------printing all keys using Iterator--------------");
		Iterator<String> shopp=shopping.keySet().iterator();
		while(shopp.hasNext()) {
			System.out.println("Key ="+shopp.next());
		}
		System.out.println("---------printing all values using loop--------------");
		for(Integer househ:shopping.values()) {
			System.out.println("values ="+househ);
		}
		//get all values using Iterator
		System.out.println("---------printing all values using Iterator--------------");
		Iterator<Integer> itValues=shopping.values().iterator();
		while(itValues.hasNext()) {
			int v=itValues.next();
			System.out.println("values ="+v);
		}
	}

}
