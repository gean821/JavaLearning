package IntroducaoJava.Gassociacao.Test;
import IntroducaoJava.Gassociacao.dominio.Jogador;
import IntroducaoJava.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador ("Cafú");
        Jogador jogador2 = new Jogador ("Marcelo");
        Time time = new Time("Brasil");
        jogador1.setTime(time);       //aqui eu setei o time para o jogador. associei
        jogador2.setTime(time);
       Jogador [] jogadores = {jogador1,jogador2};
        time.setJogadores(jogadores);                     //aqui eu associei o array de jogadores para o time.
        System.out.println("----jogador---");
        jogador1.imprime();
        System.out.println("Time : ");
        time.imprime();




    }
}
