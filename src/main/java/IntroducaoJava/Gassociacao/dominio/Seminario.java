package IntroducaoJava.Gassociacao.dominio;

public class Seminario {
    private String titulo;
    private Estudante estudante;
    private Local local;

    public Seminario (String titulo) {
        this.titulo = titulo;

    }

    public void imprime() {
        System.out.println("Titulo : "+this.titulo);
        if (local == null) {
            System.out.println("Não há endereco para o seminário.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
