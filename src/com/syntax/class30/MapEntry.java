package com.syntax.class30;

import java.util.*;
import java.util.Map.Entry;

public class MapEntry {
	public static void main(String[] args) {
	//create a map that will store month and days in a month
		Map<String, Integer> months=new LinkedHashMap<>();
		months.put("January", 31);
		months.put("February", 28);
		months.put("March", 31);
		months.put("April", 30);
		System.out.println(months.size());
		
		//get all entries from a map
		Set<Entry<String, Integer>> entries=months.entrySet();
		Iterator<Entry<String, Integer>> entry=entries.iterator();
		while(entry.hasNext()) {
			Entry<String, Integer> ent=entry.next();
			
			System.out.println("Key is : "+ent.getKey()+" value is : "+ent.getValue());
		}
		

		
	}

}
