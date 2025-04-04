package com.oatmealflyer.spring02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring02Application {

	public static void main(String[] args) {
		int num=10;
		float fnum =3.14f;
		double dnum = 345.67;
		long lnum = 34865432783L;

		Integer num2 = 10;
		Float fnum2 = 3.15f;
		Double dnum 

		SpringApplication.run(Spring02Application.class, args);

		// 제네릭 문자열사용 
		Storage<String> storage1 = new Storage<String>();
		storage1.setItem("ionic");
		System.out.println(storage1.getItem());

		//제네릭 정수사용 
		Storage<Float> storage2 = new Storage<>();
		storage2.setItem(3.141592F);
		System.out.println(storage2.getItem());

		//리턴타입 및 인자가 모두 제네릭일때 처리
		Spring02Application app = new Spring02Application();
		System.out.println(app.convert(storage1));
	}
	//storage에 들어온 아이템을 문자로 분리해서 리스트에 담는 기능 
	public <T> List<Character> convert(Storage<T> storage){
		ArrayList<Character> list = new ArrayList<>();

		String s = String.valueOf(storage.getItem());
		for(int i=0; i<s.length(); i++){
			list.add(s.charAt(i));
		}
	}

}
