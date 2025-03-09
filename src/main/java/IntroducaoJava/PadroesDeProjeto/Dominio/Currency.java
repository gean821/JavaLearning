package IntroducaoJava.PadroesDeProjeto.Dominio;
//Esta interface define um contrato para todas as moedas.

public interface Currency {
    String getSymbol(); //Método que retorna o símbolo da moeda (ex: "R$", "$")
}       //Todas as classes que representam moedas devem implementar essa interface e fornecer a implementação do método getSymbol().


class Real implements Currency {
    @Override
    public String getSymbol() {
        return "R$";
    }
    //Se precisarmos adicionar novas moedas no futuro (ex: Euro, Libra),
    // basta criar uma nova classe implementando Currency, sem modificar o código existente.
}

    class UsDolar implements  Currency {
        @Override
        public String getSymbol() {
            return "$";
        }
    }


