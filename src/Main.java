// 입/출력, 조건문, 반복문, 함수, 배열이 적용된 예제

import java.util.Scanner;

public class Main {
    private static boolean checkNumber(int inputNum) {
        if (inputNum == 4) return true;
        return false;
    }

    private static void printLessOrMore(int inputNumber) {
        if (inputNumber > 4 && inputNumber <= 10) {
            System.out.println("그것보단 적어요");
        } else if (inputNumber >= 0 && inputNumber < 4) {
            System.out.println("그것보단 많아요.");
        } else {
            System.out.println("주어진 범위를 벗어났어요.");
        }
    }

    private static void printStudents(Student[] students) {
        System.out.println("학생들의 이름은");
        for (Student student : students) {
            System.out.println(student.name);
        }
        System.out.println("입니다.");
        students[1].sleep();
    }

    public static void main(String[] args) {
        String[] studentNames = {"김철수", "박영희", "홍길동", "이춘향"};
        Student[] students = new Student[4];
        for(int i = 0; i < 4; i++) {
            students[i] = new Student();
            students[i].name = studentNames[i];
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("학생은 모두 몇 명일까요?\n0-10까지 생각나는 숫자를 하나 입력하세요.");
        while (sc.hasNextInt()) {
            byte inputNumber = (byte) sc.nextInt();
            if (checkNumber(inputNumber)) {
                System.out.println("정답입니다.");
                printStudents(students);
                break;
            } else {
                System.out.println("틀렸습니다.");
                printLessOrMore(inputNumber);
                System.out.println("다른 숫자를 다시 입력해주세요.");
            }
        }
        sc.close();
    }
}