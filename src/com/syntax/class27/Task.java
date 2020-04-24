package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {
	public static void main(String[] args) {
		ArrayList<String> cars=new ArrayList<>();
		cars.add("Toyota");
		cars.add("BMW");
		cars.add("Tesla");
		System.out.println(cars);
		System.out.println("---------------------");
		for(String car:cars) {
			System.out.println(car);
		}
		System.out.println("**********************");
		for(int i=0; i<cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@");
		Iterator<String> it=cars.iterator();
		while(it.hasNext()) {
			String element=it.next();
			System.out.println(element);
		}
	}

}
