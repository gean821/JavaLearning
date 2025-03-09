package IntroducaoJava.ClassesInternas.Test;

import IntroducaoJava.Generics.Dominio.Barco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class barcoComparator implements Comparator<Barco> {
    @Override
    public int compare(Barco o1, Barco o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

    public class AnonymousClassTest02 {
    public static void main(String[] args) {
        List<Barco> barcos = new ArrayList<>(List.of(new Barco("iate"), new Barco("canoa")));
        barcos.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
        System.out.println(barcos);


    }
}
