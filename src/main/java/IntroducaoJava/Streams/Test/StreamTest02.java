package IntroducaoJava.Streams.Test;

import IntroducaoJava.Streams.Dominio.Times;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

////1- order lightNovel by title
////2 - retrieve the first 3 title light novels with price less than 4
//AGORA USANDO STREAMS
public class StreamTest02 {
    private static List<Times> novelList = new ArrayList<>(List.of(
            new Times("barcelona", 5),
            new Times("real Madrid", 2),
            new Times("sevilla",8.99),
            new Times("atletico Madrid",3.20),
            new Times("real Betis", 2.20)));

    public static void main(String[] args) {
        //fazendo um sort usando streams para comparar os titulos.
        List<String> titles = novelList.stream().sorted((a1, a2) -> a1.getNome().compareTo(a2.getNome())).
                filter(ln -> ln.getPrice() < 4)
                .limit(3)
                .map(ln -> ln.getNome()) //fazendo por mais LAMBDAS
                .collect(Collectors.toList());

        novelList.stream().sorted(Comparator.comparing(Times::getNome)) //primeiro ORDENO
                .filter(filtra->filtra.getPrice()<4).limit(3) //DEPOIS FILTRO
                .map(Times::getNome) //DEPOIS PEGO POR TITULOS
                .collect(Collectors.toList()); //EM SEGUIDA AGRUPA PARA A LISTA DE TITULOS.


        System.out.println(titles);
//BASICAMENTE FIZ O SORT, COMPARANDO POR TITULO, DEPOIS FILTREI PARA PEGAR OS PREÇOS ABAIXO DE 4, LIMITEI PARA 3 (OS 3 PRIMEIROS ABAIXOS DE 4), DEI O MAP

    }
}
