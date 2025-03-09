package IntroducaoJava.Streams.Test;

import IntroducaoJava.Streams.Dominio.Times;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//FINDING E MATCHING
public class StreamTest06 {
    private static List<Times> novelList = new ArrayList<>(List.of(
            new Times("barcelona", 3),
            new Times("barcelona", 1.99),
            new Times("real Madrid", 2),
            new Times("sevilla",2),
            new Times("atletico Madrid",3.20),
            new Times("real Betis", 7.20)));

    public static void main(String[] args) { //existe algum lightnovel que o preço seja maior do que 8?
        System.out.println(novelList.stream().anyMatch(ln->ln.getPrice()>8));
        System.out.println(novelList.stream().allMatch(lightNovel -> lightNovel.getPrice()>0)); //todo mundo dentro da lista tem preço maior que zero ?
        System.out.println(novelList.stream().noneMatch(lightNovel -> lightNovel.getPrice()<0)); //nenhum deles é maior do que zero ?
        novelList.stream().filter(ln->ln.getPrice()<4).findAny().orElseThrow(IllegalArgumentException::new);//também retorna um optional, ou seja, posso encadea-lo.//retorne qualquer um que tenha um preço, seleciona qqlr elemento

        novelList.stream().filter(ln->ln.getPrice()>3).sorted(Comparator.comparing(Times::getPrice))
                .findFirst() //encontra primeiro elemento da lista onde satifaz a condição.
                .ifPresent(System.out::println); //se presente retorna um optional
    }

}
