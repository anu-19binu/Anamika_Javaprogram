package com.anu;

public class MyThread extends Thread {
	public void run() {
		for (int i=1; i<=5; i++) {
			System.out.println("Thread running "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		MyThread m= new MyThread();
		m.start();		

	}

}
