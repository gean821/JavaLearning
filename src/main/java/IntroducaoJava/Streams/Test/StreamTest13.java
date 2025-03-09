package IntroducaoJava.Streams.Test;

import IntroducaoJava.Streams.Dominio.Categories;
import IntroducaoJava.Streams.Dominio.Times;
import IntroducaoJava.Streams.Dominio.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//QUERO FAZER UM AGRUPAMENTO, ONDE SE O PREÇO FOR MENOR QUE 6 ESTÁ DE PROMOÇÃO, E SE FOR MAIOR ESTÁ SEM PROMOÇÃO
public class StreamTest13 {
    private static List<Times> novelList = new ArrayList<>(List.of(
            new Times("barcelona", 9, Categories.GIGANTE),
            new Times("barcelona", 4, Categories.GIGANTE),
            new Times("real Madrid", 10, Categories.GIGANTE),
            new Times("sevilla", 5, Categories.GRANDE),
            new Times("atletico Madrid", 6.2, Categories.MEDIANO),
            new Times("real Betis", 4.5,Categories.PEQUENO)));

    public static void main(String[] args) {
        Map<Promotion, List<Times>> collect = novelList.stream().
                collect(Collectors.groupingBy(Times::getPromotion));
        System.out.println(collect);

    //map pela categoria e pelo preço agora.
        Map<Categories, Map<Promotion, List<Times>>> groupByCategoriePromotion = novelList.stream()
                .collect(Collectors.groupingBy(Times::getCategories,
                        Collectors.groupingBy(Times::getPromotion)));
        System.out.println(groupByCategoriePromotion);
    }





}
