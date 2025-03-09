package IntroducaoJava.Polimorfismo.Test;
import IntroducaoJava.Polimorfismo.Dominio.Computador;
import IntroducaoJava.Polimorfismo.Dominio.Produto;
import IntroducaoJava.Polimorfismo.Dominio.Televisao;
import IntroducaoJava.Polimorfismo.Dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Mac",7000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto()); //quem executa é sempre o objeto (computador)


        System.out.println("------------");
        Produto produto2 = new Tomate("tradicional",10);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
        System.out.println("-----------");

        Produto produto3 = new Televisao("Smart",4000);
        System.out.println(produto3.getNome());
        System.out.println(produto3.getValor());
        System.out.println(produto3.calcularImposto());


    }
}


//entao chamamos pelo produto, mas quem executa é objeto escolhido
//dessa forma faríamos com o uso de polimorfismo,onde o produto é a referencia e o objeto são os produtos dele : comp e tomate