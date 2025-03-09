package IntroducaoJava.Colecoes.Test;

import IntroducaoJava.Colecoes.Dominio.Manga;
import IntroducaoJava.Colecoes.Dominio.SmartPhone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;
//UTILIZO TREE SET quando a classe que utilizo usa comparator

class MangaPrecoComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga m1, Manga m2) {
        return Double.compare(m1.getPreco(),m2.getPreco());
    }
}

class SmartphoneMarcaComparator implements Comparator<SmartPhone> {
    @Override
    public int compare(SmartPhone s1, SmartPhone s2) {
        return s1.getMarca().compareTo(s2.getMarca());
    }
}


public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<SmartPhone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        SmartPhone s1 = new SmartPhone("123", "Samsung");
        set.add(s1);
        System.out.println("------------------");

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(5L, "pokemon", 25.30));
        mangas.add(new Manga(3L, "berserk", 5.60));
        mangas.add(new Manga(4L, "naruto", 18.30));
        mangas.add(new Manga(2L, "dragonball", 9.90));
        mangas.add(new Manga(1L, "attack on titan", 30.30));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        //lower<
        //floor<=       //são todos metodos para comparação
        //higher >
        //ceiling  >=
        System.out.println("----------");
        Manga yuyu = new Manga(56L, "berserk", 8);
        System.out.println(mangas.higher(yuyu)); //busca um elemento no tree set maior que 8.0 pq é o preco que estmaos comparando
        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.pollLast());



    }
}


