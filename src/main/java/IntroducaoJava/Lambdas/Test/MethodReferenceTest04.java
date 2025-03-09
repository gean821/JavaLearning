package IntroducaoJava.Lambdas.Test;

import IntroducaoJava.Lambdas.Dominio.Anime;
import IntroducaoJava.Lambdas.Service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

//referencia para construtor
public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparator> newAnimeComparator = AnimeComparator::new;
        AnimeComparator animeComparator = newAnimeComparator.get();
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Naruto", 988),
                new Anime("dragonball", 43),
                new Anime("berserk", 500)));

        animeList.sort(animeComparator::compareByEpisodesnonStatic);
        System.out.println(animeList);

        BiFunction<String, Integer,Anime>  animeBiFunction = (title,episodes) -> new Anime(title,episodes);
        BiFunction<String, Integer,Anime>  animeBiFunction2 = Anime::new;
        System.out.println(animeBiFunction2.apply("Naruto", 36));




    }
}
