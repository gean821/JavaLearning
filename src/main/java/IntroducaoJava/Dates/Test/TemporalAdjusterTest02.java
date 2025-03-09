package IntroducaoJava.Dates.Test;
import IntroducaoJava.Gassociacao.dominio.Local;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;
//DADA UMA DETERMINADA DATA RETORNE O PROXIMO DIA UTIL DELA.
public class TemporalAdjusterTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe uma data da semana : ");
        LocalDate data = LocalDate.parse(scanner.nextLine());
        System.out.println("O próximo dia util da semana é : "+ proximoDiaUtil(data));


    }

    public static LocalDate proximoDiaUtil(LocalDate data) {
        if (data.getDayOfWeek() == DayOfWeek.FRIDAY) {
            data = data.plusDays(3);
        }else if (data.getDayOfWeek() == DayOfWeek.SATURDAY) {
            data = data.plusDays(2);
        }else if (data.getDayOfWeek() == DayOfWeek.SUNDAY) {
            data = data.plusDays(1);
        }else {
            data = data.plusDays(1);
        }
        return data;
    }
}