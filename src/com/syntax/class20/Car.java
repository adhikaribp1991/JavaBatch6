package com.syntax.class20;

public class Car {
	public Car() {
		System.out.println("I am parent class constructor");
		
	}

}
class Mercedes extends Car{
	public Mercedes() {
		System.out.println("I am child class constructor");
		
		
	}
}