package com.syntax.class14;

public class Car {

	// Define features of car
	String make;
	String model;
	int year;
	String color;

	// define behaviour
	void drive() {
		System.out.println(make + "Car can drive");

	}

	void accelerate() {
		System.out.println(make + "Car can accelerate");

	}

	void makeNoise() {
		System.out.println(make + "Car can make noise");
	}

	void stop() {
		System.out.println("Car Stops");
	}

}
