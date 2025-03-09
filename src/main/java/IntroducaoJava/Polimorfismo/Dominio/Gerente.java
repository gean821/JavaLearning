package IntroducaoJava.Polimorfismo.Dominio;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {
        super(nome,salarioBase);
    }

    @Override
    public double calcularSalario() {
        double BONUS = 0.4;
        return this.getSalarioBase() + (this.getSalarioBase() * BONUS);
    }
}




