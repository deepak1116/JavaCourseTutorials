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
        int a = 7;
        int b = 70;
        int c = 4;
        System.out.println("Modulus of 10 % 5 : "+a%b);
        System.out.println("Modulus of 10 % 2 : "+a%c);

        //Assignment operators
        int number1 = 7;
        int number2 = 70;

        //(number1 += number2) +=
        System.out.println("Assign operator "+number1+" += "+number2+" : "+(number1 += number2));
        //(number1 -= number2) -=
        System.out.println("Assign operator "+number1+" -= "+number2+" : "+(number1 -= number2));
        //(number1 *= number2) +=
        System.out.println("Assign operator "+number1+" *= "+number2+" : "+(number1 *= number2));
        //(number1 /= number2) +=
        System.out.println("Assign operator "+number1+" /= "+number2+" : "+(number1 /= number2));
        //(number1 %= number2) +=
        System.out.println("Assign operator "+number1+" %= "+number2+" : "+(number1 %= number2));

        //Unary operators
        int number3 = 5;
        number3--;
        System.out.println(number3);

        int number4 = 6;
        System.out.println(-number4);//-6
        System.out.println(number4);//6

        int pre = 5;
        int post = 5;
        System.out.println(++pre);
        System.out.println(post++);
        System.out.println("Post: "+ post + " pre: "+pre);

        //relational operators
        int small = 5;
        int big = 10;
        System.out.println(small == big);
        System.out.println(small != big);
        System.out.println(small >= big);
        System.out.println(small <= big);
        System.out.println(small < big);
        System.out.println(small > big);

    }
}
