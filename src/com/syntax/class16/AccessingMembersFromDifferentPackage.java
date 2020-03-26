package com.syntax.class16;

import com.syntax.class17.StaticKeyword;

public class AccessingMembersFromDifferentPackage {

	public static void main(String[] args) {
		StaticKeyword employee=new StaticKeyword();
		employee.name="Bishnu";
		employee.lastName="Adhikari";
		employee.salary=90000;
		employee.ssn=123456789;
		
		StaticKeyword.method1();
		employee.method2();
		employee.method3();
		employee.method4();
	}

}
