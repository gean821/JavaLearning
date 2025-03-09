package IntroducaoJava.Gassociacao.Test;
import IntroducaoJava.Gassociacao.dominio.Jogador;
import IntroducaoJava.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Messi");
        Time time = new Time("Santos");
        jogador1.setTime(time); //aqui nos estamos associando o jogador ao time.
        jogador1.imprime();
    }
}
