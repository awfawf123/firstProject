package com.yedam.oper;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode = 'A'; // A=65
		if(charCode>= 65 & charCode <= 90) {
			System.out.println("대문자");
		}
		
		int num1 = 10;
		int num2 = 20;
		if(num1++ < 10 || num2++ > 20) {
			System.out.println("참");
		}
		System.out.println(num1 + "," + num2);// &&일경우 앞에서 이미 false값이 나와 뒤에것이 출력안됨
		
		int a =10,b = 11;
		int result = a | b;
		System.out.println("논리곱결과 : "+ result);// 컴퓨터는 2진수로 계산
		
		result = a >> 2; // 비트 2칸씩 옮김
		System.out.println("비트이동결과: "+ result);
		
		result = 30 >> 3;
		System.out.println("비트이동결과: "+ result);
		
		result += 30; // result = result + 30;
		
		result = 80;
		boolean pass = false;
		if(result >=80) {
			pass = true;
		} else {
			pass = false;
		}
		
		pass = (result>=80) ? true : false;
		System.out.println(pass);
	}

}
