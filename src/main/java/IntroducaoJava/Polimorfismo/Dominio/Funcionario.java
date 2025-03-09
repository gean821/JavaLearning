package IntroducaoJava.Polimorfismo.Dominio;

public abstract class Funcionario {
    private String nome;
    private final double salarioBase;

    public Funcionario(String nome,double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario() ; //colocando abstrato eu forco todas as classes a usar este método

    public String getNome() {
        return this.nome;
    }
    public double getSalarioBase() {
        return this.salarioBase;
    }

}
