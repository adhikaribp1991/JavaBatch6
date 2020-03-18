package com.syntax.class5;

import java.util.Scanner;

public class TaskAboutScore {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String result;
		System.out.println("Input your score");
		int score=scan.nextInt();
		if(score>=90) {
			result="grade-A";
		}else if(score>=70 && score<90) {
			result="grade-B";
		}else if(score>=50 && score<70){
			result="grade-C";
		}else {
			result="grade-F";
		}
		System.out.println("The result is "+result);
		

	}

}
