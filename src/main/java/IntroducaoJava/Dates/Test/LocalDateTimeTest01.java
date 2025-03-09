package IntroducaoJava.Dates.Test;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

//entao ela é a junção de local e time.
public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime local = LocalDateTime.now();
        LocalDate localDate = LocalDate.of(2022, Month.FEBRUARY, 19);
        LocalTime localTime = LocalTime.of(21,45, 0);
        LocalDate data = LocalDate.parse("2025-01-02"); //posso fazer um parse também e transformar para string
        LocalTime time = LocalTime.parse("14:45:00"); //posso fazer um parse também e transformar para string
        LocalDateTime ldt1 = data.atTime(time);//tem o dia e adiciona a hora
        LocalDateTime ldt2 = time.atDate(data); //tem a hora e adiciona o dia
        System.out.println(ldt1);
        System.out.println(ldt2);
        System.out.println(local);
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(data);
        System.out.println(time);


    }
}
