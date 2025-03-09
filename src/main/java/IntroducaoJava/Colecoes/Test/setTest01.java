package IntroducaoJava.Colecoes.Test;
import IntroducaoJava.Colecoes.Dominio.Manga;

import java.util.*;



public class setTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>(); //permite apenas elementos unicos que serão organizados pelo hash. Se eu quiser eles ordenados eu uso o LinkedHashSet
        mangas.add(new Manga(5L, "pokemon", 25.30, 0));
        mangas.add(new Manga(3L, "berserk", 9.90, 5));
        mangas.add(new Manga(4L, "naruto", 18.30, 0));
        mangas.add(new Manga(2L, "dragonball", 9.90, 2));
        mangas.add(new Manga(1L, "attack on titan", 30.30, 0));
       for (Manga manga : mangas) {
           System.out.println(manga);
       }



    }
}

