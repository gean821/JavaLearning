package IntroducaoJava.Dates.Test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime data1 = LocalDateTime.of(2005, Month.JANUARY, 19, 20, 45);
        LocalDateTime data2 = LocalDateTime.of(2025, 1, 2, 14, 49);
        Duration duracao = Duration.between(data1, data2);
        System.out.println(duracao);
    //aqui usa a duration por prefixo de pt(periodo de tempo), xxxH(quantidade de horas) e xxxM(minutos);
        System.out.println(Duration.ofDays(20)); //retorna em horas.
        System.out.println(Duration.ofMinutes(980));
        System.out.println(Duration.ofSeconds(24440));



    }
}
