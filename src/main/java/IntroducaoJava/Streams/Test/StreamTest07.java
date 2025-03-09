package IntroducaoJava.Streams.Test;

import java.util.ArrayList;
import java.util.List;
//a partir da lista vmos fazer a Soma desses avlores.
//uso de REDUCE com Numeros.
public class StreamTest07 {
    private static List<Integer> nums = new ArrayList<>(List.of(1, 2, 34, 5, 6, 7, 8, 19, 34));

    public static void main(String[] args) {
        nums.stream().reduce((x, y) -> x + y)//soma os elementos. Volta um optional
                .ifPresent(System.out::println);
    //ou por method reference
        nums.stream().reduce(Integer::sum) //mais facil.
                .ifPresent(System.out::println);

      nums.stream().reduce((x,y)->x*y) //para multiplicação
              .ifPresent(System.out::println); //retorna um optional

        nums.stream().reduce(Integer::max) //para pegar o maior valor.
                .ifPresent(System.out::println);
    }
}