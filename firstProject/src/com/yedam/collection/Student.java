package com.yedam.collection;

public class Student implements Comparable<Student> {
	public String name;
	public int engscore;
	public int mathscore;
	
	public Student(String name, int engscore, int mathscore) {
		this.name = name;
		this.engscore = engscore;
		this.mathscore = mathscore;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEngscore() {
		return engscore;
	}

	public void setEngscore(int engscore) {
		this.engscore = engscore;
	}

	public int getMathscore() {
		return mathscore;
	}

	public void setMathscore(int mathscore) {
		this.mathscore = mathscore;
	}

	@Override
	public int compareTo(Student o) {
		return this.mathscore - o.mathscore;
	}

	
	

	
	
	

}
