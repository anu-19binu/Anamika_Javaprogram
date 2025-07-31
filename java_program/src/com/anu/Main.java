package com.anu;

class Person{
	String name;
	int age;
	
	
	public void displayDetails() {
		System.out.println("Name"+":"+name);
		System.out.println("Age"+":"+age);
	}
}

class student extends Person{
	String studentID;
	public void displayStudentInfo() {
		displayDetails();
		System.out.println("Student_ID"+":"+studentID);
	}
}

public class Main {
	
	public static void main(String[] args) {
		student obj = new student();
		obj.name="Ronal";
		obj.age= 32;
		obj.studentID="DY123";
		obj.displayStudentInfo();
		
		
	}

}
