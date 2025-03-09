package IntroducaoJava.Polimorfismo.Dominio;

public class Estagiario extends Funcionario{
    public Estagiario(String nome,double salarioBase) {
        super(nome,salarioBase);
    }

    @Override
    public double calcularSalario() {
        return this.getSalarioBase();

    }








}
