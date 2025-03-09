package IntroducaoJava.Enumeracao.Test;
import IntroducaoJava.Enumeracao.Dominio.Cliente;
import IntroducaoJava.Enumeracao.Dominio.TipoCliente;
import IntroducaoJava.Enumeracao.Dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        //Cliente cliente1 = new Cliente("Adelbrando", "PESSOA_FISICA");
        //Cliente cliente2 = new Cliente("Carlos", "PESSOA_JURIDICA");        //dessa forma seria sem a enumeração ..
        //Cliente cliente3 = new Cliente("Tsubasa", "pessoa juridica");
        //Cliente cliente4 = new Cliente("jonathan", "pessoa fisica");

        Cliente cliente1 = new Cliente("Adelbrando", TipoCliente.PESSOA_FISICA, TipoPagamento.Debito);
        Cliente cliente2 = new Cliente("Carlos",TipoCliente.PESSOA_JURIDICA,TipoPagamento.Credito);
        ;        //aqui seria com a enumeração, chamando a classe e a enumeração correta

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.Debito.calcularDesconto(50));
        System.out.println(TipoPagamento.Credito.calcularDesconto(50));






    }
}
