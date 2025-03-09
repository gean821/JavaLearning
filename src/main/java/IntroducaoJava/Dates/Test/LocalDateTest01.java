package IntroducaoJava.Dates.Test;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;
//UTIL USADA ATUALMENTE.
public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date()); //date e calendar antigas
        System.out.println(Calendar.getInstance());//antiga
        LocalDate date = LocalDate.of(2025, Month.FEBRUARY,2);
        LocalDate dataAgora = LocalDate.now(); //outra forma de colocar a data de hoje.
        System.out.println(dataAgora);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear()); //saber se o ano é bissexto ou não.
        System.out.println(date.get(ChronoField.YEAR));
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
        System.out.println(date);



    }
}
