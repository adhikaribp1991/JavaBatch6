package com.syntax.class6;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		//Benefits Switch vs Else if
		/*1. Using switch we can make code cleaner and more readable
		 * 2. Performance of switch
		 */
		int day=6;
		String dayName;
		
		if(day==1) {
			dayName="monday";
		}else if(day==2) {
			dayName="tuesday";
		}else if(day==3) {
			dayName="wednesday";
			
		}else if(day==4) {
			dayName="thursday";
		}else if(day==5) {
			dayName="friday";
			
		}else if(day==6) {
			dayName="saturday";
		}else if(day==7) {
			dayName="sunday";
		}else {
			dayName="Invalid";
		}
		System.out.println(dayName);
		String today;
		Scanner scan =new Scanner(System.in);
		int day1=scan.nextInt();
		switch(day1) {
		case 1:
			today="Monday";
			break;
		case 2:
			today="tuesday";
			break;
		case 3:
			today="wednesday";
			break;
		case 4:
			today="thursday";
			break;
		case 5:
			today="friday";
			break;
		case 6:
			today="saturday";
			break;
		case 7:
			today="sunday";
			break;
		default:
			today="invalid";
		}
		System.out.println("today is "+today);
	}
	


	}
