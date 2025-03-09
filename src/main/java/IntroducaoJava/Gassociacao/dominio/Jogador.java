package IntroducaoJava.Gassociacao.dominio;
public class Jogador {
    private String nome;
    private Time time;


    public Jogador(String nome) {
        this.nome = nome;
    }
    public void imprime() {
        System.out.println("nome : " +this.nome);
        if (time != null) {
            System.out.println("time : " +time.getNome()); //aqui, como time é um objeto nós temos que pegar o nome dentro do objeto com o Get
        }else
            System.out.println("JOGADOR SEM TIME");
    }

    public void setTime(Time  time) {
        this.time = time;
    }
    public Time getTime() {
        return this.time;
    }

    public void setNome(String nome ) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }


}
