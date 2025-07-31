package com.anu;

public class SimpleArray {

	public static void main(String[] args) {
		
		int[] numbers= {10,20,30,40,50};
		
		String[] names= {"Alice","Witch","Harry","Jagth","Jithin"};
		
		System.out.println(numbers[3]);
		
		System.out.println(names[4]);
		
		for(int i=0; i< numbers.length;i++) {
			
			System.out.println(numbers[i]+names[i]);
		}
		
	}

}
