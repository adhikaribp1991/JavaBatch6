package com.syntax.class1;

import java.util.*;
import java.util.Map.Entry;

public class Class2 {
	public static void main(String[] args) {
		Map<String, String> map=new HashMap<>();
	    map.put("ONE","AAA");
	    map.put("TWO","BBB");
	    map.put("THREE","CCC");
	    map.put("FOUR","DDD");
	    map.put("FIVE","EEE");
	    System.out.println("HashMap Before Remove :");
	    Set<Entry<String, String>>entrySet=map.entrySet();
	    Iterator<Entry<String, String>>entry=entrySet.iterator();
	    while(entry.hasNext()){
	    	Entry<String, String>ent=entry.next();
	    System.out.println(ent.getKey()+" : "+ent.getValue());
	    String value=ent.getValue();
	    if(ent.getKey().equals("ONE") ||  ent.getKey().equals("FOUR")) {
	    	entry.remove();
	    }
	    }
	    System.out.println("HashMap After Remove :");
	    for(Entry<String, String>set:entrySet) {
	    	System.out.println(set.getKey()+" : "+set.getValue());
	    }
	   
	}

}
