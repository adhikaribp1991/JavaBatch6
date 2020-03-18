package com.syntax.class5;

public class LogicalExamples {
	public static void main(String [] args) {
		String day="Sunday";
		if(day.equals("tuesday") && day.equals("wednesday")) {
			System.out.println("we have a SDLC class");
		}else if(day.equals("Thursday")){
			System.out.println("We have a java class");
		}else if(day.equals("Saturday") || day.equals("Sunday")){
			System.out.println("we have a java class");
		}else {
			System.out.println("We do not have any classes");
		}
	}

}
