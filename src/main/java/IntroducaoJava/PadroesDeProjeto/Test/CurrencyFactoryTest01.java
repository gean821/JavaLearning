package IntroducaoJava.PadroesDeProjeto.Test;

import IntroducaoJava.PadroesDeProjeto.Dominio.Country;
import IntroducaoJava.PadroesDeProjeto.Dominio.Currency;
import IntroducaoJava.PadroesDeProjeto.Dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}


//✔️ Explicação:
//Pedimos para a CurrencyFactory
// criar uma moeda para BRAZIL.
//O método newCurrency() retorna um objeto do tipo Real.
//Chamamos getSymbol(), que retorna "R$".