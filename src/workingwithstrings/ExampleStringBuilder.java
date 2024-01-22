package workingwithstrings;

public class ExampleStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Deepak");
        sb.append(" loves java ");
        String s = sb.toString();

        StringBuilder sb1 = new StringBuilder("Hello ");
        sb1.append(", ");
        sb1.append("World");
        sb1.append("!");

        String greeting = sb1.toString();
        System.out.println(s + "\n"+greeting);

    }
}
