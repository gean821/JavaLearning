package IntroducaoJava.Dates.Test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(19,45,49); //se eu quiser colocar uma hora especifica
        LocalTime Agora = LocalTime.now();
        System.out.println(Agora);
        System.out.println(Agora.getSecond());
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time);

    }
}
