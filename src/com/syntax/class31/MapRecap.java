package com.syntax.class31;

import java.util.*;
import java.util.Map.Entry;

public class MapRecap {

	public static void main(String[] args) {
		//lets create map of countries with capitals
		Map<String, String> hmap=new HashMap<>();
		hmap.put("USA", "Washington");
		hmap.put("Russia", "Moscow");
		hmap.put("France", "Paris");
		hmap.put("Tajikistan", "Dushanbe");
		hmap.put("Italy", null);
		hmap.put(null, "some value");
		System.out.println(hmap);
		//HashMap allows atleast 1 null key and multiple null values vs HashTable does not allow null key and values.
		//HashMap is non syncronized, not thread safe vs HashTable is syncronized.
		
		//lets create hashtable of countries with capitals
		
		
		//retrive all keys from map
		System.out.println("------printing all keys Using keySet--------");
		Set<String> keys=hmap.keySet();
		Iterator<String> it=keys.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("----Printing key and values--------");
		Set<Entry<String, String>> key=hmap.entrySet();
		Iterator<Entry<String, String>> entryit=key.iterator();
		while(entryit.hasNext()) {
			Entry<String, String> entry=entryit.next();
			String myEntry=entry.getKey()+"---"+entry.getValue();
			System.out.println(myEntry);
		}
		
		
		
		Map<String, String> htable=new Hashtable<>();
		htable.put("nepal", "ktm");
		htable.put("india", "delhi");
		htable.put("France", "Paris");
		htable.put("Tajikistan", "Dushanbe");
		//hmap.put("Italy", null);
		hmap.put(null, "some value");
		System.out.println(htable);
	
		
	}
	public static Map<String,String> createMap(String key, String value){
		Map map=new HashMap<>();
		map.put(key, value);
		return map;
	}

}
