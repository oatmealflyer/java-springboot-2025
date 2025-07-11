package com.oatmealflyer.spring01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring01Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring01Application.class, args);

		System.out.println("Hello, Spring Boot");

		// 변수연습
		int account = 10000000;
		System.out.println("계좌금액은" + account);
		float pi = 3.141592f;
		System.out.println("Pi는" + pi);
		char ch_first = 'A';
		System.out.println("문자는" + ch_first);

		// 연산자 연습
		int a = 17;
		int b = 24;
		System.out.printf("a+b= %d\n", a + b);
		float divresult = a / b;
		System.out.printf("a/b=%f\n", divresult);

		// while문 - 조건에 맞지 않으면 한번도 실행 안됨
		int num = 10;
		while (num >= 0) {
			System.out.println(num);
			num--;
		}

		System.out.println("While문 종료");

		// do-while 문 - 조건에 맞지 않아도 한번은 실행이 됨
		int cnt = 1;
		do {
			System.out.println(cnt);
			cnt++; // cnt를 1씩 증가
		} while (cnt < 10);

		System.out.println("do-While문 종료");

		num = 1;
		// break, continue
		while (num >= 11) {
			if (num % 2 == 0) {
				num++; // num를 1씩 증가
				break; // if문 조건이 참이면 반복문 완전히 탈출
				// continue; //if문 조건이 참이면 빠져나가서 반복문 위로 다시 올라감
			}
			System.out.println(num);
			num++; // num를 1씩 증가
		}
		System.out.println("break/continue 종료");
	}

}
