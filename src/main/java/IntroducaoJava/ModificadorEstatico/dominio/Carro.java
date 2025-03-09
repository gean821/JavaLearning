package IntroducaoJava.ModificadorEstatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;
//basicamente colocando static agora pertence a todos os objetos.
    public Carro(String nome,double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime() {
        System.out.println(" --------------- ");
        System.out.println("nome : " +this.nome);
        System.out.println("Velocidade Max : " +this.velocidadeMaxima);
        System.out.println("velocidade Limite : "+ Carro.velocidadeLimite);


    }
    public static void setVelocidadeLimite(double velocidadeLimite) {
       //nao se usa this em metodo static this.velocidadeLimite = velocidadeLimite;
        Carro.velocidadeLimite = velocidadeLimite; // se usa o nome da classe

    }
    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }
    public void SetNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public double getVelocidadeMaxima() {
        return this.velocidadeMaxima;
    }


}
