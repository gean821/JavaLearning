package IntroducaoJava.Formatacao.Test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocalTest01 {
    public static void main(String[] args) {
        //PT-BR

        Locale localeItaly = new Locale("It","IT");
        Locale localeCh = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja","JA");
        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL,localeCh);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL,localeItaly);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL,localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL,localeJapao);
        System.out.println("itália : " +df1.format(calendar.getTime()));
        System.out.println("Suica : "+df2.format(calendar.getTime()));
        System.out.println("India : "+df3.format(calendar.getTime()));
        System.out.println("Japao : "+df4.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry());
        System.out.println(localeJapao.getDisplayCountry());
        System.out.println(localeIndia.getDisplayCountry());
        System.out.println(localeCh.getDisplayCountry());

    }
}
