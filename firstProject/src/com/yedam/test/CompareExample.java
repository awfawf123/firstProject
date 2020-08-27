package com.yedam.test;

import java.util.Comparator;
import java.util.Objects;

public class CompareExample {
	static class StudentComparator implements Comparator<Student> {

		@Override
		public int compare(Student a, Student b) {
			return Integer.compare(a.sno, b.sno);
		}

	}

	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);

		int result = Objects.compare(s1, s2, new StudentComparator());
		System.out.println(result);
		result = Objects.compare(s1, s3, new StudentComparator());
		System.out.println(result);
	}

	static class Student {
		int sno;

		Student(int sno) {
			this.sno = sno;
		}
	}

}
