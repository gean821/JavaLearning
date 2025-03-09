package IntroducaoJava.Lambdas.Test;

import IntroducaoJava.Lambdas.Dominio.Anime;
import IntroducaoJava.Lambdas.Service.AnimeComparator;
import java.util.ArrayList;
import java.util.List;
//reference to static methods
public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List< Anime> animeList = new ArrayList<>(List.of(
                new Anime("Naruto",988),
                new Anime("dragonball",43),
                new Anime("berserk", 500)));
//        Collections.sort(animeList, (a1,a2) ->a1.getTitle().compareTo(a2.getTitle())); //isso susbtitui a necessidade de criar uma nova classe animeComparator extends comparator e fzr a msm coisa. facilita bem mais.
//        System.out.println(animeList); //sem usar methodReference.

        animeList.sort(AnimeComparator::compareByTitle); //USANDO METHOD REFERENCE, QUE PEGA A OUTRA CLASSE E O SEU MÉTODO.
        animeList.sort(AnimeComparator::compareByEpisodes);
        System.out.println(animeList);


    }

}
