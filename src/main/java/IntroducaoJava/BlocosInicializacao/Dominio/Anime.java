package IntroducaoJava.BlocosInicializacao.Dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    {//1. alocado espaco em memoria do objeto
        // cada atributo de classe criado e inicializado com valores default ou o que for passado.
        //bloco de inicialização é executado
        //dps o construtor é executado.
        System.out.println("dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
            System.out.println("Episodios :" + "" + episodios[i]);
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }
    public Anime() {

    }
    public void setNome(String nome ) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
    public int[] getEpisodios() {
        return this.episodios;
    }

}





