package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AllMaps {
	public static void main(String[] args) {
		//lets create a grocery map in which we do not  care about order
	Map<String, Integer> grocery=new HashMap<>();
	grocery.put("milk",  1);
	grocery.put("cucumber",  3);
	grocery.put("banana",  12);
	grocery.put("cheese",  2);
	grocery.put("grapes",  3);
	System.out.println(grocery);
	
	//create a map of items to buy(item, quantity) in
	Map<String, Integer> household=new LinkedHashMap<>();
	household.put("lysol", 2);
	household.put("sanitizer", 2);
	household.put("paper towel", 3);
	household.put("toilet paper", 10);
	household.put("face mask", 50);
	System.out.println(household);
	
	Map<String, Integer> shopping=new TreeMap<>(grocery);
	shopping.putAll(household);
	System.out.println(shopping);
	
	Iterator<String> it=shopping.keySet().iterator();
	while(it.hasNext()) {
		String key=it.next();	
		System.out.println("Keys : "+key);
		}
	System.out.println("-----Using For Loop---------");
	for(String keys:shopping.keySet()) {
		System.out.println("Keys : "+keys);
	}
	System.out.println("---values using for loop-------");
	for(int value:shopping.values()) {
		System.out.println(value);
	}
//get all values using iterator
	System.out.println("----Getting all values using Iterator-----");
	Iterator<Integer> iter=shopping.values().iterator();
	while(iter.hasNext()) {
		int ite=iter.next();
		System.out.println(ite);
	}
	}
}
