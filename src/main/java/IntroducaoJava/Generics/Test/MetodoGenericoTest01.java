package IntroducaoJava.Generics.Test;

import IntroducaoJava.Generics.Dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01{
    public static void main(String[] args) {
        System.out.println(criarArrayComUmObjeto(new Barco("lancha")));

    }

    private static <T> List<T> criarArrayComUmObjeto(T t) {
        List<T> lista = new ArrayList<>();
        lista.add(t);
        return lista;
    }

}
