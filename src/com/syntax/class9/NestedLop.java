package com.syntax.class9;

public class NestedLop {
	public static void main(String [] args) {
		// clock time
		for(int i=0; i<=23; i++) {
			for(int j=0; j<=59; j++) {
				if(j<10){ 
				System.out.println(i+":0"+j);
				
					
				}else {
					System.out.println(i+":"+j);
				}
				
			}
		}
	}

}