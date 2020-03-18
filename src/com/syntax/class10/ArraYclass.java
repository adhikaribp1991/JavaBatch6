package com.syntax.class10;

public class ArraYclass {

	public static void main(String[] args) {
		int[] grades=new int[4];
		grades[0]=90;
		grades[1]=89;
		grades[2]=85;
		grades[3]=70;
		//what is average?
		int average=((grades[0]+grades[1]+grades[2]+grades[3])/4);
		System.out.println(average);
//----------------------------------------------------
		String[] cities= {"Washington DC", "Newyork", "Miami","Florida", "Virginia", "los angles", "dallas"};
		System.out.println("I Live in "+cities[1]);
		int x=1;
		System.out.println(cities[x]);
		x+=3;
		System.out.println(cities[x]);
		
		// how many elements stored inside an array
		int arraySize=cities.length;
		System.out.println("Total elements are "+arraySize);
		
		// How we can access last element from an array
		System.out.println(cities[arraySize-1]);
		for(int i=0; i<cities.length; i++) {
			System.out.println(cities[i]);
		}
		
	}

}
