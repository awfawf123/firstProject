package com.yedam.classes;

public class Friend {
	
	//필드
	private String name;
	private int age;
	private String phone; //12-3456-78
	//생성자
	//생성자 오버로딩
	public Friend(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	public Friend() {}
	//메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "친구 이름: "+ this.name 
				+"연락처: "+ this.phone;
	}
	
	

}
