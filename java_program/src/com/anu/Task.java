package com.anu;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name");
		
		String name = in.nextLine();
		System.out.println("Enter your phone number");
		long ph = in.nextLong();
		
		System.out.println("Your name is"+"="+name);
		System.out.println("Your Phone number"+"="+ph);
		in.close();
		
		
		

	}

}