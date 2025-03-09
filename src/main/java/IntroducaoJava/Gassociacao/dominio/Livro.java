package IntroducaoJava.Gassociacao.dominio;

public class Livro {
    private String nome;
    private Autor [] autores;

    public Livro(String nome) {
        this.nome = nome;
    }
    public Livro(String nome, Autor [] autores) {
        this.nome = nome;
        this.autores = autores;
    }
    public void imprime() {
        System.out.println("Nome : "+this.nome );
        if ( autores != null) {
            for (Autor autor : autores) {
                System.out.println("AUTOR : " + autor.getNome());
            }
       }else {
            System.out.println("NENHUM ATOR");
        }

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Autor[] getAutores() {
        return autores;
    }

    public void setAutores(Autor[] autores) {
        this.autores = autores;
    }
}
