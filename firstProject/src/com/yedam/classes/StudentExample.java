package com.yedam.classes;

public class StudentExample {
	public static void main(String[] args) {
		Student stu = new Student();

		Student hong = new Student();
		hong.setName("홍길동");
		hong.setID(111);
		hong.setMajor("역사");

		Student kim = new Student();
		kim.setName("김유신");
		kim.setID(222);
		kim.setMajor("말타기");

		Student[] studAry = { hong, kim };
		for (int i = 0; i < studAry.length; i++) {
			studAry[i].introduce();

			String searchName = "김유신";
			String searchMajor = "역사";

			Student[] sAry = { hong, kim };
			for (Student s : sAry) {
				if (s.getName().equals(searchMajor))
					System.out.println(s.toString());
			}

		}
		// System.out.println(hong.introduce());
		// System.out.println(kim.introduce());

	}
}
