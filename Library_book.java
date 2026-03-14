package com.Library;

import java.util.ArrayList;
import java.util.Scanner;

public class Library_book {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("The Bible");
		list.add("The Harry Potter Series");
		list.add("The Little Prince");
		list.add("The Stranger");
		
		System.out.println("Name of the book you want to issue:");
		Scanner sc = new Scanner(System.in);
		String a=sc.nextLine();
		if (list.contains(a)) {
			
			System.out.println("Book available");
			
			System.out.println("Date of book issue:");
			String b=sc.next();
			
			System.out.println("NAME OF BOOK: "+ a );
			System.out.println(" DATE OF ISSUE: "+b);
			System.out.println("BOOK ISSUED!!");
			
		}else {
			System.out.println("Book not available");
			
		}
		sc.nextLine();
		
			
		System.out.println("Name of the book you want to return:");
		
		String e=sc.nextLine();
			
		System.out.println("Date of book returned:");
		
		String b=sc.next();
			
		System.out.println("NAME OF BOOK: "+e+" DATE OF BOOK RETURNED: "+b);
		System.out.println("BOOK RETURNED!!");
		list.add(e);
			
		
		System.out.println("BOOK AVAILABLE:"+list);
		

	}

}
