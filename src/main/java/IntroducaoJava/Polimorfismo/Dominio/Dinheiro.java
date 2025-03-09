package IntroducaoJava.Polimorfismo.Dominio;

public class Dinheiro implements Pagamento{
    private final double DESCONTO = 0.01;
    @Override
    public double calcularPagamento(double total) {
        return 0;

    }
}
