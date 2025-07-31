package com.anu;

class Calculation{
	Calculation(int a,int b){
		int sum=a+b;
		System.out.println("Addition"+"="+sum);
	}
	
	Calculation(int a,int b,boolean multiply){
		int multiplication = a*b;
		System.out.println("Multiplication"+"="+multiplication);
	}
	
	Calculation(double a,double b){
		double substraction= a-b;
		System.out.println("Subraction"+"="+ substraction);
	}

	
}

public class Main_calculator {
	public static void main(String[] args) {
		
	    Calculation obj1= new Calculation(23, 34);
		Calculation obj2= new Calculation(45,32,true);
		Calculation obj3= new Calculation(29.5,28.5);
				
	}

}
