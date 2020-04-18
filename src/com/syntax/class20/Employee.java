package com.syntax.class20;

public class Employee {
	public static String company;
	protected int employeeId;
	double salary;
	private int ssn;
	void getPaid() {
		System.out.println("Employee get "+salary);
	}
	static void work() {
		System.out.println("Employee work at "+company);
	}

}
