
package com.yedam.test;

import java.util.Arrays;

public class MemberExample2 {
	public class Member implements Cloneable {
		public String name;
		public int age;
		public int[] scores;
		public Car car;

		public Member(String name, int age, int[] scores, Car car) {
			this.name = name;
			this.age = age;
			this.scores = scores;
			this.car = car;
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			Member cloned = (Member) super.clone();
			cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
			cloned.car = new Car(this.car.model);
			return cloned;
		}

		public Member getMember() {
			Member cloned = null;
			try {
				cloned = (Member) clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
			return cloned;
		}

	}

	public class Car {
		public String model;

		public Car(String model) {
			this.model = model;
		}
	}

	public static void main(String[] args) {
		MemberExample2 me = new MemberExample2();
		Member original = me.new Member("홍길동", 25, new int[] { 90, 90 }, new Car("소나타"));

		Member cloned = original.getMember();
		cloned.scores[0] = 100;
		cloned.car.model = "그랜저";
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("name: " + cloned.name);
		System.out.println();
	}

}
