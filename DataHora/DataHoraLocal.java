package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DataHoraLocal {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2025-08-26");
        LocalDateTime d05 = LocalDateTime.parse("2025-08-26T15:38:45");
        Instant d06 = Instant.parse("2025-08-26T15:38:45Z");

        for (String s : ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }

    }
}
