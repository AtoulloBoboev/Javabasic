package com.neotech.lesson21;

public class Animal {
	
	public String color, size;
	public int age;
	
	public void sleep()
	{
		System.out.println("All the animals sleep");
	}
	
	public void eat()
	{
		System.out.println("All the animals eat");
	}
	
	public void displayInfo()
	{
		System.out.println(size + " " + color + " " + age + " ");
	}

}
