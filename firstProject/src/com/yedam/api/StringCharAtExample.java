package com.yedam.api;

import java.util.Scanner;

public class StringCharAtExample {
	public static void main(String[] args) {
		String str1 = "010102-345678";
		int location = str1.indexOf("345678");
		System.out.println(location);
		
		String str2 = "010203*345678";
		int location2 = str2.indexOf("345678");
		System.out.println(location2);
		
		if(str1.indexOf("010102") != -1) {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
//		String str1 = "010102-345678";
		System.out.println(str1.replace("-", "").charAt(6));
		if(str1.replace("-", "").charAt(6) == '3') {
			System.out.println("남자");
		
		
		}
		
		
		
	}


}
