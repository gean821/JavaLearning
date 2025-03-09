package IntroducaoJava.Dates.Test;

import IntroducaoJava.Gassociacao.dominio.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
//Ela so aceita LOCALDATE
//vai trabalhar com ANOS, MESES, DIAS.
public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate nascimento = LocalDate.of(2005, 1, 19);
        LocalDate hoje = LocalDate.of(2025, 2, 1);
        Period periodo1 = Period.between(nascimento,hoje);
        System.out.println("Quantos anos, meses e dias eu tenho de vida  : " + periodo1);

        System.out.println(Period.of(10,4,3));
        System.out.println(Period.ofWeeks(24));
        System.out.println(Period.ofDays(450));
        System.out.println(Period.ofYears(4));
    }
}
