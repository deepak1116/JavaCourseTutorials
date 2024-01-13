package workingwithstrings;

public class ExampleStringEquality {
    public static void main(String[] args) {
        String s1 = "Hi";
        String s2 ="Hi";
        String s3 = new String("Hi");

        System.out.println(s1 == s2);
        //Returns true since both s1 and s2 having same reference

        System.out.println(s1 == s3);
        //Returns false eventhough s1 and s3 having same value "Hi" because '==' compare the referenece not value
        //since new keyword used s3 will have new reference

        System.out.println(s1.equals(s3));
        //Returns true because string equals method compare values of string not reference


    }
}
