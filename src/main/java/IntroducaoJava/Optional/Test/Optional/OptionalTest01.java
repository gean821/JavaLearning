package IntroducaoJava.Optional.Test.Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;

//O Optional foi introduzido no Java 8 para lidar com valores nulos de forma segura, evitando o famoso NullPointerException.
//para evitar o nullPointerException
public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("chupa palmeiras");
        Optional<String> o2 = Optional.ofNullable(null); //para quando eu n sei se é vzio ou n
        Optional<String> o3 = Optional.empty(); //cria um optional completamente vazio
        System.out.println(o1+ "\n"+o2 + "\n"+ o3);
        System.out.println("------------------");

        Optional<String> nameOptional = findName("sean");   //basicamente verifico se este nome está na lista, ele nao estanod não da o erro de nullPointer, apenas retrona empty.
        System.out.println(nameOptional);
        String notInTheList = nameOptional.orElse("VAZIO"); //apenas uma outra forma de mandar uma mensagem se está ou nao na lista.
        System.out.println(notInTheList);
    }

    private static Optional<String> findName(String name) {
        List<String> list = new ArrayList<>(List.of("Gean", "carlos", "alberto ", "kenzo"));
        int i = list.indexOf(name);
        if (i >= 0) {
            return Optional.of(list.get(i));
        }
        return Optional.empty();

    }
}



