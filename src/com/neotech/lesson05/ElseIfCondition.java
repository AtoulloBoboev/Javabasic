package com.neotech.lesson05;

public class ElseIfCondition {
	
	public static void main(String[] args) {
	
		double d1 = 12.3;
		double d2 = 12.2;
		
		//d1 < d2 its the same as d2 < d1
		//possible condition:
		// d1 is bigger than d2;
		// d1 is smaller than d2;
		// d1 is equal to d2
		
		if (d1 < d2) {
			System.out.println("Number " + d1 + " is smaller to " + d2);
		} 
		else if (d1 > d2) {
			System.out.println("Number " + d1 + " is bigger to " + d2);
		} 
		else if (d1 == d2) {
			System.out.println("Number " + d1 + " is equal to " + d2);
		}
	}

}
