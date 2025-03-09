package IntroducaoJava.Colecoes.Test;

import IntroducaoJava.Colecoes.Dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());

    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L,"pokemon",25.30));
        mangas.add(new Manga(3L,"berserk",9.90));
        mangas.add(new Manga(4L,"naruto",18.30));
        mangas.add(new Manga(2L,"dragonball",9.90));
        mangas.add(new Manga(1L,"attack on titan",30.30));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("\n----Ordenado via comparable-----");
        Collections.sort(mangas );
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("\nOrdenado via Comparator ");
        //Collections.sort(mangas,new MangaByIdComparator()); //aqui eu faço uso do comparator e crio ele aqui para apenas fazer a comparação de Id
        mangas.sort(new MangaByIdComparator()); //forma mais fácil.
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
