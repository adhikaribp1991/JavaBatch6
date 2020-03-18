package com.syntax.class5;

public class Task2LogicalOperator {

	public static void main(String[] args) {
		/*write a program that will print whether it is a weekend or weekday.
		 *if any day from 1-5-->output->"It is a weekday"
		 *Anyday from 6-7-->output-> "It is a weekend"
		 *Any other day output-->"Invalid day"
		 */
		int day=6;
		if (day>=1 && day<=5) {
			System.out.println("It is a weekday");
		}else if(day>=6 && day<=7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("Invalid day");
		}

	}

}
