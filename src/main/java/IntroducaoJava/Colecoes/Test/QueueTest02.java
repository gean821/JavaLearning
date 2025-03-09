package IntroducaoJava.Colecoes.Test;

import IntroducaoJava.Colecoes.Dominio.Consumidor;
import IntroducaoJava.Colecoes.Dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed()); //vamos dar prioridade por preço
        mangas.add(new Manga(5L,"pokemon",25.30));
        mangas.add(new Manga(3L,"berserk",9.90));
        mangas.add(new Manga(4L,"naruto",18.30));
        mangas.add(new Manga(2L,"dragonball",9.90));
        mangas.add(new Manga(1L,"attack on titan",30.30));
        while(!mangas.isEmpty()) {
            System.out.println(mangas.poll());
        }

    }
}
