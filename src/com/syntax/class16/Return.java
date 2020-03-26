package com.syntax.class16;

public class Return {
	//create a method that will accept array of
	//integers and return max element from that array
	int getLargestNumber(int[]array) {
		int largest = array[0];
		for (int i=1; i<array.length;i++) {
			if (array[i]>largest) {
				largest=array[i];
			}
		}
		return largest;
	}
	public static void main(String[] args) {
	Return obj=	new Return();
	int [] array= {10,20,30,40};
	System.out.println(obj.getLargestNumber(array));
	
	}

}
