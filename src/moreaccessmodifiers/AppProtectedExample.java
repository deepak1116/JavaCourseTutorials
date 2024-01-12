package moreaccessmodifiers;

import accessmodifiers.PersonProtectedModifier;

public class AppProtectedExample extends PersonProtectedModifier{
    public static void main(String[] args) {
        PersonProtectedModifier p = new PersonProtectedModifier();
        p.name = "Bob";
        p.sayHi();
    }

    public void greeting(){
        sayHi();
        name = "Linda";
    }
}
