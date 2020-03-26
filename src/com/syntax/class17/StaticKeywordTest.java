package com.syntax.class17;

public class StaticKeywordTest {

	public static void main(String[] args) {
		StaticKeyword employee=new StaticKeyword();
		employee.name="Bishnu";
		employee.lastName="Adhikari";
		employee.salary=90000;
		//employee.ssn=123456789; this is a private, it should be inside class
		
		StaticKeyword.method1();
		employee.method2();
		employee.method3();
		//employee.method4();

	}

}
