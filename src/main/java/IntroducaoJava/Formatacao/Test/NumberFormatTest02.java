package IntroducaoJava.Formatacao.Test;

import java.text.NumberFormat;
import java.util.Locale;

//agora LIDANDO COM MOEDAS,FORMATACAO DE MOEDAS DE PAISES DIVERSOS.

public class NumberFormatTest02 {
        public static void main(String[] args) {
            //como é uma classe abstrata nao se cria objeto e pegamos com get.
            Locale locale = Locale.getDefault();
            Locale localePT = new Locale("pt", "BR");
            Locale localeJP = Locale.JAPAN;
            Locale localeItaly = Locale.ITALY;
            NumberFormat[] nfa = new NumberFormat[4];
            nfa[0] = NumberFormat.getCurrencyInstance(locale);
            nfa[1] = NumberFormat.getCurrencyInstance(localePT);
            nfa[2] = NumberFormat.getCurrencyInstance(Locale.JAPAN);
            nfa[3] = NumberFormat.getCurrencyInstance(Locale.ITALY);
            double valor = 100_000_000.2130;
            for (NumberFormat numberFormat : nfa) {
                System.out.println(numberFormat.format(valor));
            }


        }

    }



