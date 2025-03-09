package IntroducaoJava.Lambdas.Test;
//LAMBDAS TRABALHAM COM TRES TIPOS DE INTERFACE
//Predicate<T> (testa uma condição e retorna true ou false)
//Function<T, R> (recebe um valor e retorna outro)
//Consumer<T> (executa uma ação e não retorna nada)

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdasTest02 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("gean","Marcus", "Giovanna"));
        List<Integer> nums = new ArrayList<>(List.of(1,2,3,4,5124213,568,3,1,2)) ;
        forEach(names,s -> System.out.println(s)); //fizemos um lambda para retornar toda a lista.
        forEach(nums,n-> System.out.println(n));
        forEach(names,s2-> System.out.println(s2.toUpperCase()));
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
       for (T e : list) {
           consumer.accept(e); //o comportamento deste accept eu mesmo defino através da lambda
       }
    }
}

