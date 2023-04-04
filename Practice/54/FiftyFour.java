import java.time.LocalDate;
public class FiftyFour{
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        LocalDate day_before_yesterday=date.minusDays(2);
        LocalDate day_after_tomorrow=date.plusDays(2);
        System.out.print("Todaydate: "+date);
        System.out.println("Day Before Yesturday Date"+ day_before_yesterday);
        System.out.println("Day after Tomorrow Date"+day_after_tomorrow);
        System.out.println(date.getYear());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.isLeapYear());
    }
}