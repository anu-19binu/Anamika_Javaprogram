package com.anu;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int num1 = sc.nextInt();
		int num2=sc.nextInt();
		try {
			int x=num1/num2;
			
		}catch(Exception e){
			System.out.println("Number cannot be divided");
			
		}finally {
			System.out.println("Program ended safely");
		}
	}

}
