package com.neotech.lesson21;

public class ChemistryTeacher extends Teacher {
	
	String department;
	
	public ChemistryTeacher() {
		System.out.println("Default constructor for ChemistryTeacher class");
	}
	
	public ChemistryTeacher(String firstName, String lastName, String department){
		super(firstName, lastName);
		this.department = department;
	}
	
	void teachingChemistry() {
		System.out.println("Teaching Chemistry...");
	}

}
