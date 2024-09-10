package secao11.main;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class CalculosComDataHora {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2024-09-08");
        LocalDateTime d05 = LocalDateTime.parse("2024-09-08T01:30:26");
        Instant d06 = Instant.parse("2023-09-08T01:30:26Z");

        LocalDate pastWeek = d04.minusDays(7);
        LocalDate nextWeek = d04.plusDays(7);
        LocalDate nextYears = d04.plusYears(9);

        System.out.println(pastWeek);
        System.out.println(nextWeek);
        System.out.println(nextYears);
        System.out.println();

        LocalDateTime pastWeekDateTime = d05.minusDays(7);
        LocalDateTime nextWeekDateTime = d05.plusDays(7);
        LocalDateTime nextYearsDateTime = d05.plusYears(9);

        System.out.println(pastWeekDateTime);
        System.out.println(nextWeekDateTime);
        System.out.println(nextYearsDateTime);
        System.out.println();

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
       // Instant nextYearsInstant = d06.plus(9, ChronoUnit.YEARS);

        System.out.println(pastWeekInstant);
        System.out.println(nextWeekInstant);
       // System.out.println(nextYearsInstant);
        System.out.println();

        Duration t1 = Duration.between(pastWeek.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekDateTime, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);
        Duration t4 = Duration.between(d06, pastWeekInstant);

        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println(t3.toDays());
        System.out.println(t4.toDays());
    }
}
