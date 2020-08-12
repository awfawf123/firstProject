package com.yedam.dev;

public class MorningCode {
	public static void main(String [] args) {
		String str1 = "Hello";
		String str2 = "World";
		String name = "ㅇㅈㅎ";
		System.out.println(str1 +","+ name+","+str2 );
		
		int v1 = 150, v2 = 270;
		int result = add(v1,v2);
		System.out.println("결과값: " + result);
		
		introduce("홍길동");
		
		result = minus(v1,v2);
		System.out.println("결과는" + result);
		
	}
	
	//minus 메소드 정의
	
	
	public static void introduce(String name) {
		System.out.println("안녕하세요. 저는 " + name + "입니다");
	}
	
	public static int add(int v1, int v2) { //method
		int sum = v1 + v2;
		return sum;
		
		
	
		
	}
	//minus 메소드 정의
	
	public static int minus(int x, int y) { //method
		int minus = x - y;
		return minus;
	
	}
	
}
