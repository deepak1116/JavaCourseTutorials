package primitivevsobjects;

public class App {
    public static void main(String[] args) {
        Person p = new Person();
        int i = 3;

        p.name = "Deepak";
        changeStuff(i,p);
        System.out.println(i + " " + p.name);
    }

    public static void changeStuff (int x,Person person){
        x = 5;
        person.name = "Mikey";

    }
}
