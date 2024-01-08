package controlflow;

public class ExamplesForEach {
    public static void main(String[] args) {
        int[] nrs = {0,1,2,3,4,5,6,7,8,9};
        int sum =0;

        for (int number: nrs){
            System.out.println(number);
            sum += number;
        }
        System.out.println(sum);
    }
}
