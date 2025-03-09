package IntroducaoJava.Streams.Test;

import IntroducaoJava.Streams.Dominio.Times;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//1- order lightNovel by title
//2 - retrieve the first 3 title light novels with price less than 4

public class StreamTest01 {
    private static List<Times> novelList = new ArrayList<>(List.of(new Times("barcelona", 5),
            new Times("real Madrid", 2), new Times("sevilla",8.99),
            new Times("atletico Madrid",3.20), new Times("real Betis", 2.20)));

    public static void main(String[] args) {
        Collections.sort(novelList, (a1,a2)-> a1.getNome().compareTo(a2.getNome()));
        System.out.println(novelList);
        System.out.println("----------------");

        List<String> precoAbaixo4 = new ArrayList<>();
        for (Times novel : novelList ) {
            if (novel.getPrice()<4) {                             //ASSIM SERIA FAZENDO SEM STREAM
                precoAbaixo4.add(novel.getNome()); //adiciona o titulo
            }
            if (precoAbaixo4.size()==3) {
                break;
            }

        }
        System.out.println("Titulos com preços abaixos de 4 : "+precoAbaixo4);

    }
}
