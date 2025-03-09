package IntroducaoJava.Lambdas.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
//Function<T, R> (recebe um valor e retorna outro)
//entao posso dar uma string e ele retornar o tamanho de cada uma das strings dentro
public class LambdasTest03 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("gean","marcus","giovanna","josiene"));
        System.out.println(map(names,s-> s.length())); //entao aqui basicamente eu dei uma String e retornei o tamanho desta String via lambdas.
        System.out.println(map(names,String :: length)); //usnado method reference


    }

    private static <T, R> List<R> map (List<T> list, Function<T,R> function) {
        List<R> resultado = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            resultado.add(r);
        }
        return resultado;

    }
}



