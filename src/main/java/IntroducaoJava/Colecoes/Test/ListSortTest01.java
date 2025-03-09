package IntroducaoJava.Colecoes.Test;
import IntroducaoJava.Colecoes.Dominio.Manga;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("pokemon");
        mangas.add("berserk");
        mangas.add("naruto");
        mangas.add("dragonball");
        mangas.add("attack on titan");
        Collections.sort(mangas); //organiza a lista em ordem.
        for (String manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("---------------");
        List<Double> dinheiros = new ArrayList<>() ;
        dinheiros.add(100.98);
        dinheiros.add(112.50);
        dinheiros.add(96.23);
        System.out.println(dinheiros); //sem ordenaçao
        Collections.sort(dinheiros);
        for (Double din : dinheiros) {
            System.out.println(din); //ordenado
        }

    }
}


