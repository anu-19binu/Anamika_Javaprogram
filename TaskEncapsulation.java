package com.anu;

class Employee{
	private String name;
	private int id;
	private int salary;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}

public class TaskEncapsulation {

	public static void main(String[] args) {
		Employee em = new Employee();
		em.setName("Anamika");
		em.setId(1230);
		em.setSalary(5032689);
		
		System.out.println("Employee name is"+" "+em.getName());
		System.out.println("Employee ID is"+" "+em.getId());
		System.out.println("Employee Salary is"+" "+em.getSalary());
		
		
		
		
		
		
		
		
	}

}
