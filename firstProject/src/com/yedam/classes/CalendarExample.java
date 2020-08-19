package com.yedam.classes;

import java.util.Calendar;
import java.util.Set;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();// 2020-8-19
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH));// 월은 0부터 시작 0~11
//		System.out.println(cal.get(Calendar.DATE));

		cal.set(2020, 8, 1);
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH));// 월은 0부터 시작 0~11
//		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));//시작 요일을 알아내기

		createCalendar(2020, 8); //8월달력
	}

	public static void createCalendar(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
		System.out.println("일 월 화 수 목 금 토");
		for(int a=0; a<cal.get(Calendar.DAY_OF_WEEK)-1; a++) {
			System.out.print("*");
		}
		
		int b = 32;
		for(int a =1+cal.get(Calendar.DAY_OF_WEEK)-1; a<b+cal.get(Calendar.DAY_OF_WEEK)-1; a++) {//a =
			System.out.print(a-6);
			if(a%7 == 0) {
				System.out.println();
			}
		}
		
		
		
		
	}

}
