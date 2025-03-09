package IntroducaoJava.Polimorfismo.Test;
import IntroducaoJava.Polimorfismo.Dominio.Computador;
import IntroducaoJava.Polimorfismo.Dominio.Televisao;
import IntroducaoJava.Polimorfismo.Dominio.Tomate;
import IntroducaoJava.Polimorfismo.Servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Tomate tomate = new Tomate("tradicional",10);
        Computador computador = new Computador("Lenovo", 2500);
        Televisao televisao = new Televisao("Smart", 4000);
        CalculadoraImposto.calcularImposto(computador); //reduzindo código para evitar ser especifico como no exemplo abaixo
        System.out.println("---------------");
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(televisao);
                            //esse aqui sria usado para o primeiro exemplo de calcular imposto
                                    //CalculadoraImposto.calcularImpostoTomate(tomate);
                                    //CalculadoraImposto.calcularImpostoComputador(computador);




    }
}
