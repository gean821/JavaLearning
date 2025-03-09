package IntroducaoJava.ClassesAbstratas.Dominio;

public abstract class Funcionario extends Pessoa { //classe abstrata é uma classe que foi criada para ser extendida, para ser uma SUPERCLASSE
   protected String nome;
   protected double salario;

    public Funcionario (String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }
    public abstract void  calculaBonus () ; //o que nos queremos é forçar todas subclasses a prover esse método e chamar ele fazendo a atleracao certa para cada sbuclasse
        //ou seja, este método é obrigatório colocar em toda subclasse criada.
    public void setNome(String nome) {
        this. nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    @Override
    public void imprime() {
        System.out.println("imprimindo..."); //aqui eu colocando o método abstrato faz com que as outras classes nao precisem.
    }           //apenas funciona quando há mais de um abstract extend
}
