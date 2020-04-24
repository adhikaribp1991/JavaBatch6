package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListInfo {
	public static void main(String[] args) {
		//Generic
		ArrayList<Double> alist=new ArrayList<>();
		alist.add(10.99);
		alist.add(12.90);
		alist.add(19.99);
		alist.add(23.56);
		System.out.println(alist);
		System.out.println(alist.size());
		System.out.println(alist.isEmpty());
		System.out.println(alist.get(2));
		alist.set(1, 13.90);
		System.out.println(alist);
		//remove element by index or object value
		alist.remove(1);
		System.out.println(alist);
		//alist.remove(10.99);
		System.out.println(alist);
		//retrive single element
		System.out.println(alist.get(1));
		System.out.println("*****************************");
		
		//1. advance for loop how we retrive all elements from collection
		for(  double list:alist) {
			System.out.println(list);
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@");
		//2. regular for loop we retrive all element
		for(int i=0; i<alist.size(); i++) {
			System.out.println(alist.get(i));
		}
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		//3. Iterator 
		Iterator<Double> iterator=alist.iterator();
		 while(iterator.hasNext()) {
			 double d=iterator.next();
			 System.out.println(d);
		 }
		 
		
		//2. Non generic collection/ArrayList:
		ArrayList obj=new ArrayList();
		obj.add("Hello");// using add we store single object
		obj.add(10);
		obj.add('j');
		obj.addAll(alist);// using addAll we store collection of object
		System.out.println("---------------------");
		System.out.println(obj);
		System.out.println("''''''''''''''''''''''''''");
		for(Object a:obj) {
			System.out.println(a);
		}
		
		
		
	}

}
