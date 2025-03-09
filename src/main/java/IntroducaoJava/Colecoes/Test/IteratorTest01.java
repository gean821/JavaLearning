package IntroducaoJava.Colecoes.Test;

import IntroducaoJava.Colecoes.Dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "pokemon", 25.30, 0));
        mangas.add(new Manga(3L, "berserk", 9.90, 5));
        mangas.add(new Manga(4L, "naruto", 18.30, 0));
        mangas.add(new Manga(2L, "dragonball", 9.90, 2));
        mangas.add(new Manga(1L, "attack on titan", 30.30, 0));
        //nao removemos nada usando for each.Por isso usamos ITERATOR.
        //Iterator<Manga> iterator = mangas.iterator();
        //while (iterator.hasNext()) { //verifica a fila, se existe um proximo ele pega o proximo.
          //  if (iterator.next().getQuantidade() == 0) { //se existe um proximo e a quantidade for zero ele remove.
                //iterator.remove();
        //fazendo desta forma ele remove os itens que nao existem a quantidade mais.

        System.out.println(mangas); //agora usando programação funcional como fica mais simples e resumido
        mangas.removeIf(manga -> manga.getQuantidade() == 0); //funciona como um for each, eu escolho a variavel que vou usar, dou um nome e navego pelo manga.getQuantidade(), se for zero eu removo.

    }
}
