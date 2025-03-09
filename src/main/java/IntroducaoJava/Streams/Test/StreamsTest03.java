package IntroducaoJava.Streams.Test;

import IntroducaoJava.Streams.Dominio.Times;
import java.util.ArrayList;
import java.util.List;

public class StreamsTest03 {
    private static List<Times> novelList = new ArrayList<>(List.of(
            new Times("barcelona", 3),
            new Times("barcelona", 3),
            new Times("real Madrid", 2),
            new Times("sevilla",2),
            new Times("atletico Madrid",3.20),
            new Times("real Betis", 2.20)));

    public static void main(String[] args) {
        novelList.forEach(lightNovel -> System.out.println(lightNovel)); //para imprimir direto.

        long priceMinusThan4 = novelList.stream().filter(lightNovel -> lightNovel.getPrice() < 4).count();
        System.out.println("------------------");
        System.out.println("quantidade com menor que 4 : " +priceMinusThan4); //para contar quantos na minha lista tem preço menor que  4.

        long count1 = novelList.stream().
                distinct().
                filter(ln -> ln.getPrice() <= 4)
                .count();
        System.out.println("---------------------------");
        System.out.println("Quantidade distinta com preço <=4 : " +count1);

    }
}
