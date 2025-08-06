package com.anu;

class parent{
	final void car() {
		System.out.println("BMW");
	}
}
class Son extends parent{
	void displaycar(){
		super.car();
		System.out.println("G-Wagon");
	}
}

public class SuperDemo {

	public static void main(String[] args) {
		Son obj = new Son();
		obj.displaycar();
		

	}

}
