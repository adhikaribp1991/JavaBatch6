package com.syntax.class30;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class EntrySet {
	public static void main(String[] args) {
		Map<String, String> land=new TreeMap<>();
		land.put("Togo", "Lome");
		land.put("Jamaica", "Kingston");
		land.put("Iran", "Tehran");
		land.put("Peru", "Lima");
		land.put("Cuba", "Havana");
		System.out.println(land);
		Set<Entry<String, String>> allEntries=land.entrySet();
		System.out.println(allEntries);
		for(Entry<String, String> entr:allEntries) {
			String key=entr.getKey();
			String value=entr.getValue();
			System.out.println(key+"----"+value);
		}
		
		
	}

}
