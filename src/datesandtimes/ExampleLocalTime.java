package datesandtimes;

import java.time.LocalTime;

public class ExampleLocalTime {
    public static void main(String[] args) {
        LocalTime localTime =  LocalTime.now();
        LocalTime localTime1 = LocalTime.of(6,30,20);
        LocalTime localTime2 = LocalTime.parse("23:59:59");

        System.out.println(localTime+" "+localTime1+" "+localTime2);

        LocalTime localTime3 = localTime.plusHours(6);
        System.out.println(localTime3);



    }
}
