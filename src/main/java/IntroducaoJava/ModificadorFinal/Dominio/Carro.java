package IntroducaoJava.ModificadorFinal.Dominio;

public class Carro { //colocamos final para quando nao queremos extender a classe
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250; //usamos constate com final e static, e para o nome usamos maiusculo separado por underline
    public final Comprador COMPRADOR = new Comprador();      //aqui dizemos que o comprador desse objeto NUNCA será alterado                                            comprador;//precisa ser iniciaizada com um valor.




    public Carro(String nome){
        this.nome = nome;
    }
    public final void imprime() { //quando se coloca modificador final em um método, signifcia q ele n pode ser sobrescrito por uma subclasse.
        System.out.println(this.nome);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
