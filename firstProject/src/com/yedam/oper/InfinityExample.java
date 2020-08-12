package com.yedam.oper;

public class InfinityExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		double z = x % y; // NaN, Infinity 일 경우 유효값 x
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("의미없는값");
		} else {
		System.out.println(z);
	}

	}}
