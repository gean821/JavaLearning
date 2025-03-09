package IntroducaoJava.sobreCargaMetodos.Dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodio;
    private String genero;


    public void inicializa(String nome, String tipo, int episodio) { //aqui estou criando um método só para colocar as info de uma vez
        this.nome = nome;
        this.tipo = tipo;
        this.episodio = episodio;


    }
    public void inicializa(String nome, String tipo, int episodio,String genero) { //é criado outro método com o mesmo nome, porém tem um valor a mais sendo passado no parametro("genero"), isto é sobrecarga de métodos.
         this.inicializa(nome,tipo,episodio);
        this.genero = genero;

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
        System.out.println("tipo : "+ this.tipo + " \nEpisódio : "+this.episodio+ "\nnome:"+this.nome+ "\ngenero :"+this.genero);

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
