package com.syntax.class1;
import java.util.*;
import java.util.Map.Entry;


public class Practice1 {
	public static void main(String [] args){
	    Map<String, String> lmap=new HashMap<>();
	    lmap.put("Street", "Patrick ST");
	    lmap.put("Suite",  "265");
	    lmap.put("City",  "Vienna");
	    lmap.put("Zip",   "22180");
	    lmap.put("Country", "United State");
	    Set<Entry<String, String>> entrySet=lmap.entrySet();
	    Iterator<Entry<String, String>> it=entrySet.iterator();
	    while(it.hasNext()){
	      Entry<String, String>entry=it.next();
	      System.out.println(entry.getValue());
	    }
	}
	}
			 
	

