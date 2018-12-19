// 입/출력, 조건문, 반복문, 함수, 배열이 적용된 예제

import java.util.Scanner;

public class Main {
    public static boolean checkNumber(int inputNum) {
        if (inputNum == 4) return true;
        return false;
    }

    public static void main(String[] args) {
        String[] students = {"김철수", "박영희", "홍길동", "이춘향"};
        Scanner sc = new Scanner(System.in);
        System.out.println("학생은 모두 몇 명일까요?\n0-10까지 생각나는 숫자를 하나 입력하세요.");
        while (sc.hasNextInt()) {
            byte inputNumber = (byte)sc.nextInt();
            if (checkNumber(inputNumber)) {
                System.out.println("정답입니다. 학생들의 이름은");
                for (String student : students) {
                    System.out.println(student);
                }
                System.out.println("입니다.");
                break;
            } else {
                System.out.println("틀렸습니다.");
                switch(inputNumber) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                        System.out.println("그것보단 많아요.");
                        break;
                    default:
                        System.out.println("그것보단 작아요.");
                        break;
                }
            }
            System.out.println("다른 숫자를 다시 입력해주세요.");
        }
        sc.close();
    }
}