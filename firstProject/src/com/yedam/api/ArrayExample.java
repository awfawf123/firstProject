package com.yedam.api;


import java.util.Arrays;



class User{
	String name;
	int grade;
	public User(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}
		public int compareTo(User o) {
			return this.grade - o.grade;
		
	}
	
}
public class ArrayExample {
	public static void main(String[] args) {
		String[] names = { "Hong", "Park", "Choi"};
		Arrays.sort(names); // 가나다순 정렬
		for(String s : names) {
			System.out.println(s);
		}
		int[] scores = {95,80,36,88};
		for(int i : scores) {
			System.out.println(i);
		}
		
		User[] users = {new User("user1", 1), new User("user2", 2), new User("user3", 3)};
		
		Arrays.sort(user);
		for(User s : user) {
			System.out.println(s);
		}
		
	}
	

}
