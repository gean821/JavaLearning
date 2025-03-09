package IntroducaoJava.sobreCargaMetodos.test;
import IntroducaoJava.sobreCargaMetodos.Dominio.Anime;
import java.util.Scanner;
public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();;
        anime.inicializa("Naruto", "manga", 22,"ação"); //entao aqui eu usei a sobrecarga e apenas coloquei o genero
        anime.imprime(); //entao basicamente fazendo o inicializa eu ja coloco todas info em um só método.

    }

}

