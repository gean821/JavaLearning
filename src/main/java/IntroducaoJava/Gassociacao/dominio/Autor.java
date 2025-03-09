package IntroducaoJava.Gassociacao.dominio;

public class Autor {
    private String nome;
    private Livro [] livros ;

    public Autor (String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("Nome : "+this.nome);
        if (livros != null) {
            for (Livro livros : livros) {
                System.out.println("Livro : " +livros.getNome());
            }
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public void setLivros( Livro [] livros) {
        this.livros = livros;
    }
    public Livro [] getLivros() {
        return this.livros;
    }



}
