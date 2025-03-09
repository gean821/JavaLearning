package IntroducaoJava.Colecoes.Test;

import IntroducaoJava.Colecoes.Dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        //adicionando itens de uma classe.
        mangas.add(new Manga(5L,"pokemon",25.30));
        mangas.add(new Manga(3L,"berserk",9.90));
        mangas.add(new Manga(4L,"naruto",18.30));
        mangas.add(new Manga(2L,"dragonball",9.90));
        mangas.add(new Manga(1L,"attack on titan",30.30));
        Collections.sort(mangas); //ordenando primeiro.
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(2L,"dragonball",9.90); //preciso criar o objeto que quero buscar(já presente na lista).
        System.out.println(Collections.binarySearch(mangas,mangaToSearch));


    }


}
