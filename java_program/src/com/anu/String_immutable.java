package com.anu;

public class String_immutable {
	
	String name = "Anamika";
	public void print() {
		System.out.println(name);
		System.out.println(name.concat(" "+"Binu"));
	}

	public static void main(String[] args) {
		String_immutable obj = new String_immutable();
		obj.print();
	}

}
