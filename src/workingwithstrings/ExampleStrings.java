package workingwithstrings;

public class ExampleStrings {
    public static void main(String[] args) {
        String str = "Hi! all";

        System.out.println(str.length());
        System.out.println(str.charAt(3));
        System.out.println(str.indexOf("a"));
        System.out.println(str.substring(3));
        System.out.println(str.substring(3,5));
        System.out.println(str.toLowerCase() +"  "+str.toUpperCase());

        String str1 = "     bla bla bla     ";
        System.out.println(str1.trim());
    }
}
