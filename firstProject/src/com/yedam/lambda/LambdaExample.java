package com.yedam.lambda;

//함수적인터페이스
interface MyFunctionalInterface {
	public void run();// 추상 메소드
}

class MyFuncClass implements MyFunctionalInterface {
	@Override
	public void run() {
		System.out.println("ruuuuun");
	}
}

public class LambdaExample {
	public static void main(String[] args) {
		MyFunctionalInterface myintf = () -> {
			System.out.println("runnnn");

		};
		myintf.run();

		ShowContent sc = (content) -> {System.out.println("내용은" + content + " 입니다");
		};

		sc.show("바나나");
		
		ShowContent sc2 = (content) -> {
			System.out.println("this is " + content);
		};
		sc2.show("this is");
		
		Calculate cal = (a, b) -> a+b;
			System.out.println("결과: " + cal.sum(10,5));
			
		}
	}

