package IntroducaoJava.Polimorfismo.Test;

import IntroducaoJava.Polimorfismo.Dominio.Computador;
import IntroducaoJava.Polimorfismo.Dominio.Produto;
import IntroducaoJava.Polimorfismo.Dominio.Tomate;
import IntroducaoJava.Polimorfismo.Servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Mac", 4000);
        Tomate tomate = new Tomate("tradicional", 10);
        tomate.setDataValidade("30/03/2025");
        CalculadoraImposto.calcularImposto(tomate); //usando instaceOf PORQUE A classe tomate tinha um método especifico só dela.
        System.out.println("-------------");
        CalculadoraImposto.calcularImposto(produto1); //COM POLIMORFISMO

    }
}
