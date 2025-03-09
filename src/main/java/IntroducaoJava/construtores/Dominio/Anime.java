package IntroducaoJava.construtores.Dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodio;
    private String genero;
    private String studio;

    public Anime(String nome, String tipo, int episodio,String genero) {
        this(); //esse this chama o construtor vazio, ou seja começa pelo construtor public anime();
        System.out.println("dentro do construtor com argumentos");       //esse é um construtor,ou seja, isso obriga o que precisa ter na classe.
        this.nome = nome;
        this.tipo = tipo;
        this.episodio = episodio;
        this.genero = genero;

    }
    public Anime(String nome, String tipo, int episodio,String genero, String studio) {
        this(nome,tipo,episodio,genero);
        this.studio = studio;

    }
    public Anime() {
        System.out.println("dentro do sem argumentos.");
    }



    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getGenero() {
        return this.genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void imprime() {
        System.out.println("nome : "+ this.nome + " \nEpisódio : "+this.episodio+ "\ntipo:"+this.tipo+ "\ngenero :"+this.genero+ "\n"+this.studio);

    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }
    public String getTipo() {
        return this.tipo;
    }
    public int getEpisodio() {
        return this.episodio;
    }


}
