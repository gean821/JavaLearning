package IntroducaoJava.PadroesDeProjeto.Dominio;
//Esta classe implementa o padrão Factory Method.
// Ela recebe um país e retorna a moeda correspondente.


// Método responsável por criar e retornar o objeto correto de acordo com o país
public class CurrencyFactory {
    public static Currency newCurrency(Country country) {
      switch (country) {
          case USA:
              return new UsDolar();
          case BRAZIL :
              return new Real();
          default :
              throw new IllegalArgumentException("No currency found for this country");
      }

    }
}
