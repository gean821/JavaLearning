package IntroducaoJava.Lambdas.Test;

import IntroducaoJava.Lambdas.Dominio.Anime;
import IntroducaoJava.Lambdas.Service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;

//reference to non statics methods
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparator animeComparator = new AnimeComparator();
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Naruto", 988),
                new Anime("dragonball", 43),
                new Anime("berserk", 500)));
        animeList.sort(animeComparator::compareByEpisodesnonStatic);
        System.out.println(animeList);
    }
}
