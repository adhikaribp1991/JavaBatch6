package com.syntax.class15;



public class Google {
	int empId;
	double salary;
	
	String name, lastName, title;
	
	void working() {//method header
		System.out.println(title+" is working");
		
		//method body
	}
	void getPaid() {
		System.out.println(name+" "+lastName+" is getting paid "+salary);
	}
	void attendMeeting() {
		System.out.println(name+" attending meetings");
	}
	
		public static void main(String [] args) {
		Google emp1=new	Google();
		emp1.empId=123;
		emp1.name = "John";
		emp1.lastName="Smith";
		emp1.salary=200000;
		emp1.working();
		emp1.getPaid();
		emp1.attendMeeting();
		
		
	}

}
