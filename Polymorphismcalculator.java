package com.anu;

class Cal{
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}

}

public class Polymorphismcalculator {	
	public static void main(String[] args) {
		Cal obj = new Cal();
		System.out.println(obj.add(10,20));
		System.out.println(obj.add(20,30,50));
		
	}
	

	

}
