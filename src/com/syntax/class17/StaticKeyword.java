package com.syntax.class17;

public class StaticKeyword {
	//create variabales to hold mame, last name, title, ssn;
	public static String title;
	
	public String name;
	protected String lastName;
	double salary;
	private long ssn;
	public static void method1() {
		System.out.println("I am public method");
		
	}
	protected void method2() {
		System.out.println("I am protected method");
	}
	void method3() {
		System.out.println("I am default method");
	}
	private void method4(){
		System.out.println("I am private method");
		
	}
	public static void main(String[] args) {
	StaticKeyword employee=new StaticKeyword();
	employee.name="Bishnu";
	employee.lastName="Adhikari";
	employee.salary=90000;
	employee.ssn=123456789;
	
	method1();
	employee.method2();
	employee.method3();
	employee.method4();
	
	}
	

	
		

	

}
