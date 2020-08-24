package com.yedam.test;

import java.util.HashSet;
import java.util.Set;

public class Example004 {
	public static void main(String[] args) {
		// 배열의 크기 3;
		// 1 ~ 6까지의 임의의 숫자가 반복되지 않도록 배열에 저장
		int[] intAry;
		intAry = new int[3];
		int cnt = 0;
		while (true) {
			int j = (int) ((Math.random() * 6) + 1);
			for (int i = 0; i < intAry.length; i++) {
				if (intAry[i] == j) {
					break;
				}
				if(i!=3)
					continue;
				if(cnt == 3)
					break;
				else
					intAry[cnt++] = j;
			}

		}
		//Collection 활용
		Set<Integer> set = new HashSet<>();
		while(true) {
			int temp = (int)(Math.random()*6+1);
			set.add(temp);
			if(set.size() == 3)
				break;
		}
		for(Integer it : set) {
			System.out.println(it);
		}
		Set<Person> pSet = new HashSet<>();
		pSet.add(new Person("Hong1", 20));
		pSet.add(new Person("Hong1", 20));
		pSet.add(new Person("Hong1", 20));
		
		for (Person p : pSet) {
			System.out.println(p.name + ", "+ p.age);
		}

	}

}
