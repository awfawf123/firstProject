package com.yedam.exam;

import java.util.Scanner;

public class Exercise009 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum =0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1.학생수2.점수입력3.리스트4.분석5.종료");
			System.out.println("--------------------------");
			System.out.println("선택> ");
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) { //배열의 크기 정함
				System.out.println("학생수 입력: ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum]; // new int[5];
			} else if(selectNo ==2) {
				System.out.println("점수입력");
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = scanner.nextInt();
				}
				
				}else if(selectNo ==3) {
				for(int i=0; i < scores.length; i++) {
					System.out.println("scores["+i+"]> "+ scores[i]);
				}
				
			}else if(selectNo ==4) {
				int sum = 0;
				double avg = 0;
				int maxValue = 0;
				for(int i =0; i<scores.length; i++) {
					sum = sum + scores[i];
					if(maxValue < scores[i])
						maxValue = scores[i];
				}
				avg = (double) sum/scores.length;
				System.out.println("최고점수 : " + maxValue);
				System.out.println("평균점수 : " + avg);
				
			}else if(selectNo ==5) {
				run=false;
			}
		}
	}

}
