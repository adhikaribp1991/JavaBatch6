package com.syntax.class14;

public class MyGarage {
	public static void main(String[] args) {
		
		//build individual objects
		Car car1=new Car();
		car1.make="Lamborghini";
		car1.model="Gallardo";
		car1.year=2020;
		car1.color="Blue";
		
		Car car2=new Car();
		car2.make="BMW";
		car2.model="m5";
		car2.year=2019;
		car2.color="Pink";
		
		//accessing behaviour /methods of car with car1
		car1.drive();
		car1.accelerate();
		car1.makeNoise();
		car1.stop();
		
		//accessing behaviour /methods of car with car2
		car2.drive();
		car2.accelerate();
		car2.makeNoise();
		car2.stop();
		
		//car2.breaking(); we cannot allow to do cause we donot define the breaking method
		
		
		
	}
	

}
