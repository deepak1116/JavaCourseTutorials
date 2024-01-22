package datesandtimes;

import java.time.Duration;
import java.time.Period;

public class ExampleDurationAndPeriod {
    public static void main(String[] args) {
        Duration duration  = Duration.ofNanos(100000000);
        Duration duration1 = Duration.ofSeconds(100,1000);
        Duration duration2 = Duration.ofDays(7);

        System.out.println(duration.getNano()+"\n"+duration1.getSeconds()+"\n"+duration2.getSeconds());

        Duration duration3 = duration.plus(duration1);
        System.out.println(duration3.getSeconds());

        Period period = Period.of(10,2,3);
        Period period1 = Period.ofWeeks(12);

        System.out.println(period.getDays()+"\n"+period1.getDays());

        System.out.println(period.getDays());
    }
}
