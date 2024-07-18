package constructors;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("John",20);
        Student s2 = new Student("Kriya",28,11);
        System.out.println(s1.getAge());
        System.out.println(s1.getName());

        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getStudentNr());

    }
}
