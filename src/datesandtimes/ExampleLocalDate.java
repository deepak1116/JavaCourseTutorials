package datesandtimes;

import java.time.LocalDate;

public class ExampleLocalDate {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(1999,3,8);
        LocalDate localDate2 = LocalDate.parse("1999-12-09");

        System.out.println(localDate +" "+localDate1+" "+localDate2);

        localDate2 = localDate.plusDays(5);
        System.out.println(localDate2);

        System.out.println(localDate1.getDayOfMonth());
    }
}
