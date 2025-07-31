package com.anuu;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Fruits {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashSet<String> fruitset = new HashSet<String>();
		LinkedList<String> fruitlist= new LinkedList<String>();
		
		System.out.println("Enter names of fruits:");
		for(int i=0;i<5;i++) {
			String fruit =sc.nextLine();
			if(!fruitset.contains(fruit)) {
				fruitset.contains(fruit);
				fruitlist.add(fruit);
			}
		}
		
		System.out.println("fruits in basket"+fruitlist);
		System.out.println("fruit count"+fruitlist.size());
	}

}
