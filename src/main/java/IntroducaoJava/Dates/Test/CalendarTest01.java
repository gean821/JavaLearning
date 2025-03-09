package IntroducaoJava.Dates.Test;

import java.util.Calendar;
import java.util.Date;

//classe abstrata, nao pode ser criada, apenas subclasses
//segunda classe para consertar date. mas é legado tb
public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        if (calendar.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingo é o primeiro dia da semana");
        }
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        calendar.add(Calendar.DAY_OF_MONTH,2);//adiciona 2 dias no mes
        calendar.add(Calendar.HOUR,12); //AUMENTA 2 HORAS
        calendar.roll(Calendar.HOUR, 12);
        Date date = calendar.getTime();
        System.out.println(date);
    }
}
