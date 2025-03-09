package IntroducaoJava.Colecoes.Test;

import IntroducaoJava.Colecoes.Dominio.Consumidor;
import IntroducaoJava.Colecoes.Dominio.Manga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Gean");
        Consumidor consumidor2 = new Consumidor("Dev Dojo Academy");
        Manga m1 = new Manga(5L, "pokemon", 19.5);
        Manga m2 = new Manga(3L, "berserk", 20);
        Manga m3 = new Manga(4L, "naruto", 10.2);
        Manga m4 = new Manga(2L, "dragonball", 8);
        Manga m5 = new Manga(1L, "attack on titan", 9);
        //agora quero fazer com que um consumidor se associe a vários mangas
        List<Manga> mangaList = List.of(m1, m2, m3); //crio a lista para associar os mangasa ela
        List<Manga> mangaList2 = List.of(m4, m5);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, mangaList);// depois associo elas ao consumidor
        consumidorMangaMap.put(consumidor2, mangaList2);//aqui tb
        for (Consumidor relacao : consumidorMangaMap.keySet()) {
            System.out.println(relacao + " " + consumidorMangaMap.get(relacao));
        }
    }


}

