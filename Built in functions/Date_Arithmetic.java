import java.time.LocalDate;
import java.util.*;

public class Date_Arithmetic {
    public static void main(String args[]) {
        int year=2023;
        int month=6;
        int dd=19;
        LocalDate date=LocalDate.of(year,month,dd);
        LocalDate newDate=date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("Original date "+date);
        System.out.println("New Date "+newDate);

    }
}
