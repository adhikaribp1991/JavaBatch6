package com.syntax.class30;

import java.util.*;

public class MapTask {
	public static void main(String[] args) {
		/*
		 * Home work-April-18-2020 Create a map of a building. Store floor number and it
		 * is associated company name. (Example: 1= Google, 2=Syntax etc..). Insert 7
		 * entries with duplicate keys and values. 1.Check how many entries you have?
		 * 2.Update company on a 4th floor 3.Remove company on the 7th floor 4.Print
		 * your map
		 */
		Map<Integer, String> building = new LinkedHashMap<>();
		// Entries with duplicate keys and values;
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
		// how to get all keys
		Set<Integer> keys = building.keySet();
		Iterator keysIt = keys.iterator();
		while (keysIt.hasNext()) {
			System.out.println(keysIt.next());
		}
		System.out.println("values after using collection");
		Collection<String> values=building.values();
		for(String v:values) {
			System.out.println(v);
		}
		System.out.println("-----Using Iterator-----------");
		Iterator<String> val=values.iterator();
		while(val.hasNext()) {
			String va=val.next();
			System.out.println(va);
		}
	}
}
