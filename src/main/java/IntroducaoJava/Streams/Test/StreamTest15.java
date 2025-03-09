package IntroducaoJava.Streams.Test;

import IntroducaoJava.Streams.Dominio.Categories;
import IntroducaoJava.Streams.Dominio.Promotion;
import IntroducaoJava.Streams.Dominio.Times;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest15 {
    private static List<Times> novelList = new ArrayList<>(List.of(
            new Times("barcelona", 9, Categories.GIGANTE),
            new Times("barcelona", 4, Categories.GIGANTE),
            new Times("real Madrid", 10, Categories.GIGANTE),
            new Times("sevilla", 5, Categories.GRANDE),
            new Times("atletico Madrid", 6.2, Categories.MEDIANO),
            new Times("real Betis", 4.5,Categories.PEQUENO)));
    public static void main(String[] args) {
        System.out.println(novelList.stream().collect(Collectors.groupingBy(Times::getCategories, Collectors.summarizingDouble(Times::getPrice))));
        System.out.println("--------------");

        Map<Categories, Map<Promotion, Long>> collect = novelList.stream().collect(Collectors.groupingBy(Times::getCategories, Collectors.groupingBy(Times::getPromotion, Collectors.counting())));
        System.out.println(collect);
    }
}
