package com.yedam.test;

//class Something {
//	String field1;
//	int field2;
//	int[] field3;
//
//	Something(String field1, int field2, int[] field3) {
//		this.field1 = field1;
//		this.field2 = field2;
//		this.field3 = field3;
//	}
//}
//
//public class NewExample {
//	public static void main(String[] args) {
//		int numA = 10;
//		String str = "10";
//		float f1 = 10.8f;
//
//		// something = "hello",10;
//		Something something = new Something("hello", 10, new int[] { 1, 2, 3, 4, 5 });
//		System.out.println(something.field1);
//		System.out.println(something.field2);
//		for (int i = 0; i < something.field3.length; i++) {
//			System.out.println(something.field3[i]);
//		}
//
//	}
//
//}

//class Math {
//	public static int min(int a, int b) {
//		int result = (a <= b) ? a : b;
//		return result;
//	}
//}
//
//class Calculator{
//	public static int sum(int[] ary) {
//		int sum =0;
//		for(int i : ary) {
//			sum+=i;
//			
//		}
//		return sum;
//	}
//}
//
//public class NewExample {
//	public static void main(String[] args) {
//		int result = Math.min(39, 25);
//		System.out.println(result);
//		int[] ary = {1,2,3,4,5};
//		System.out.println(Calculator.sum(ary));
//
//	}
//
//}

public class NewExample {
	class Member {
		String id;

		Member(String id) {
			this.id = id;

		}
		
	}

	public static void main(String[] args) {
		NewExample ne = new NewExample();
		Member m1 = ne.new Member("hong");
	}
}