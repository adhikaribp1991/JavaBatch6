package com.syntax.class15;

public class LargerNumber {
	void large(int a, int b) {
		if(a>b) {
			System.out.println(a+" is a larger Number");
		}else {
			System.out.println(b+ " is a larger Number");
		}
	}
	public static void main(String[] args) {
		LargerNumber lar=new LargerNumber();
		lar.large(30, 20);
		
	}

}
