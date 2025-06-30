package com.oatmealflyer.spring04;

import java.util.List;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring04Application {
   // public interface myMax { // 익명함수를 위한 인터페이스
   // int max(int a, int b);}

   public static void main(String[] args) {
      SpringApplication.run(Spring04Application.class, args);

      // 람다식
      // 1. 일반방식
      Spring04Application app = new Spring04Application();
      System.out.println(app.helloJava());

      // 2. 기존익명함수
      // System.out.println(new lambdaFunc()) {public int max(int a, int b) {return a
      // > b ? a : b;}} . max(14, 34);

      // 3. 람다방식 !! (예시)
      // String result = () -> {"Hello, Java!";};
      // System.out.println({() -> "Hello, Java!"});
      myFuncInterface fi = () -> {
         System.out.println("Hello, Java! 난 람다람쥐 호출이야 'ㅅ'!");
      };
      fi.printHello();
   }

   // 스트림API 실습
   List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

   public String helloJava() {
      return "Hello, Java! 난 일반 호출이야 ^_^! ";
   }

   @FunctionalInterface // 함수형 인터페이스로 지칭
   public interface myFuncInterface {
      void printHello();
   }

}
