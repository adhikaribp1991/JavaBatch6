package com.grouptask.syntax;

public class Maximum {

	public static void main(String[] args) {
		int [] array= {34,67,32,98,76,56,66};
		int min=0;
		for(int i=0;i<array.length;i++) {
			if(min<array[i]) {
				min=array[i];
				
			}
		}
		System.out.println(min);

	}

}
