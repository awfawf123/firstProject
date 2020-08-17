package com.yedam.ref;

public class morningCode {
	public static void main(String[] args) {
		double[] dAry = new double[5];
		dAry[0] = 1.2;
		for (int j = 0; j < dAry.length; j++) {
			System.out.println(dAry[j]);
		}

		int[][] iAry = new int[5][5];
		int num1 = 1;

		for (int i = 0; i < iAry.length; i++) {
			for (int j = 0; j < iAry[i].length; j++) {
				iAry[i][j] = num1++;
			}
		}

		for (int i = 0; i < iAry.length; i++) {
			for (int j = 0; j < iAry[i].length; j++) {
				System.out.printf("%5d",iAry[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("-----------------------");
		
		
		

	}
}
