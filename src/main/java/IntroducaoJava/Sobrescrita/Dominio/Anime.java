package IntroducaoJava.Sobrescrita.Dominio;

public class Anime {
    private String nome;
    private int episodios;

    @Override
    public String toString() { //AQUI nos fazemos com que dê para dar sout no anime e pegar as infos sem pegar a memória
        return "anime : " + this.nome + "\nEpisodios : " +this.episodios;

    }
    public Anime(String nome,int episodios) {
        this.nome = nome;
        this.episodios = episodios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}
