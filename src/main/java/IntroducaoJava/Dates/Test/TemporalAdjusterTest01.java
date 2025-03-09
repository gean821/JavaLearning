package IntroducaoJava.Dates.Test;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
//consigo manipular a data.
public class TemporalAdjusterTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.withDayOfMonth(20);
        now = now.with(ChronoField.DAY_OF_MONTH, 20); //posso substituir a data que tava no now;
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        //digamso que eu quero saber quando é a proxima quinta feira(dia);
        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());


    }
}
