package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {

    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2025-08-26");
        LocalDateTime d05 = LocalDateTime.parse("2025-08-26T15:38:45");
        Instant d06 = Instant.parse("2025-08-26T15:38:45Z");
        Instant d07 = Instant.parse("2025-08-26T15:38:45-03:00");

        LocalDate d08 = LocalDate.parse("26/08/2005", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("26/08/2005 15:38", fmt2);

        LocalDate d10 = LocalDate.of(2005, 8, 26);
        LocalDateTime d11 = LocalDateTime.of(2005, 8, 26, 16, 1, 44);

        System.out.println("d01 =  " + d01.toString());
        System.out.println("d02 =  " + d02.toString());
        System.out.println("d03 = " + d03.toString());
        System.out.println("d04 = " + d04.toString());
        System.out.println("d05 = " + d05.toString());
        System.out.println("d06 = " + d06.toString());
        System.out.println("d07 = " + d07.toString());
        System.out.println("d08 = " + d08.toString());
        System.out.println("d09 = " + d09.toString());
        System.out.println("d10 = " + d10.toString());
        System.out.println("d11 = " + d11.toString());
    }
}
