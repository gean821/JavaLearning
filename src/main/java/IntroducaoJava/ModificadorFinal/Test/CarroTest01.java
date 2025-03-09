package IntroducaoJava.ModificadorFinal.Test;
import IntroducaoJava.ModificadorFinal.Dominio.Carro;
import IntroducaoJava.ModificadorFinal.Dominio.Comprador;
import IntroducaoJava.ModificadorFinal.Dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro("Ferrari 458");
        // carro.VELOCIDADE_LIMITE = 100; //se eu mudar o valor tem um erro e nao se altera constante.

        System.out.println(carro.COMPRADOR); //aqui fica nulo
        carro.COMPRADOR.setNome("Alberto");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari("458");
        ferrari.imprime();





    }
}
