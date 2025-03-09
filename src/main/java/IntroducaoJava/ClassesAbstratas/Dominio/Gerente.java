package IntroducaoJava.ClassesAbstratas.Dominio;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);

    }
    @Override
    public String toString() {
        return "Gerente : "+nome + ",Salario=" +salario;
    }

    @Override
    public void calculaBonus() {
        this.salario = salario + salario *0.2;
    }
}
