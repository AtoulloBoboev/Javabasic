package com.neotech.lesson15;

public class Phone {
	
	//Create a class "Phone".
	//Create 3 Objects of it: iPhone, Android, Nokia
	//With specific attributes and behaviors.
	
	//attributes/variables
	String brand;
	String color;
	String model;
	int price;
	
	//Behaviors/actions
	void call() {
		System.out.println(brand + " is colling");
	}
	
	void text() {
		System.out.println(brand + " is texting");
	}
	
	void navigate() {
		System.out.println(brand + " is navigating");
	}
	
}
