package com.syntax.class4;

public class TaskClass {
	public static void main(String [] args) {
	/* If student completed a quiz we will check for a score
	 * If score > 90----> great job
	 * If score > 80----> well done
	 * If score > 70----> You could have done Better
	 * 
	 * If student did not completed the quiz---> not good
	 * please do homework ontime
	 */
		
		boolean quizCompleted = true;
		int score = 96;
		
		if (quizCompleted) {
			System.out.println("Lets your score");
			if (score>90) {
				System.out.println("Great Job");
			}else if (score>80) {
				System.out.println("Well Done");
			}else if (score>70) {
					System.out.println("You could have done better");
			}else {
				System.out.println("You Failed");
			}
			
			
		}else {
			System.out.println("Please do HW ontime");
		}
}
}