package com.anu;

public class Demo {

	public static void main(String[] args) {
		try {
			int x=2/0;   //Exception(problem)
			
		}catch(ArithmeticException e) {
			System.out.println("You cannot/ by zero");
			
		}
		
		
	}

}