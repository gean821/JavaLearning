package IntroducaoJava.Dates.Test;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
//FACILITA PARA PEGAR AS DATAS especificas.
public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(2005,1,19,20,40);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(aniversario,now));
        System.out.println(ChronoUnit.WEEKS.between(aniversario,now));
        System.out.println(ChronoUnit.MONTHS.between(aniversario,now));
        System.out.println(ChronoUnit.YEARS.between(aniversario,now));

    }
}
