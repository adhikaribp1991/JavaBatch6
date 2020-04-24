package com.syntax.class30;

import java.util.*;

public class Task1Map {
	public static void main(String[] args) {
		Map<Integer, String> building=new LinkedHashMap<>();
		building.put(1, "Google");
		building.put(2, "Syntax");
		building.put(3, "Google");
		building.put(4, "Amazon");
		building.put(4, "Amazon");
		building.put(5, "HP");
		building.put(6, "Microsoft");
		building.put(7, "Oracle");
		System.out.println(building.size());
		System.out.println(building);
		//how do we get all keys
		Set<Integer> keys=building.keySet();
		Iterator<Integer> key=keys.iterator();
		while(key.hasNext()) {
			int k=key.next();
			System.out.println(k+" "+building.get(k)+" ");
		}
		System.out.println("---Using Advance For Loop--------");
		for(int keey:keys) {
			System.out.println("Key from building map is "+keey+" "+"value from building map is "+building.get(keey)+"   ");
		
		}
		System.out.println("---------------Retriving all values-----------------");
		//how to get all values from Map
		Collection<String> values=building.values();
		for(String valu:values) {
			System.out.println("value from collection "+valu);
		}
		System.out.println("------------Using Iterator------------");
		Iterator<String> it=values.iterator();
		while(it.hasNext()) {
			System.out.println("values using iterator "+it.next());
		}
		
	}
}
