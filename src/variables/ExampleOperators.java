package variables;

public class ExampleOperators {
    public static void main(String[] args) {
        //arithmetic operators
        int x = 4;
        int y = 5;
        int z = x + y;

        System.out.println(z);
        System.out.println(x-y);
        System.out.println(x*y);
        //for division needs to use float or double

        double d1 = 4;
        double d2 = 2;
        double dResult = d1 / d2;
        System.out.println(dResult);

        //Modulus
        int a = 10;
        int b = 5;
        int c = 4;
        System.out.println("Modulus of 10 % 5 : "+a%b);
        System.out.println("Modulus of 10 % 2 : "+a%c);
    }
}
