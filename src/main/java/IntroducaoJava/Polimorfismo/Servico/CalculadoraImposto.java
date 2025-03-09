package IntroducaoJava.Polimorfismo.Servico;
import IntroducaoJava.Polimorfismo.Dominio.Computador;
import IntroducaoJava.Polimorfismo.Dominio.Produto;
import IntroducaoJava.Polimorfismo.Dominio.Tomate;

public class CalculadoraImposto {
    //public static void calcularImpostoComputador(Computador computador) { //dessa forma seria mais especifico para o produto
        //System.out.println("--------------");
        //System.out.println("Relatório de imposto do computador");
        //System.out.println("Nome : " + computador.getNome() + ",valor = " + computador.getValor() + ",Imposto a ser pago :" + computador.calcularImposto());
    //}

    //public static void calcularImpostoTomate(Tomate tomate) {
        //System.out.println("Relatório de imposto do tomate : ");
        //System.out.println("nome : " + tomate.getNome() + ", valor : " + tomate.getValor() + ", imposto a ser pago = " + tomate.calcularImposto());
    //}
    //transformando estes métodos em estaticos nos nao precisamos criar um objeto do calculaImposto
//como eu passei os objetos por parametro faz com que os atributos de valores sejam passados também : 2500,10 e usados para juntar o calculo do imposto dentro das classes tomate e computador


//FAZENDO GENÉRICO E MENOS CÓDIGO :

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de produto : ");
        double imposto = produto.calcularImposto();
        System.out.println("Nome : "+produto.getNome() + " Valor : "+produto.getValor() + " Imposto a ser pago : "+imposto);
        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println("Data de validade : "+tomate.getDataValidade());
        }
    }

}

//entao o que houve aqui? Basicamente como Tomate tem um método só dele : Datavalidade eu preciso colocar no relatório do produto, porém o produto nao tem este método como obrigatório para outro.
//logo eu preciso criar um objeto Tomate tomate = new Tomate e passar nome e valor, em seguida eu seto a data de validade. E preciso fazer o instaceOf aqui para garantir que o produto é realmente um tomate.