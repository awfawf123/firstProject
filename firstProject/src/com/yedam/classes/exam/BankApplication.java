package com.yedam.classes.exam;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		boolean run = true;
		while (run) {
			System.out.println("------------------------");
			System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
			System.out.println("------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();
			scanner.nextLine();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {
		System.out.println("계좌번호: ");
		String createAccount;
		createAccount = scanner.nextLine();
		System.out.println("계좌주: ");
		String owner;
		owner = scanner.nextLine();
		System.out.println("초기입금액: ");
		int balance;
		balance = scanner.nextInt();
		System.out.println("결과: 계좌가 생성되었습니다.");
		Account a = new Account(createAccount, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = a;
				break;
			}
		}

	}

	private static void accountList() {
		System.out.println("계좌목록");
		for (Account acnt : accountArray) {
			if (acnt != null) {
				System.out.println("계좌번호: " + acnt.getAno() + "계좌주: " + acnt.getOwner() + "예금액: " + acnt.getBalance());
			}
		}

	}

	private static void deposit() {
		System.out.println("계좌번호: ");
		String ano = scanner.nextLine();

		System.out.println("입금액: ");
		int bal = scanner.nextInt();
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null && accountArray[i].getAno().equals(ano)) {
				int bal2 = accountArray[i].getBalance();
				accountArray[i].setBalance(bal + bal2);
			}

		}

	}

	private static void withdraw() {
		System.out.println("계좌번호: ");
		String ano = scanner.nextLine();
		System.out.println("출금액: ");
		int bal = scanner.nextInt();
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null && accountArray[i].getAno().equals(ano)) {
				int bal2 = accountArray[i].getBalance();// 현재 잔액
				accountArray[i].setBalance(bal2 - bal);
			}

		}

	}

	private static Account findAccount(String ano) {
		Account searchAcnt = null;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null && accountArray[i].getAno().equals(ano)) {
				searchAcnt = accountArray[i];
			}
		}
		return searchAcnt;

	}

}
