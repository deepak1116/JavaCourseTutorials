package controlflow;

public class ExamplesWhile {
    public static void main(String[] args) {
        boolean notFound = true;
        while (notFound){
            int randomNumber = (int) (Math.random() * 11);
            System.out.println("Generated random number : "+randomNumber);
            if (randomNumber == 10){
                notFound = false;
            }
        }
    }
}
