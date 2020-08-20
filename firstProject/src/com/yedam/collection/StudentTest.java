package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		// 1) 학생이름, 수학점수, 영어점수를 입력받고..(3명)
		// 2)수학평균, 영어평균을 계산하는 분석
		// 3)수학최고점수와 학생을 보는 최고점수
		// 9)종료
		// ArrayList사용
		Student[] StudentArray = new Student[2];
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("1.학생이름, 수학점수, 영어점수 ");
			System.out.println("2.수학평균, 영어평균 ");
			System.out.println("3.수학최고점수, 학생최고점수 ");
			System.out.println("9.종료");
			System.out.println("선택> ");

			int selectNo = scanner.nextInt();
			scanner.nextLine();

			if (selectNo == 1) {
				System.out.println("학생이름: ");
				String name;
				name = scanner.nextLine();
				System.out.println("수학점수: ");
				int score;
				score = scanner.nextInt();
				System.out.println("영어점수: ");
				score = scanner.nextInt();

			} else if (selectNo == 2) {
				int sum = 0;
				 
				
				

			} else if (selectNo == 3) {

			} else if (selectNo == 9) {
				run = false;
			}

		}

	}

}
