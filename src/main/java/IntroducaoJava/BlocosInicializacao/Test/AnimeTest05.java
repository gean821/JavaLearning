package IntroducaoJava.BlocosInicializacao.Test;
import IntroducaoJava.BlocosInicializacao.Dominio.Anime;

public class AnimeTest05 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");
        System.out.println(anime.getEpisodios());
    }
}
