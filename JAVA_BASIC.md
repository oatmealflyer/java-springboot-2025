## JAVA 기초문법

### 기본 
- 자바 소스코드 구조 
- 소스코드 템플릿 

    ```java 
    // 한줄 주석  
    /* 여러줄
        주석. */
        
    package com.oatmealflyer.spring01; //자기 프로젝트의 패키지명 (폴더와 동일)

    import org.springframework.boot.SpringApplication; // 라이브, 클래스 가져오기  
    import org.springframework.boot.autoconfigure.SpringBootApplication; 

    @SpringBootApplication // 자바프로젝트 실행을 도와주는 어노테이션  
    public class Spring01Application { // 자신의 클래스명

        // 엔트리포인트 (프로젝트당 하나만 존재)
        public static void main(String[] args) { // 함수, 클래스, 조건문, 반복문 시작이 중괄호({)
            SpringApplication.run(Spring01Application.class, args); //한줄이 끝나면 반드시; 
            
            System.out.println("Hello, Spring Boot"); // 콘솔 출력, 문자열을 항상 " 
        }

    }

    ```

- 자바특징
    - 간결하면서 강력한 객제치향 언어 
    - 플랫폼 독립적() , OS에 영향을 거의 받지 않음 
    - 라이브러리가 아주 다양, 생산성 향상 
    - GUI 프로그램 개발에는 부적합(Swing,JavaFx로 가능)
    - 정밀하게 HW를 제어하는 프로그램에도 부적합 

- JVM위에서 동작 
  - Java Virtual Machine : 도커의 컨테이너와 비슷 
  - sourcecode.java -> javac(java compiler) -> bytecode.class -> java로 실행

- 활용분야 
    - 웹에 특화. 인터넷 포털. 인터넷 뱅킹, 쇼핑몰, 기업시스템 
    - 안드로이드 개발 언어였음. Kotlin으로 변경 

### 기초문법 

#### 변수 
- 변수 선언 방법 

```java 
[접근제어자] 타입 변수명; 

```
- 접근 제어자 - 변수의 접근 범위를 지정하는 키워드(public, default,protected,private)
- 타입 - 자료형.자바는 명시적으로 타입 지정해야 함
- 변수명 - 일반적인 변수명 지정법과 동일 

```java 
int account = 10000000; // 정수형(Primitive type)
String sayhi = "Hello"; //문자열형(Class type)
MyClass inst = new MyClass(); // 사용자정의 클래스형
```

- 변수종류 
  - 지역변수 ,전역변수, 매개변수, 멤버변수, 인스턴스변수 

#### 자료형 
- 원시자료형(Primitive type)


    |구분|자료형|크기|설명|
    |:---:|:---:|:---|:---|
    |정수형|byte|1byte, -128~127|가장 작은 단위, 8bit|
    |      |char|2bytes,0~65535|unsigned 자료형,문자표현용|    |
    |      |short|2bytes,-32768~32767|signed자료형,작은데이터처리용  |
    |      |int|4bytes,-2147백만~2147백만|기본자료형 |
    |      |long|8bytes,-922경~922경| 큰정수자료형 |숫자 뒤에 L표시 |
    |실수형|float|4bytes,1.4E-45~3.40E38|실수형, 숫자뒤에 f를 사용필수|
    |      |double|8bytes, 4.9E-324~1.79E308|실수형기본자료형|
    |논리형|boolean|1byte, true 또는 false |논리형, 참/거짓 표현용 |

    ```java 
    int number;
    char ch_first = 'a';
    long longnum = 2345678L; 
    float fnum = 3.141592F; 
    boolean isTrue = false; 
    ```
#### 연산자 
- 연산자는 거의 대부분의 언어에서 동일하게 사용 
    - 사칙연산 : +,-,*, / , %
    - 대입연산 : =,+=,-=,*=,/=,%=,++(a++ , a=a+1 동일),--
    - 비트연산 : &, | , ^ , ~, >>, <<  
