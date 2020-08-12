package com.yedam.oper;

public class StringEqualExample {
	public static void main(String[] args) {
		int v1 = 20;
		int v2 = 30;
		if(v1 == v2) {
			System.out.println("기본타입일 경우 비교");
		}
		
		else {
			System.out.println("다름");
		}
		
		char c = 'a';
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		
		if(str1 == str2) {
			System.out.println("str1, str2는 같은문자");
		}
		
		if(str1.equals(str3)) { // 괄호안 문자열만 비교할때 equals 사용
			System.out.println("str1, str3는 같은문자");
		}
		
		System.out.println((1==1) || (2==2));
		
		
			
	}
	
}
