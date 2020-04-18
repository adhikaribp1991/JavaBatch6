package com.syntax.class20;

public class Test {
	public static void main(String[] args) {
		Employee emp=new Employee();
		Employee.company="ABC";
		emp.employeeId=101;
		emp.salary=90000;
		emp.getPaid();
			
		ProductOwner po=new ProductOwner();
		po.employeeId=123;
		po.salary=100000;
		//po.ssn private access modifier is not work in inheritance
		po.prioritiesBacklog();
		ProductOwner.company="Syntax";
		ProductOwner.work();
		Employee.work();
		
	}

}
