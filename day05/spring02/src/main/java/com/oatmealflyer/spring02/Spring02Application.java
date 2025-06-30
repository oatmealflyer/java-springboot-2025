package com.oatmealflyer.spring02;

import java.io.FileOutputStream;
import java.io.FileWriter;
// import java.io.FilterWriter;
import java.io.IOException;
import java.nio.charset.Charset;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring02Application {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(Spring02Application.class, args);

		// 파일 쓰기,FileOutPutStream
		FileOutputStream output = new FileOutputStream("C:\\temp\\test.txt");
		// 뭘하고 ..

		for (int i = 0; i < 10; i++) {
			StringBuilder sb = new StringBuilder((i + 1) + "번째 줄입니다.\n");
			output.write(sb.toString().getBytes(Charset.defaultCharset()));
		}
		output.close();
		System.out.println("FileOutputStream 파일 생성 완료!");

		// FileWriter
		FileWriter fw = new FileWriter("C:/temp/fwtext.txt");
		for (int i = 0; i < 10; i++) {
			String str = (i + 1) + "번째 줄입니다.\n"; // \r\n이 필요없음
			fw.write(str);
		}
		fw.close();
		System.out.println("FileWriter 파일 생성 완료");

		// // FileWriter 추가 모드 사용
		// FileWriter fw2 = new FileWriter("C:/temp/append.txt",true);
		// // BufferedReader -한줄씩 읽어버올 때

	}

}
