package IntroducaoJava.Gassociacao.dominio;

public class Aprofessor {
    private String nome;
    private String especialidade;
    private Seminario  seminario;

    public Aprofessor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }
    public void imprime() {
        System.out.println(this.nome + " especialidade : "+this.especialidade);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
