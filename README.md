# java-springboot-2025
2025년 부경대 Java개발자과정 SpringBoot 리포지토리

## 1일차(04-01)

### 웹 개요 
- 구성 3 단계 
    - 브라우저(클라이언트 / 프론트엔드) - 사용자 **요청**을 하고, 결과를 돌려받는 파트 
    - 서버(백엔드) -  사용자의 요청을 받아서 DB에서 데이터를 가져와 처리하고, 사용자에게 **응답** 하는 파트 
    - 데이터베이스 - 가장 중요한 데이터가 저장되어 있는 파트 
- 웹 개념 
    - Request(요청)에 대한 Response(응답)    

### Spring Boot 개요 
- Java - 컴퓨팅 세상 모든 곳에서 사용 될 수 있는 언어가 되보자 개발됨 
- 웹개발
    1. CGI(Common GateWay Interface ) - HTTP 프로토콜에서 정적인 데이터만 전달할 수 있는 웹기술 
    2. Servlet - CGI를 개선한 Java 웹기술 .동적웹을 개발할 수 있음
        - HTML 코드를 전부 다 JAVA에서 작성해야 함 
    3. EJB(Enterprise Java Bean) - 서블릿으로 대형 프로젝트를 개발할 수 있는 Java 웹기술  
        - 무지하게 복잡! 
    4. JSP(Java Server Page) - 웹페이지코드(HTML)에 자바소스를 포함시켜서 개발 할 수 있는 Java 웹기술 
        - 확장자가 .jsp / 스파게티 코드 
    5. Spring - Java 웹 개발에 전성기 .웹페이지와 자바영역 분리
        - 설정이 복잡 
    6. Spring Boot - Spring 단점을 최소화. 설정을 간결화 

- Spring Boot 
  - Spring 기술을 그대로 사용(마이그레이션이 간단)
  - JPA 기술을 사용하면 ERD나 DB 설계를 하지 않고도 손쉽게 DB를 생성 
  - TomCat Webserver가 내장! (설치 필요없음)
  - 서포트하는 기능 다수 존재(개발을 쉽게 도와줌)
  - 테스트용 JUnit, 로그용 Log4J2 모두 포함(설치 필요없음)
  - 프론트엔드를 다양하게 지원.JSP,**Thymleaf**, Mustache 등 
  - MVC(Model View Controller)로 영역을 분리. 각 부분별로 따로 개발 

- MVC 
<img src="./image/sb0001.png" width= "700">

### Spring Boot 개발환경 설정 
- 필요요소 
    - Java,개발툴,데이터베이스 

- Java 
    - Java Runtime과 JDK(Java Developer Kit) 존재
    - https://www.azul.com/downloads/?package=jdk#zulu
    - https://adoptium.net/
    - https://jdk.java.net/

    - Java 17버전 이상설치
    - https://www.oracle.com/kr/java/technologies/downloads/
    - jdk-17.0.13_windows-x64_bin.msi 다운로드

    - 시스템정보에서(sysdm.cpl) 고급> 환경변수 PATH 설정  
       - 새로 만들기 
         - JAVA_HOME - 본인경로 입력 
       - path에 %JAVA_HOME%\bin 추가 , 맨 위로 
    - powershell
      - java --version  
- Visual Studio Code 확장 설치
    - Java 검색 
        - Extension Pack for Java 설치. Debugger for Java 등 총 7가지 확장 설치 

### Java 기본 실행 
- VS Code에서 명령팔레트 실행(Ctrl+Shift+p)
  - Java Create
    1. build tool > Maven 
    2. No ArchType 선택 
    3. Group ID 입력(com.example)
    4. Artifact ID 입력 
    5. 저장위치 결정 

### Spring Boot 설정 
- Visual Studio Code 확장 설치
    - Spring 검색 
       - Spring Boot Extension Pack 설치(추가 3개 확장 같이 설치됨)
       - Spring Initializer Java Support 설치 
       - Spring Boot DashBoard 설치 
    - Gradle(빌드툴)검색
        - Gradle for Java 설치
### Spring Boot 기본 실행(Java 프로젝트)
- JDK버전과 Spring Boot Initializr 에 선택하는 JDK버전이 일치해야 
    - OS에 JDK버전이 17버전이면 17선택 

- VS Code에서 명령팔레트 실행 
    - Spring Initiallizr : Create a Maven Project 선택 
    - Specify Spring Boot version: 3.3.10 (SNAPSHOT) 
    - Specify project language : Java 
    - Input Groupd ID: 본인 아이디 입력 / com.oatmealflyer
    - Input Artifact Id: spring01 
    - Specify packaging type: Jar(Java archive, 압축파일)
    - Specify Java version : 17 
    - Choose dependencies: Selected 0 dependencies
    - 저장위치 선택 
    - **새 창 열기** - Spring BOOT 프로젝트가 루트폴더가 된 개발환경 

- 실행방법 
    - 코드 작성 
    - Spring Boot Dashboard > Apps > 앱 실행

- 기초문법 
    - [JAVA 기초문법](./JAVA_BASIC.md)
    - 기본,변수,자료형,연산자,흐름제어 


## 2일차 
- 기초문법 계속 
    - [JAVA 기초문법](./JAVA_BASIC.md)
    - 흐름제어(반복문),배열,메서드,객체/클래스,상속


## 3일차
- 기초문법 계속 
  - [JAVA 기초문법](./JAVA_BASIC.md)
  - 상속 ,인터페이스,예외처리,제네릭,컬렉션 프레임워크, 입출력   
### Spring Boot Build Tool 
- 개요 
    - 프로젝트 빌드 과정을 자동화시켜주는 도구 
    - 컴파일, 테스트, 패키징, 의존성 관리, 배포 등등 포함
- Maven 
    - Java프로젝트 기본 빌드도구 
    - 빌드, 패키징(jar/war 파일 생성),테스트 등을 한번의 명령으로 간편하게 처리 
    - 가장 큰 특징이 외부 라이브러리 자동으로 다운로드, 관리 
    - pom.xml(Project Object Model)파일로 빌드 설정 관리
        - 초기 설정시 빠졌거나 , 추가되어야 하면 xml 코딩으로 추가 
    - VS Code 확장 중 Maven Dependency Explorer 등으로 확인
- Gradle 
    1. 안드로이드용 오픈소스 빌드도구
    2. Maven Repository를 같이 사용  
    3. Maven의 3,4번 특징을 그대로 가지고 있음 
    4. build.gradle 파일 사용. Groovy 스크립트 지원 
    5. 빌드과정을 병렬처리, 캐싱사용으로 Maven보다 10~100배 향상된 성능 구현 

### Gradle 설정 
- Gradle로 프로젝트가 제대로 동작하지 않으면 
    - https://gradle.org/ 에서 gradle 다운로드 
    - 설치 경로 확인, 설치 
    - 시스템 등록정보 PATH 지정.

### Spring Boot 로그 설정 
- Spring Boot를 colorizing 해주는 기능 
- src/resources/application.properties 

  ```shell 
  spring.output.ansi.enabled=always
  ```
- 서버 재시작 

## 4일차 
- 기초 문법 마무리 
    - [JAVA기초문법](./JAVA_BASIC.md)
    - 제네릭,컬렉션 프레임워크,입출력, 람다식, 스트림API  

- Spring Boot 시작
- Gradle 오류 해결 방법  
  - [Gradle](https://gradle.org/install/)
  - C:\Gradle 위치에 압축해제 
  - sysdm.cpl 환경변수 GRADLE_HOME 경로 입력,확인(JAVA_HOME과 동일)
    <img src="./image/sb0005.png" width ="600">
  - VS Code 설정 
  <img src="./image/sb0003.png" width= "700">

  Gradle Build Server : Enabled 기본 on-> off
  <img src="./image/sb004.png" width="700">

  - Gradle Home -> 환경변수 입력한 GRADLE_HOME의 경로 입력 
  - Gradle Java Home -> 환경변수 JAVA_HOME의 경로 입력 
  - VS Code 재시작. 

## 5일차 
### Spring Boot 웹실행
- 프로젝트 초기화 
    - Spring Initializr : Create a gradle project ... 
    - Specify Spring Boot version : 3.4.4 
    - Specify project language : Java 
    - Input Group Id : com.oatmealflyer(각자 설정할 것)
    - Input Artifact Id: spring03
    - Specify packaging type:java  
    - Specify Java version : 17 
    - Choose dependencies : Selected 1 dependencies 
        - Spring Web 
    - 저장위치 선택 
    - **새창 열기 ** - Spring Boot 프로젝트가 루트폴더가 된 개발환경 

- 포트번호 
    |프로토콜|포트번호|비고|
    |:---|---|:---|
    |HTTP|80|웹 서버,서비스 포트(보안취약)|
    |HTTPS|443|SSL를 적용한 웹 서버,서비스(보안강화)|
    |FTP|21|웹을 통한 파일전송| 
    |TELNET|원격서버접속 서비스|
    |SSH|22|보안강화된 텔넷| 
    |SMTP|25|메일 전송서비스

- 개발용 포트
    - 포트는 중복안됨 
    - 8080 포트를 사용하고 있으면 다른 포트로 변경해야 함
    - 포트 변경시 application.properties에 `server.port = 8090` 추가

- 웹 브라우저 열기 
    - http://localhost:8090/ 오픈 

    <img src="./image/sb0006.png" width= "700">

- 접속위치 요청 처리 
     - 컨트롤러 생성
         - HelloController 클래스 생성 
         - http://localhost:8090/hello
     - 각 기능별로 패키지를 구분
        - controller , model 등 ...
- Log-back 
    - 스프링부트에 내장된 로그 모듈 

    - application.properties 내 로그 설정 

    ```groovy
    logging.level.root = info 
    logging.file.name = /logtest.log 
    ```
- 사용 시 
```java
// 클래스 내 작성 
private final 
```

### 스프링 부트 배너 (중요도 없음)
- resources 폴더에 banner.txt 생성 
- 내용 추가 
- Spring Boot Banner Generator (https://devops.datenkollektiv.de/banner.txt/index.html)
- 배너제너레이터로 생성한 글자 복사 banner.txt 붙여넣기 
- 서버 재시작 
<img src="./image/sb0009.png">

### 스프링부트 프로젝트 구조 
<img src="">

- 각 폴더 구조
    - .gradle ~ gradle : 그레이들, VSCode, 빌드 등에 필요한 폴더(설명필요X)
    - `src/main/java` : 패키지와 자바 소스가 저장되는 위치
    - com.hugo83.spring03 : 패키지. 폴더로 구성
        - HelloController 클래스에 접근하려면
        - com.hugo83.spring03.controller.HelloController 접근해야 함
    - Spring03Application.java : 시작프로그램
    - src/main/resources : 자바파일 이외 HTML, CSS, JS, 환경파일 등 리소스파일 저장되는 위치
        - `static` : CSS, JS, 이미지 파일 저장되는 곳
        - `templates` : 스프링부트와 연계되는 HTML 파일 저장되는 곳
        - `application.properties` : 프로젝...

#### 어노테이션 
- 한글로 주석이지만 , #, //,/**/ 소스에 영향을 미치지 않는 주석과 다름 
- 자바 소스에 추가해서 여러가지 기능을 수행하는 메타데이터 일종 
- @로 시작,JDK 1.5 이상부터 사용가능 
- 클래스 파일에 같이 포함된 JVM 작동시 실행됨 
- 클래스, 메서드 바로 위에 작성. 코드와 설정을 관리할 수 있게 도와주는 역할

###### 1. @Override 
- 오버라이드를 올바르게 했는지 컴파일러 체크 
- 상속 , 인터페이스 구현시 사용 

##### 2. @Deprecated 
- 앞으로 다음버전에서 삭제될 수 있음. 사용하지 말것을 권유하는 체크 
<img src ="./image/sb0011.png" width="700">

- 되돌기염ㄴ 이 함수 는 사용하지 말 것 

###### 3. FunctionalInterface 
- 함수형 인터페이스에 붙여서, 컴파일러가 올바르게 작성되었는지 체크 

##### 4. @SuppressWarnings 
- 컴파일러의 경고메시지가 표시되지 않음

#### @SpringBootApplication 
- 스프링부트 자동구성 매커니즘 활성화 
- 어플리캐이션 내 패키지에서 컴포너트를 스캐닝 
- 설정 클래스 임포트해서 활성화, 스프링부트 실행 

#### @Controller 
- 컴포넌트 구체화해서 해당클래스 IoC컨테이너 Bean으로 등록 

#### @GetMapping 
- Get,Post 중 Get(URL)으로 들어주는 주소를 매핑. 처리해주는 역할 
- @PostMapping , @RequestMapping 등 파악 
#### @ReponseBody 
- HTTP 요청의 자바객체가 처리한 body내용을 매핑하는 역할 
- 자바의 String 문자열을 웹페이지에 렌더링. 


## 6일차(06-26)

