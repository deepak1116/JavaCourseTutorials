package staticmodifier;

public class Main {
    public static void main(String[] args) {

        System.out.println(MathUtil.pi);
        double result = MathUtil.subtract(10,3);
        System.out.println(result);

        MathUtil m = new MathUtil();
        System.out.println(m.pi);
        System.out.println(m.subtract(12,3));

        MathUtil m1 = new MathUtil();
        m1.pi = 12;

        System.out.println(m.pi + " "+ MathUtil.pi+ " "+ m1.pi);
    }
}
