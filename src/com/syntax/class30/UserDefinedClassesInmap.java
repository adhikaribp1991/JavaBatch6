package com.syntax.class30;

import java.util.*;
import java.util.Map.Entry;

abstract class Store{
	String type, name;
	public Store(String type, String name) {
		this.type=type;
		this.name=name;
	}
	public void display() {
		System.out.println("This is store "+name);
	}
	public abstract void workingHours();
	}
class Nike extends Store{
	public Nike(String type, String name) {
		super( type,  name);
	}
	public  void workingHours() {
		System.out.println(name+" works from 10 am till 6 pm");
	}
}
class Costco extends Store{
	public Costco(String type, String name) {
		super(type, name);
	}
	public  void workingHours() {
		System.out.println(name+" works from 8am am till 8pm");
	}
}
class Amazon extends Store{
	public Amazon(String type, String name) {
		super(type, name);
	}
	public  void workingHours() {
		System.out.println(name+" works 24/7");
	}
}

public class UserDefinedClassesInmap {

		public static void main(String[] args) {
		//we want to store stores in form 1-->>Amazon; 2--->>Costco; 3-->>Nike
			Map<Integer, Store> storeMap=new LinkedHashMap<>();
			storeMap.put(1, new Amazon("Online", "Amazon"));
			storeMap.put(2, new Costco("Wholesale","Costco"));
			storeMap.put(3, new Nike("retail", "Nike"));
			
			//System.out.println(storeMap);
			//to get an access to all methods of out store Objects: values(), keySet, entrySet
			
			//1. Way: get all value Objects
			Collection<Store> value=storeMap.values();
			for(Store val:value) {
				val.workingHours();
				val.display();
				System.out.println("---------------------");
			}
			//2. Way---->> get all Entry Objects---->>getvalue
			Set<Entry<Integer, Store>> entryset=storeMap.entrySet();
			for(Entry<Integer, Store> entri:entryset) {
				entri.getValue().workingHours();
				entri.getValue().display();
				System.out.println("---Using entrySet------");
				
			}
			//get all keys----> get value of specified key
			System.out.println("----getting keys from map------");
			Set<Integer> keyset=storeMap.keySet();
			for(int keys:keyset) {
				//System.out.println(keys);
				Store st=storeMap.get(keys);
				st.workingHours();
				storeMap.get(keys).display();
			}
			
		}
}
