package com.yedam.dev;

public class intExample {
	public static void main(String[] args) {
		int var1 = 10; // 십진수 10;
		int var2 = 012; // 8진수 12 = 10
		int var3 = 0xA; // 16진수 A = 10
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		byte b1 = 10;
		int result = (byte) (b1 + 10);
		
		System.out.println(result);
	}

}
