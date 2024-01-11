package accessmodifiers;

public class Main {
    public static void main(String[] args) {
        PersonDefaultModifier p = new PersonDefaultModifier();
        p.name = "Deepak";
        p.sayHi();


        /* Example of Public and Private access modifiers
        Person p = new Person();
        p.name = "Deepak";
        p.sayHi(); */
    }
}
