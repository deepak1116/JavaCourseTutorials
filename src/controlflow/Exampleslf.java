package controlflow;

public class Exampleslf {
    public static void main(String[] args) {

        int input = 1;

        if (input != 0){
            System.out.println("2 divided by the input equals: "+ (2/input));
        }else {
            System.out.println("Input cannot be 0");
        }

        int hour = -9;

        if (hour >= 0 && hour < 12){
            System.out.println("Good Morning!");
        }else if (hour > 12 && hour < 18){
            System.out.println("Good Afternoon");
        } else if (hour < 24 && hour > 18) {
            System.out.println("Good Evening");
        }else{
            System.out.println("I don't the hour, but good day.");
        }
    }
}
