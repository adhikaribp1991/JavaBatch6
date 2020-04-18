package com.syntax.class20_1;

import com.syntax.class20.Employee;

public class WaterfallTeam extends Employee  {
	public static void main(String[] args) {
		WaterfallTeam obj =new WaterfallTeam();
		Employee.company="SYNTAX";
		obj.employeeId=233;
		//obj.salary=20000; salary is defined as a default it only visiable inside package.
		//different between default and protected--is protected is visiable other packages incase of inheritance
	}

}
