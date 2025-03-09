package IntroducaoJava.Polimorfismo.Dominio;

public class Credito implements Pagamento {
    private final double TAXA = 0.05;


    @Override
    public double calcularPagamento(double total) {
        return 0 ;
    }
}
