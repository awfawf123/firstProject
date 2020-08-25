package com.yedam.collection;

import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample3 {
	public static void main(String[] args) {
		TreeMap<Student, String> tMap = new TreeMap<>();
		tMap.put(new Student("Hong", 69, 79), "체육특기생");
		tMap.put(new Student("Park", 78, 88), "일반학생");
		tMap.put(new Student("Choi", 85, 79), "체육특기생");
		tMap.put(new Student("Kim", 90, 86), "일반학생");

		SortedMap<Student, String> sMap = tMap.headMap(new Student("Base", 80, 88));
		Set<Student> set = sMap.keySet();
		for (Student s : set) {
//		System.out.println(s.getName() + "," + s.getMathscore());
		System.out.println(s.name +","+ s.engscore +","+ s.mathscore);
			
		}

//	tMap.headMap(toKey)//80점 이하
//	tMap.tailMap(fromKey) // 80이상
//	tMap.subMap(fromKey, toKey)// 70~80사이
	}
}