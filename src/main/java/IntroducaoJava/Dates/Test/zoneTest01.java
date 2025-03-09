package IntroducaoJava.Dates.Test;

import IntroducaoJava.Gassociacao.dominio.Local;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

//zonas tem a ver com fusos horários.. no mundo todo, serve para ajustar
public class zoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS; //todas zonas que java oferece suporte.
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault()); //pega a zona do Brasil que o java oferece suporte

        ZoneId tokyozone = ZoneId.of("Asia/Tokyo");   //peguei essa info com base nas zonas que vi que possuem pelo shortIdS
        System.out.println(tokyozone);
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime zonedDateTime = now.atZone(tokyozone); //crio um zoned date time para demonstrar que quero mudar meu horário para a zona de tokyo, ou seja faz +9hrs
        System.out.println(zonedDateTime);
        Instant nowInstant = Instant.now();
        ZonedDateTime instantZoned = nowInstant.atZone(tokyozone);
        System.out.println(instantZoned); //ele vai fazer aplicado já o horario, ou seja, o dia muda se o horario passar de 24 hrs

        //digamos que quero pegar Manaus e nao sei que zona ela está, porem sei q o horario é -4.
        //para quando sabemos o horario mas nao sabemos a zona :
        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);
        ZoneOffset Manaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(Manaus);
        System.out.println(offsetDateTime);
        System.out.println( JapaneseDate.from(LocalDate.now()));
        LocalDate neijiEra = LocalDate.of(1900, 2, 1);
        System.out.println(JapaneseDate.from(neijiEra));

    }
}




























