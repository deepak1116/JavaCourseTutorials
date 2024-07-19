package constructors;

public class Student  extends Person {

//    private String name;
    private int age;
    private int StudentNr;

    public Student(String name , int age){
//        this.name= name;
//        super(name);
        this(name,age,0);
        this.age = age;
    }
    public Student(String name,int age,int studentNr){
//        this.name=name;
//        super(name);
        this.age=age;
        this.StudentNr=studentNr;
    }

    public int getAge() {
        return age;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudentNr(int studentNr) {
        StudentNr = studentNr;
    }

    public int getStudentNr() {
        return StudentNr;
    }
}
