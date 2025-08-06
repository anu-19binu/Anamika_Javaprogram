package com.anu;

class Printer{
	public void Print(){
		System.out.println("Printing from normal printer");
	}
}

class InkjetPrinter extends Printer{
	public void Print() {
		System.out.println("Printing from inkjet printer");
		
	}
}

class LazerPrinter extends Printer{
	public void Print() {
		System.out.println("Printing from lazer printer");
	
	}
}
public class TaskPolymorphism {

	public static void main(String[] args) {
		Printer obj= new InkjetPrinter();
		Printer obj2= new LazerPrinter();
		obj.Print();
		obj2.Print();
	}

}
