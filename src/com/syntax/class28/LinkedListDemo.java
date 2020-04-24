package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> llist=new LinkedList<>();
		llist.add("Krish");
		llist.add("ghanshyam");
		llist.add("JP");
		llist.add("lem");
		llist.add(0, "laxman");
		llist.add("Krish");
		System.out.println(llist.get(0));
		int size=llist.size();
		System.out.println(size);
		//get all elements 1 by 1
		System.out.println("----Using Iterator------");
		Iterator<String> list=llist.iterator();
		while(list.hasNext()) {
			String lis=list.next();
			System.out.println(lis);
		}
		System.out.println("------Using Advanced Loop------");
		for(String lists:llist) {
			System.out.println(lists);
			
		}
		System.out.println("-----Using Regular loop------");
		for(int i=0; i<llist.size(); i++) {
			System.out.println(llist.get(i));
		}
			
		
	}

}
