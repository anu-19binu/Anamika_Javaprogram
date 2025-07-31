package com.anu;

public class Simple2DArrays {

	public static void main(String[] args) {
		int[][] chocolateBox= {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(chocolateBox[i][j]);
			}
			System.out.println();
		}
		System.out.println(chocolateBox[1][2]);
			
		}
	}


