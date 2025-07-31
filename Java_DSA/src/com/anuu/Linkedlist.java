package com.anuu;


import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		LinkedList<String> names = new LinkedList<String>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		
		names.add("Jagath");
		names.add("jithin");
		names.add("Sandeep");
		
		System.out.println(numbers);
		System.out.println(names);

	}

}
