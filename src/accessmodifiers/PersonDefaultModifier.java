package accessmodifiers;

public class PersonDefaultModifier {
    String name;
    private String secret;

    void sayHi(){
        System.out.println("Hello I'm "+ name);

    }

    private void tellSecret(){ //only accessible from within class
        System.out.println("The secret is "+ secret);
    }
}
