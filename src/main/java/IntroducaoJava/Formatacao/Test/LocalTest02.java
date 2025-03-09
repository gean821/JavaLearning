package IntroducaoJava.Formatacao.Test;

import java.util.Locale;

public class LocalTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault()); //para ver qual linguagem está configurado meu pc
        String [] isoCountries = Locale.getISOCountries();
        String [] isoLanguages = Locale.getISOLanguages();
        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry + " ");
            System.out.println(isoCountry);
        }
        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage + " ");
            System.out.println(isoLanguage);

        }

//para ver quantos paises e linguas são suportadas.




        }

    }

