package datesandtimes;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ExampleZonedDateTime {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Europe/Paris"));

        for (String zoneId : ZoneId.getAvailableZoneIds()){
            System.out.println(zoneId);
        }

        ZonedDateTime zonedDateTime2 = zonedDateTime.withZoneSameInstant(ZoneId.of("Egypt"));
        System.out.println(zonedDateTime+"\n"+ zonedDateTime1 +"\n"+zonedDateTime2);
    }
}
