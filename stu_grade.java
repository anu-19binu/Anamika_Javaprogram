package com.Student_project;

import java.util.Scanner;

public class stu_grade {
	public static void main(String[] args) {
		System.out.println("Enter marks of Physics out of 100:");
		Scanner p = new Scanner(System.in);
		double marks_1 = p.nextDouble();
		
		System.out.println("Enter marks of Maths out of 100:");
		Scanner m = new Scanner(System.in);
		double marks_2 = m.nextDouble();
		
		System.out.println("Enter marks of Chemistry out of 100:");
		Scanner c = new Scanner(System.in);
		double marks_3 = c.nextDouble();
		
		double d=(marks_1+marks_2+marks_3);
		double a=d/3;
		System.out.println("Total marks out of 300:"+d);
		System.out.println("Average marks:"+a);
		
		if (a>=90){
			System.out.println("A GRADE");
			
		}else if (a>=75) {
			
			System.out.println("B GRADE");
			
		}else if(a>=50) {
			
			System.out.println("C GRADE");
			
		}else {
			System.out.println("FAIL");
		}
		
		
		
		
	}
	
	
	
	
	
	

}