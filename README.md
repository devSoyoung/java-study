# JAVA 스터디용 프로젝트
자바 언어의 기초적인 문법이나, 주요한 개념에 대해서 이해하기 위해 진행하는 간단한 프로젝트.

***
## 프로젝트 설명
### ver.1
학생의 숫자를 (맞출 때까지) 입력받고, 맞추면 학생의 이름을 전부 출력해준다.

***

## 자바 설치과정
windows 기준으로 oracle JDK 설치 실행파일을 다운받아서 설치하였다. 여러 자바 개발 툴 중에서 IntelliJ를 사용하였다. 
### 환경변수 설정하기 [[참고]](http://c-calliy.tistory.com/42)
환경변수에 등록된 경로는 컴퓨터의 어느 위치에서든 접근(실행)이 가능하다. 파일의 접근을 쉽고 편하게 하기 위해서 설정하는 것으로 이해.

#### 환경변수 설정하기

1. 제어판 > 시스템 > 고급 시스템 설정 > 환경변수로 들어간다.
2. 시스템 환경변수에 JAVA_HOME을 추가한다. jdk의 설치 경로를 PATH에 입력해준다.
3. PATH에 *%JAVA_HOME&\bin;* 을 추가해준다.

환경변수를 설정하고 명령 프롬프트(cmd)를 재실행하여 java, javac를 입력했을 때, 설치한 버전이 제대로 뜨면 환경변수 설정이 완료된 것이다. 

***

## 문법 정리
비슷하고 그나마 더 잘 아는 언어가 C++이므로, C++을 기준으로 다른 점을 주로 정리함.

### 자료형
자바에는 byte라는 자료형이 있다. 크기는 1byte로 -128 ~ 127의 정수를 표현할 수 있다.

### 반복문
```java
for (String student : students) {
    System.out.println(student);
}
```

배열의 요소들을 순차적으로 꺼내서 student라는 이름의 변수로 사용할 수 있다.

### 입력과 출력
#### 키보드로부터 데이터 입력받기
```java
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    // ...
    sc.close();
}
```
#### 화면에 데이터 출력하기
```java
import java.util.Scanner;

public class Main {
    System.out.println("Hello, World!");
}
```