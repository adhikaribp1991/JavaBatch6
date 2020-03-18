package com.syntax.class10;

public class Aray {

	private static final boolean String = false;

	public static void main(String[] args) {
		/*Create an array of words: Java, Saturday, day,coding, is.
		 *  Print the following sentence using elements of array: 
		 * “Saturday is Java coding Day”. 
		 */
		String[] any= {"Java ", "Saturday ", "Day.", "coding ","is "};
		System.out.println(any[1]+any[4]+any[0]+any[3]+any[2]);
		
		//----------Advanced For Loop--------------
		for(String anything:any) {
			System.out.print(anything);
		}
		System.out.println();
		System.out.println("------------------------------------------------------------------");
		//create an array of fruits and retrieve all elements
		String[] fruits= {"Apple ","Banana ","kiwi ", "Mango"};
		for(String fruit:fruits){
			
			if(fruit.equals("Apple ")) {
				System.out.println(fruit+" is my favorite fruit");
				//System.out.println(fruit);
			} else {
				System.out.println(fruit);
			}
			
		}
		System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
		for(int i=0; i<fruits.length;i++) {
			System.out.println(fruits[i]);
		}
		
		
	}

}
