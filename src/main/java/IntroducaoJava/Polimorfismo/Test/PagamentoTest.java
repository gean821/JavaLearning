package IntroducaoJava.Polimorfismo.Test;
import IntroducaoJava.Polimorfismo.Dominio.*;

public class PagamentoTest {
    public static void main(String[] args) {
        Pagamento pagamento = new PIX();
        Pagamento pagamento2 = new Credito();
        Pagamento pagamento3 = new Dinheiro();
        Produto2 produto = new Produto2("pasta de dente", 10);

        System.out.println();


    }
}
