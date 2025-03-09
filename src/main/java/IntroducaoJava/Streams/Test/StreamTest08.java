package IntroducaoJava.Streams.Test;

import IntroducaoJava.Streams.Dominio.Times;

import java.util.ArrayList;
import java.util.List;

//uso de REDUCE com OBJETOS
public class StreamTest08 {
    private static List<Times> novelList = new ArrayList<>(List.of(
            new Times("barcelona", 3),
            new Times("barcelona", 3),
            new Times("real Madrid", 2),
            new Times("sevilla",1.90),
            new Times("atletico Madrid",3.20),
            new Times("real Betis", 2.20)));

    public static void main(String[] args) {
        novelList.stream().filter(lightNovel -> lightNovel.getPrice() > 2.99).map(Times::getPrice).reduce(Double::sum)
                .ifPresent(System.out::println); //filtrando para pegar os preços acima de 3 e somar

    }
}
