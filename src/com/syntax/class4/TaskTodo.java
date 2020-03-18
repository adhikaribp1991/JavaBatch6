package com.syntax.class4;

public class TaskTodo {
	public static void main(String[] args) {
		boolean diploma = true;
		double gpaScore = 3.4;
		
		if (diploma) {
			System.err.println("Congratulations");
			if(gpaScore>=3.5) {
				System.out.println("You are eligible for scholarship");
				
			}else {
				System.err.println("You should have studied harder");
			}
		}else {
			System.err.println("Get your degree");
		
		}
		
	}
}
