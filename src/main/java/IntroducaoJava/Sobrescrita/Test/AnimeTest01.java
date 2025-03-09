package IntroducaoJava.Sobrescrita.Test;
import IntroducaoJava.Sobrescrita.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto",250);
        System.out.println(anime); //sempre que imprimo o método ele puxa a memória da classe. Com o too string ele puxa a variavel

    }
}
