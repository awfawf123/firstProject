package com.yedam.oper;

public class BitOperatorExample {
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1; //~:비트 반대시키는 연산자
		System.out.println("v1 : " + v1);
		System.out.println("v2 : " + v2);
		
		byte b1 = 10;
		byte b2 = 4;
		int b3 = b1 + b2; // + = * / % 는 int
		
		double result = 10/4.0; // 2.5
		System.out.println(result);
	}

}
