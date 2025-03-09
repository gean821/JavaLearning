package IntroducaoJava.Streams.Test;

import IntroducaoJava.Streams.Dominio.Categories;
import IntroducaoJava.Streams.Dominio.Times;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
        private static List<Times> novelList = new ArrayList<>(List.of(
                new Times("barcelona", 3, Categories.GIGANTE),
                new Times("barcelona", 3, Categories.GIGANTE),
                new Times("real Madrid", 2, Categories.GIGANTE),
                new Times("sevilla", 2, Categories.GRANDE),
                new Times("atletico Madrid", 3.20, Categories.MEDIANO),
                new Times("real Betis", 2.20,Categories.PEQUENO)));

    public static void main(String[] args) {
        //agora vamos agrupar para juntar os times.
        Map<Categories, List<Times>> collect = novelList.stream().collect(Collectors.groupingBy(Times::getCategories));
        System.out.println(collect);

    }
}

