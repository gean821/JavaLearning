package IntroducaoJava.Lambdas.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("gean","caramburu", "arroba"));
        names.sort(String::compareTo);
        System.out.println(names);

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(names,"gean")); //verificar se meu nome está na lista usando method


    }
}
