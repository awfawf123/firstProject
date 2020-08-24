package com.yedam.test;

public class Person {
	String name;
	int age;
	@Override
	public int hashCode() {
		return this.age;
	}
	@Override
	public boolean equals(Object obj) {
		Person p = (Person) obj;
		return this.age;
		
	}
	public Person() {}

}
