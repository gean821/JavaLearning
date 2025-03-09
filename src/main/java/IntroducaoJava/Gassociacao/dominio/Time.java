package IntroducaoJava.Gassociacao.dominio;

public class Time {
    private String nome;
    private Jogador [] jogadores;


    public Time (String nome ) {
        this.nome = nome;
    }
    public Time(String nome,Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;

    }
    public void imprime() {
        System.out.println("Time : "+this.nome);
        if (jogadores != null) {
            for (Jogador jogadores : jogadores) {
                System.out.println(jogadores);
                System.out.println(jogadores.getNome());
            }
        }
    }
    public void setJogadores(Jogador [] jogadores) {
        this.jogadores = jogadores;
    }
    public Jogador[] getJogadores() {
        return this.jogadores;
    }


        public void setTime(String nome) {
        this.nome = nome;

    }
    public String getNome() {
        return this.nome;
    }

}
