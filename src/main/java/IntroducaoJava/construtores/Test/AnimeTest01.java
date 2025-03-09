package IntroducaoJava.construtores.Test;
import IntroducaoJava.construtores.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto","manga",14, "ação", "EA");
        anime.imprime();
        //anime2.setNome("José"); //como o construtor nao tem parametros, eu tive que settar e imprimir
        //anime2.setTipo("mangá");
        //anime2.imprime();

    }
}
