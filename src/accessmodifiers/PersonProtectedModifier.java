package accessmodifiers;

public class PersonProtectedModifier {
    protected String name;
    private String secret;

    protected void sayHi(){
        System.out.println("Hello I'm "+ name);

    }

    private void tellSecret(){ //only accessible from within class
        System.out.println("The secret is "+ secret);
    }
}
