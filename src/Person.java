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
