package IntroducaoJava.Gassociacao.dominio;

public class Estudante {
    private String nome;
    private int idade;
    private Seminario seminario;

    public void imprime() {
        System.out.println("Nome : "+this.nome+ " Idade : "+this.idade );

    }

    public Estudante(String nome, int idade) {
        this.idade = idade;
        this.nome = nome;
    }
    public void setNome(String nome) {
        this.nome = nome;

    }
    public String getNome() {
        return this.nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public Seminario getSeminario() {
        return this.seminario;
    }

}