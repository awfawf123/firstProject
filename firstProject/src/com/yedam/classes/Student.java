package com.yedam.classes;

public class Student {
	String name;
	String major;
	int ID;
	
	public Student() {
		
	}
	public Student(int ID) {
		this.ID = ID;
	} 
	public Student(int ID, String name) {
		this.ID = ID;
		this.name = name;
	}
	public Student(int ID, String name, String major) {
		this.ID = ID;
		this.name = name;
		this.major = major;
	}
	public int getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	public void getMajor(String major) {
		this.major = major;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String introduce() {
		return "이름은 " + name + " 학번은 " + ID + " 전공은 "+ major+ "입니다";
	}

}
