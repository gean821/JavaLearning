package IntroducaoJava.Gassociacao.Test;
import IntroducaoJava.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("pelé");
        Jogador jogador2 = new Jogador("Romario");
        Jogador jogador3 = new Jogador("Cafú");
        Jogador[] jogadores = {jogador1,jogador2,jogador3}; //dessa forma cria um array com objetos
                //apenas esta guardando as posições "pele, romario e cafu";
        for (Jogador Jogador : jogadores) {
            Jogador.imprime();        //usando for each //lembrando que aqui para criar o array eu preciso inicializar ele colocando a ordem j1,j2,3;

        }

    }
}



