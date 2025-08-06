package com.anu;

abstract class BankAccount{
	abstract void CalculateInterest();
		
	public void showbalance(){
		System.out.println("Showing balance");
	}
	
}
class SavingAccount extends BankAccount{
	void CalculateInterest() {
		System.out.println("Interest for saving account is 4%");
	}
}

class FixedDepositAccount extends BankAccount{
	void CalculateInterest() {
		System.out.println("Interest for fixed deposit account is 6.5%");
	}
}

public class Task_abstraction {

	public static void main(String[] args) {
		BankAccount obj1= new SavingAccount();
		BankAccount obj2=new FixedDepositAccount();
		
		obj1.showbalance();
		obj1.CalculateInterest();
		
		obj2.showbalance();
		obj2.CalculateInterest();

	}

}
