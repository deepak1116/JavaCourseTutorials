package datesandtimes;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class ExampleCalculating {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime oneOurFromNow =  now.plusHours(1);
        LocalDateTime oneOurFromNow2 =  now.plus(Duration.ofHours(1));
        System.out.println(now +"+ 1 hour "+oneOurFromNow);
        System.out.println(now +"+ 1 hour "+oneOurFromNow2);

        LocalDate today = LocalDate.now();
        LocalDate oneYearAgo = today.minusYears(1);
        LocalDate oneYearAgo2 = today.minus(Period.ofYears(1));

        System.out.println(today +" - 1 year "+ oneYearAgo);
        System.out.println(today +" - 1 year "+ oneYearAgo2);

    }
}
