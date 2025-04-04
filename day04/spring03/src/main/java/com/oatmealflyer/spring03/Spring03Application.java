package com.oatmealflyer.spring03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring03Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring03Application.class, args);

		//컬렉션 프레임워크 
		//List 
		List <String> lst1= new ArrayList<>();

		lst1.add("One");
		lst1.add("Two");
		lst1.add("Three");
		lst1.add("Four");

		System.out.println(lst1);
		//정렬 
		Collections.sort(lst1);
		System.out.println(lst1);

		Collections.sort(lst1,Collections.reverseOrder());
		System.out.println(lst1);
		//lst1.sort(); // 이 정렬 메서드 사용해도 무방 
		System.out.println(lst1.contains("Three")); //lst1 리스트에 "Three" 라는 문자열이 존재하는지 여부 
		System.out.println(lst1.isEmpty()); //리스트가 비어있는지 판별
		System.out.println(lst1.size()); // 배열. length() 동일 
		
		//! 중요한 메서드 
		//lst1.clear(); //로직 중간에 함부로 쓰지 말것! 프로그램 종료시 리스트를 비우는 것! 

		// Vector 
		Vector<String> vec1 = new Vector<>(10); //용량을 지정할 수 있음
		vec1.add("One");
		vec1.add("Three");
		System.out.println("벡터크기->" +vec1.size());
		System.out.println("벡터용량->"+vec1.capacity());
		

		//Set 
		Set<String> set1 = new HashSet<>();
		set1.add("One");
		set1.add("Two");
		set1.add("Three");
		set1.add("Four");
		set1.add("Five");

		System.out.println(set1);

		//Map 
		Map<String,String> phones = new HashMap<>();
		phones.put("010-9999-5555","Galaxy S10");
		phones.put("010-0000-7733","IPhone 14");
		phones.put("010-9898-6890","Galaxy S24");
		phones.put("010-6666-6622","IPhone 11");

		System.out.println(phones);

		System.out.println(phones.get("010-6666-6622")); 
		System.out.println(phones.values());
		System.out.println(phones.keySet());
		System.out.println(phones.containsKey("010-9898-6890"));
		System.out.println(phones.containsValue("Galaxy S11"));

		//샘플 - 학생 네 명의 국어,영어,수학,미술, 체육 점수 합산/평균 
		List<Integer> std1 = Arrays.asList(96,100,55,80,70);
		List<Integer> std2 = Arrays.asList(100,100,99,95,96);
		List<Integer> std3 = Arrays.asList(50,50,40,100,90);
		List<Integer> std4 = Arrays.asList(85,85,84,86,88);

		Map<String,List<Integer>> students = new HashMap<>();
		students.put("홍길동", std1);
		students.put("애슐리", std2);
		students.put("성유고", std3);
		students.put("김기윤", std4);

		Scanner scan = new Scanner(System.in);
		System.out.println("성적 조회활 학생 이름 입력>");
		String inName = scan.next();

		int sum = 0;
		for(int score: students.get(inName)){ //홍길동 -> [96,100,55,80,70]}
			sum += score;
	}
	System.out.println(inName + "학생의 성적 총점은 "+sum+ ", 평균은"+(sum/5));

}
}