package IntroducaoJava.Colecoes.Dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga> { //como vamos fzr comparação precisamos implementar da interface comparable
    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Manga(Long id, String nome, double preco) {
       Objects.requireNonNull(nome,"nome nao pode ser nulo"); //faz com que ao criar o objeto manga ele obrigue a nao ter um nulo nesses itens.
       Objects.requireNonNull(id,"Id nao pode ser nulo."); //id nao nulo.
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Manga(Long id, String nome, double preco, int quantidade) {
       this(id,nome,preco);
       this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Double.compare(preco, manga.preco) == 0 && quantidade == manga.quantidade && Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Manga outroManga) { //escolhi comparar o Id nessa logica de negocio, e separa por Id em ordem.
        //negativo se o this<outroManga
        //se this == outroManga, return 0
        //positivo se this >outroManga
       return this.nome.compareTo(outroManga.getNome()); //por causa do Wrapper eu posso, agora se for por tipo primitivo.
    }
}

