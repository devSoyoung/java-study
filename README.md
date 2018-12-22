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

### 객체지향과 추상화
자바는 대표적인 객체지향 언어이다. 객체란 변수와 메소드를 그룹핑한 것이고, 추상화는 복잡함 속에서 필요한 관점만을 추출하는 행위이다.([오픈튜토리얼스 자바 강좌](https://opentutorials.org/course/1223/5399) 참고)

### 파일 분할
프로젝트가 커지면 한 파일에 모든 소스코드를 쓰지 않고, 기능 등의 적당한 기준에 따라서 파일을 분리한다. 
#### 패키지
(아직 왜 쓰는지 모르겠다.)

대규모 프로그램을 작성할 때에는 다른 사람들이 설계한 클래스를 가져다 쓰는 경우가 발생한다. 이런 경우에 때때로 클래스 이름이 충돌하는 경우가 있다. 자바에서는 패키지라는 매커니즘을 사용하여 클래스의 이름을 구분하고, 이름 충돌을 방지한다. 

쉽게 말해서 패키지는 클래스의 묶음으로, 하나의 디렉토리가 된다. 패키지 이름과 동일한 디렉토리 내에 클래스 파일을 포함하고, 하위 패키지를 포함하는 중첩된 구조가 가능하다.[[참고]](http://studymake.tistory.com/428)

```java
package myPack;

class sample1 {
    ...
}

class sample2 {
    ...
}
```

위의 두 클래스 sample1과 sample2는 패키지 myPack에 포함된다. 해당 프로그램을 컴파일 하기 전에 작업 폴더에 패키지 이름과 같은 myPack라는 폴더를 생성해야 한다.

##### 다른 패키지 안의 클래스 사용하기
1. 다른 패키지의 클래스에서 사용될 클래스의 이름 앞에 public을 붙여준다.
2. 다른 패키지의 클래스를 사용할 때, 클래스 앞에 패키지 이름을 붙여준다.

### 전역변수, 지역변수
클래스 내에서 선언할 경우, 클래스 내의 메소드들에서 모두 사용이 가능한 전역변수가 된다. 메소드 내부에서 선언할 경우 해당 메소드 내부에서만 사용이 가능한 지역변수가 된다. 

#### 전역변수
전역변수의 경우 객체변수(인스턴스 변수)와 클래스 변수(static 변수)로 나뉜다.

객체변수는 클래스 영역에서 선언되며, 클래스의 객체를 생성할 때 만들어진다. 객체화를 시켜 호출해야만 사용이 가능하다. 클래스 변수는 객체화를 시키지 않고도 사용이 가능하며, 객체변수는 객체화 시킬 때마다 서로 다른 저장공간을 가지는 반면, 클래스변수는 여러번 객체화시켜도 공통적인 저장공간을 가지게 된다. 

### 클래스
```java
class TestClass {
    ...
}
```

와 같이 정의할 수 있다.

#### 객체의 생성
```java
TestClass myClass = new TestClass();
```
객체는 new라는 키워드를 사용해서 생성할 수 있다. TestClass의 인스턴스(메모리에 실제로 할당된, 실존하는 클래스)가 생성된다. 

#### 클래스 배열 만들기
```java
class MyClass {
    ...
}

public static void main(String[] args) {
    MyClass[] classes = new MyClass[3];
    for (int i = 0; i < 3; i++) {
        classes[i] = new MyClass();
    }
}
```

### 클래스의 상속
#### is-a(상속) / has-a
Dog라는 클래스가 더 큰 개념인 Animal 클래스를 상속받았다고 가정했을 때, 강아지는 동물이므로 Dog is an Animal이라는 문장이 성립한다. 이러한 상속 관계를 is-a 관계라고 한다.

#### 다중 상속
C++, 파이썬 등과 달리 자바는 다중 상속을 지원하지 않는다. 만약 A 클래스가 B, C 클래스를 다중 상속한다고 생각해보자. B 클래스와 C 클래스는 모두 sayHello()라는 메소드를 가지고 있다. 두 클래스를 상속받은 A 클래스에서 sayHello()를 호출했을 때, B와 C 중 어느 클래스의 메소드를 실행해야 할까? 이러한 다중상속으로 인해 발생하는 애매모호함을 피하기 위해 다중 상속이 지원되지 않는다.(다른 언어들의 경우 우선순위를 적용해서 해결한다고 한다.)

#### Object 클래스
자바에서 만드는 모든 클래스는 Object 클래스를 상속받는다.
```java
public class MyClass1 extends Object {
    ...
}

public class MyClass2 extends Object {
    ...
}

...

Object cls1 = new MyClass1();
Object cls2 = new MyClass2();
```
이처럼 모든 객체는 Object 자료형으로 사용할 수 있다.

#### Method Overridding
메소드 오버라이딩(부모클래스의 메소드를 자식클래스가 동일한 형태로 재구현하는 행위)을 통해서 상속받은 부모 클래스의 메소드를 자식 클래스에서 재정의 할 수 있다. 이 프로젝트에서는 Person.java 파일의 Person 클래스에서 정의한 Sleep 함수를 Student.java 파일의 Student 클래스에서 재정의하였다.

이렇게 하면 Student 클래스의 sleep 메소드가 Person 클래스의 것보다 더 높은 우선순위를 가지게 되고 student.sleep()를 호출하면 Student 클래스에서 정의한 sleep 메소드가 실행된다. 

```java
// Person.java
public class Person {
    String name;
    int age;

    public void sleep() {
        System.out.println(name + "(이)가 잠들었습니다.");
    }
}
```

```java
// Student.java
public class Student extends Person {
    String major;

    public void sleep() {
        System.out.println(name + "(이)가 공부를 하다 잠들었습니다.");
    }
}
```

### 클래스 생성자 문제
생성자를 오버라이딩하면 클래스 변수들의 값을 생성과 동시에 설정할 수 있다. 이 프로젝트에서 Person 클래스에 생성자를 만들고, Main의 Student를 생성하는 지점에서 바로 값을 바꾸도록 해주었다.

```java
// Person.java
public class Person {
    String name;
    int age;

    public Person(String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.println(name + "(이)가 잠들었습니다.");
    }
}

```

```java
// Main.java
    public static void main(String[] args) {
       ...
        String[] studentNames = {"김철수", "박영희", "홍길동", "이춘향"};
        Student[] students = new Student[4];
        for(int i = 0; i < 4; i++) {
            students[i] = new Student(studentNames[i]);
//            students[i].name = studentNames[i];
        }
     ...
    }
```

에러가 나서 생각해보니, 내가 만들어서 쓰고 있는 것은 Student 클래스였으니, Student 클래스의 생성자를 오버라이딩해줘야겠다고 생각했다. 그래서 Student 클래스에 생성자를 만들어주니 상속 받은 Person 클래스의 default 생성자가 없다라고 에러가 떴다. 검색해보니 super()를 호출해주어야한다고 한다. 그래서 Student 클래스를 다음과 같이 고치니 정상 작동했다.

```java
public class Student extends Person {
    String major;

    public Student(String name) {
        super(name);
//        this.name = name;
    }

    public void sleep() {
        System.out.println(name + "(이)가 공부를 하다 잠들었습니다.");
    }
}
```

super() 그리고 this에 관련되어 잘 정리된 포스트가 있어서 [링크](http://ithub.tistory.com/66)한다.