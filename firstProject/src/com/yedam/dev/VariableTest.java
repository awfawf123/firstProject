package com.yedam.dev;

public class VariableTest {
	public static void main(String[] args) {
		int b = 0;
		int sum = 0;
		for (int i =0; i <10; i++) {//i=i+1;
			int result = 0;
			b=b+1;
			sum = sum + b; // sum += b;
			System.out.println("sum =" + sum + ", b =" + b);
		}
		System.out.println("합계 :" + sum);
		int i = 0;
		sum =10;
		int result = 0;
		
	}
}
