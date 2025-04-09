package com.oatmealflyer.spring01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring01Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring01Application.class, args);

		//StringBuilder
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		sb.append("Java!");

		System.out.println(sb.toString());
		System.out.println(sb); // StringBuilder 객체만으로도 출력

		StringBuilder sb2 = new StringBuilder("Hi");
		sb2.append("Hugo!");
		System.out.println(sb2.toString());
		//리스트처럼 중간에 내용을 삽입가능 
		sb2.insert(3,"Nice to meet you,");
		System.out.println(sb2.length());
		//문자열 길이 
		System.out.println(sb2.length());

		//문자열 삭제
		sb2.delete(19, 25);
		System.out.println(sb2.reverse());
		//문자열 대체

		sb2.replace(0, 1, "h");
		System.out.println(sb2.toString());
		
		//문자열 자르기,자른 값을 달다르 벼우세                       
		##

	}

}
