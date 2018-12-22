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