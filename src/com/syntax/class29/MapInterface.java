package com.syntax.class29;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterface {
	public static void main(String[] args) {
		//student id and correspondent name
		Map<Integer, String> lhmap=new LinkedHashMap();
		lhmap.put(1000, "John Smith");
		lhmap.put(1001, "Jane Smith");
		lhmap.put(1002, "Krish");
		lhmap.put(1003, "aatma");
		System.out.println(lhmap);
		//store object in a form of key and value and you want to sort your key in a asending order
		Map<Integer, String> tmap=new TreeMap<>();
		tmap.put(1000, "John Smith");
		tmap.put(1001, "Jane Smith");
		tmap.put(1002, "Krish");
		tmap.put(103, "aatma");
		System.out.println(tmap);
		
		//create a map of country and population and sort countries in alphabetical order
		Map<String, Integer> thmap=new TreeMap<>();
		thmap.put("Nepal", 25696801);
		thmap.put("USA", 33000000);
		thmap.put("India", 1329875775);
		System.out.println(thmap);
		
	}

}
