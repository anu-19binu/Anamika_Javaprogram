package com.anu;

class Value{
	String name;
	int salary;
	
	Value(String empname,int empsalary){
		name=empname;
		salary=empsalary;
		
	}
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Salary:"+salary+" Rs");
	}

}



public class Object {

	public static void main(String[] args) {
		Value v = new Value("Anamika",500000);
		v.display();
		
		
	}
}
