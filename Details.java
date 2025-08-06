package com.anu;

class student_detail{
	int Rollno;
	String name;
	int age;
	
	void display() {
		System.out.println(Rollno+" "+name+" "+age+" years old");
	}
}

public class Details {

	public static void main(String[] args) {
		student_detail s = new student_detail();
		s.Rollno=1;
		s.name="Anamika";
		s.age=19;
		s.display();
		
		s.Rollno=2;
		s.name="Payal";
		s.age=19;
		s.display();
		

	}

}
