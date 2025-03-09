package IntroducaoJava.Dates.Test;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
//utilizado para aplicações que precisam de datas extremamente especificas e neutras para todo mundo.
//trabalha com NANOSEGUNDOS.
public class InstantTest01 {
    public static void main(String[] args) {
        Instant agora = Instant.now();
        System.out.println(agora);         //fazendo a comparacao com localdateTime podemos ver o Z que representa o zulu time(horario neutro do mundo).
        System.out.println(LocalDateTime.now());
        System.out.println(agora.getEpochSecond());
        System.out.println(agora.getNano());
        System.out.println(Instant.ofEpochSecond(3,1));
        System.out.println(Instant.ofEpochSecond(3,-1_00_00));
    }
}


