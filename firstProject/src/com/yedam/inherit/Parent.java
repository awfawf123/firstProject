package com.yedam.inherit;

public class Parent {
	private String name;
	private int age;
	
	public Parent(String name, int age) {
		super(); //부모클래스의 생성자 호출
		this.name = name;
		this.age = age;
	
	}
	public Parent(){
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		
		return "Parent [name=" + name + ", age=" + age + "]";
	}
	
}
