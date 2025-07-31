package com.anuu;

public class Task4 {
	public static void main(String[] args) {
		int[]arr= {23,45,6,7,8,9,22};
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>j) {
				j=arr[i];
				
			}
		}
		System.out.println(j);
	}

}
