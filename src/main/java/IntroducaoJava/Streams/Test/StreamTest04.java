package IntroducaoJava.Streams.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>(); //lista de lista
        List<String> graphicDesigners = new ArrayList<>(List.of("Gean Luca", "meu pinto","carlos","arroba"));
        List<String> developers = new ArrayList<>(List.of("marcus", "geovanna", "carlitos"));
        List<String> students = new ArrayList<>(List.of("édipo", "Gustavo", "carolina"));
        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);

        for (List list : devdojo) {
            System.out.println(list); //fazendo normalmente.
        }
        //usamos flatmap para quando precisamos retirar um atributo que está aninhado já
        devdojo.stream().flatMap(Collection::stream).forEach(ln-> System.out.println(ln));
        //uso FlatMap quando preciso retirar um atributo ou coleção de dentro de algum lugar.
    }

}
