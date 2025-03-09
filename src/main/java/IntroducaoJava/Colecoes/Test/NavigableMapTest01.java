package IntroducaoJava.Colecoes.Test;
import IntroducaoJava.Colecoes.Dominio.Consumidor;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Gean");
        Consumidor consumidor2 = new Consumidor("Dev Dojo Academy");

        NavigableMap<String,String> map = new TreeMap<>();

        map.put("a", "Letra A");
        map.put("d", "Letra D");
        map.put("c", "Letra C");
        map.put("x", "Letra X");

        for (String string : map.keySet()) {
            System.out.println(string+ " "+map.get(string));
        }
        System.out.println(map.headMap("C", true));
        System.out.println(map.descendingMap()); //contrario

    }
}
