package IntroducaoJava.Streams.Test;

import IntroducaoJava.Streams.Dominio.Times;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

//SUMARIZAÇÃO
public class StreamTest11 {
    private static List<Times> novelList = new ArrayList<>(List.of(
            new Times("barcelona", 3),
            new Times("barcelona", 3),
            new Times("real Madrid", 2),
            new Times("sevilla", 2),
            new Times("atletico Madrid", 3.20),
            new Times("real Betis", 2.20)));

    public static void main(String[] args) {
        System.out.println(novelList.stream().count()); //digamos que quero contar quantos tem do objeto.
        System.out.println(novelList.stream().collect(Collectors.counting())); //mesma coisa.

        novelList.stream().max(Comparator.comparing(Times::getPrice))
                .ifPresent(System.out::println);
//USANDO COLECTOR
        novelList.stream().collect(Collectors.maxBy(Comparator.comparing(lightNovel -> lightNovel.getPrice()))).ifPresent(System.out::println);

        System.out.println(novelList.stream().mapToDouble(Times::getPrice).sum());
        System.out.println(novelList.stream().collect(Collectors.summingDouble(Times::getPrice)));

        //VERDADEIRO PODER DO COLLECTOR AGORA ABAIXO:
        System.out.println("---------------");
        DoubleSummaryStatistics collect = novelList.stream().collect(Collectors.summarizingDouble(Times::getPrice));
        System.out.println(collect); //aparece todas stats que estamamos buscando.

        System.out.println("------------");

        String titlesJoining = novelList.stream().map(Times::getNome).collect(Collectors.joining(", "));// junta tudo em uma String só.
        System.out.println(titlesJoining); //pega todos objetos.

    }
}
