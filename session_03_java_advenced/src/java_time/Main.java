package java_time;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        ZonedDateTime vn = ZonedDateTime.now();
        System.out.println(vn);
        ZonedDateTime tokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(tokyo);

        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println(offsetDateTime);

        LocalTime start = LocalTime.of(23,0);
        LocalTime end = start.plusHours(2);
        Duration duration = Duration.between(start,end);
        System.out.println(duration.toHours());

        String date = "22/01/2026";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate time = LocalDate.parse(date,dateTimeFormatter);
        System.out.println(time);

    }
}
