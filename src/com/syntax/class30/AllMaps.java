package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
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
	
	Map<String, Integer> shopping=new TreeMap<>();
	shopping.putAll(grocery);
	shopping.putAll(household);
	System.out.println(shopping);
	
	//get all keys:
	for(String key:shopping.keySet()) {
		System.out.println("key: "+key);
	}
	System.out.println("-----------Value using Iterator-----------");
	//get all keys using iterator
	Iterator<String> k=shopping.keySet().iterator();
	while(k.hasNext()) {
		String e=k.next();
		System.out.println(e);
	}
	System.out.println("-----values using Iterator-----");
	Iterator<Integer> i=shopping.values().iterator();
	while(i.hasNext()) {
		int j=i.next();
		System.out.println(j);
	}
	
	//get all values using loop
	System.out.println("--------using loop getting values------");
	for(int f:shopping.values()) {
		System.out.println(f);
	}
		
	
	
	}
}
