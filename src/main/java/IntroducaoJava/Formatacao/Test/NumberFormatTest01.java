package IntroducaoJava.Formatacao.Test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        //como é uma classe abstrata nao se cria objeto e pegamos com get.
        Locale locale = Locale.getDefault();
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeItaly = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance(locale);
        nfa[1] = NumberFormat.getInstance(localePT);
        nfa[2] = NumberFormat.getInstance(Locale.JAPAN);
        nfa[3] = NumberFormat.getInstance(Locale.ITALY);
        double valor = 100_000_000.2130;
        for (NumberFormat numberFormat : nfa) {
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
        }


    }


}

