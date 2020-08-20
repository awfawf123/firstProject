package com.yedam.collection;
//com.yedam.classes.exam.Member
//com.yedam.collection.Member

public class Member {
	private String name;
	private int age;

	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	//hashcod, equals 활용. 논리적으로 동일한 객체.
	@Override
	public int hashCode() {
		return this.name.hashCode(); // 이름만 같으면 같다고 표시
//		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Member mem = (Member) obj;
		return this.name.equals(mem.name);
		
//		return super.equals(obj);
	}

	
	
}
