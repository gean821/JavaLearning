package IntroducaoJava.Heranca.Dominio;
//nao existe herenca dupla ou mais. ou seja extendes,pessoa,classe..
public class Funcionario extends Pessoa { ;//aqui eu digo que o funcionario é uma pessoa com uma função a mais no caso o salario
    private double salario;
//entao tudo da classe pessoa se extende para cá e leva os atributos.
//se usa em dois casos : polimorfismo e quando se quer extender atributos de uma classe para outra
    static {
        System.out.println("dentro do bloco estatico de funcionario");
    }
    {
        System.out.println("bloco de inicializacao nao estático de funcionario");
    }

    {
        System.out.println("bloco de inicializacao nao estático de func");
    }
    public Funcionario(String nome) {
       super(nome); // pra criar construtor em herança eu tenho que lembrar que a classe pessoa ja chama eles em um construtor, então uso super para isso aqui
        System.out.println("dentro do construtor de func");
    } //importa da classe pessoa


    public void imprime() { //ele sobrescreve o imprime da pessoa e agr pega esse imprime.
        super.imprime(); //esse super pega e adiciona o imprime da pessao com esse especifico de funcionario
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        //System.out.println("Eu "+this.getNome()+ "recebi o salario de "+this.salario); //assim faria caso estivesse private na pessoa; agr que está protected eu faço assim :
        System.out.println("Eu : "+this.nome);
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
