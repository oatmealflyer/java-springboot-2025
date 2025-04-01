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




## 2일차 
## 3일차 
## 4일차 
## 5일차 

