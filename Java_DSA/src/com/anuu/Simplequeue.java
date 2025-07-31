package com.anuu;

import java.util.LinkedList;
import java.util.Queue;

public class Simplequeue {
	public static void main(String[] args) {
		Queue<String> Names = new LinkedList<String>();
		Names.add("Akash");
		Names.add("Rohan");
		Names.add("Aditi");
		Names.add("Sheetal");
		
		System.out.println(Names);
		System.out.println(Names.peek());
		
	}

}
