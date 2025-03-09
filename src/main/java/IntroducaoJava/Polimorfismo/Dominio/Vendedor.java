package IntroducaoJava.Polimorfismo.Dominio;

public class Vendedor extends Funcionario {
    private final int totalVendas;


    public Vendedor(String nome, double salarioBase, int totalVendas) {
        super(nome, salarioBase);
        this.totalVendas = totalVendas;
    }


    @Override
    public double calcularSalario() {
        double COMISSAO = 0.2;

        if (totalVendas < 10) {
            return getSalarioBase();
        } else
            return (getSalarioBase() + getSalarioBase() * COMISSAO);
    }

    public int getTotalVendas() {
        return this.totalVendas;
    }
}



