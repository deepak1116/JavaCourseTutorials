package moreaccessmodifiers;

import accessmodifiers.PersonDefaultModifier;

public class App { //Error class created for Default modifier error figuring out purpose
    public static void main(String[] args) {
        PersonDefaultModifier p = new PersonDefaultModifier();
//        p.name = "Deepak";
//        p.sayHi();
        /* name and sayHi cannot be accessed since it is default modifier it should be in public to access from
        other packages
         */
    }
}
