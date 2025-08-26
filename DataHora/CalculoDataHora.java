package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class CalculoDataHora {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2025-08-26");
        LocalDateTime d05 = LocalDateTime.parse("2025-08-26T15:38:45");
        Instant d06 = Instant.parse("2025-08-26T01:30:45Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
    }
}
