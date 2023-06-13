import java.time.LocalDate;
import java.time.LocalDateTime;

public class FiftyFour {
    public static void main(String[] args) {
        // LocalDate date=LocalDate.now();
        // LocalDate day_before_yesterday=date.minusDays(2);
        // LocalDate day_after_tomorrow=date.plusDays(2);
        // System.out.print("Todaydate: "+date);
        // System.out.println("Day Before Yesturday Date"+ day_before_yesterday);
        // System.out.println("Day after Tomorrow Date"+day_after_tomorrow);
        // System.out.println(date.getYear());
        // System.out.println(date.getDayOfMonth());
        // System.out.println(date.getDayOfWeek());
        // System.out.println(date.getDayOfYear());
        // System.out.println(date.getMonth());
        // System.out.println(date.getMonthValue());
        // System.out.println(date.isLeapYear());

        // LocalDate d1 = LocalDate.now();
        // LocalDate d2 = LocalDate.ofEpochDay(10000); // Line 2
        // if (d1.isBefore(d2)) {
        //     System.out.println("Hello");
        // } else if (d1.isAfter(d2)) {
        //     System.out.println("Bye");
        // } else {
        //     System.out.println("Not Reachable");
        // }

        LocalDateTime ldt = LocalDateTime.of(2020, 8, 31, 13, 1);
        System.out.println(LocalDate.ofEpochDay(10000));
        System.out.println(ldt.withYear(2004));

        // LocalDate d = LocalDate.parse("2020-10-31");

        // d = d.withMonth(2).minusDays(1);

        // System.out.println("Date: " + d);
    }
}