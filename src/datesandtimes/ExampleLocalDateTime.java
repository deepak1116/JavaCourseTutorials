package datesandtimes;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ExampleLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.of(1999,3,8,12,30,20);
        LocalDateTime localDateTime2 = LocalDateTime.parse("2023-03-28T14:20:50");

        System.out.println(localDateTime +"\n"+localDateTime1+"\n"+localDateTime2);

        LocalDateTime localDateTime3 = localDateTime.minusWeeks(3);
        System.out.println(localDateTime3);
    }
}
