package com.yedam.classes.exam;

public class Member {
	
	private String name;
	private String id;
	private String password;
	private int age;
	
	public Member(String name, String id) {
		
		this.name = name;
		this.id = id;
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public int getAge() {
		return age;
	}
	

	
}
