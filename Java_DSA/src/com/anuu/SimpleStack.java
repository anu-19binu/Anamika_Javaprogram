package com.anuu;

import java.util.Stack;

public class SimpleStack {

	public static void main(String[] args) {
		Stack<Integer> numbers = new Stack<Integer>();
		
		numbers.push(30);
		numbers.push(10);
		numbers.push(20);
		
		System.out.println(numbers);
		System.out.println(numbers.peek());
	}

}
