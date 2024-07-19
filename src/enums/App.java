package enums;

public class App {
    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.FRIDAY;
        DayOfWeek day1 = DayOfWeek.SUNDAY;

        if (day == day1){
            System.out.println("The same day");
        }else{
            System.out.println("Not the same day");
        }

        System.out.println(day.ordinal());
    }
}
