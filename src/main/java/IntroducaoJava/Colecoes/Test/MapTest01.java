package IntroducaoJava.Colecoes.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 🚀 Por que aprender Map?
 * Eficiência: A busca por um valor usando a chave é muito rápida (O(1) no HashMap).
 * Organização: Útil para representar relações entre dados, como IDs e objetos.
 * Versatilidade: Muito usado em APIs, banco de dados, caching, etc.
 * 🔥 Principais implementações de Map
 * HashMap: Mais rápido, mas não mantém ordem.
 * LinkedHashMap: Mantém a ordem de inserção.
 * TreeMap: Ordena as chaves automaticamente.
 * Se você pretende trabalhar com APIs, banco de dados e processamento de dados, Map será essencial! Já chegou a usar em algum código?
 *///sempre preciso ter um equals e hashCode.
public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();                 //passa a chave e o tipo de valor. A chave vai ser String e o valor tb
        map.put("teklado", "teclado"); //digamos que alguém digitou a palavra errado e quer achar ela
        map.put("mauze", "mouse");
        map.put("vc", "você");
        map.putIfAbsent("vc2", "você"); //ele nao sobrescreve quando há daus palavras iguais,
        System.out.println(map);// porém queremos iterar.

        for (String key : map.keySet()) { //fazemos um for each para iterar sobre cada chave.
            System.out.println(key + " : " + map.get(key));
        }
        System.out.println("-----------");
        for (String value : map.values()) {
            System.out.println(value);
        }
        System.out.println("----------");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue()); //isso seria para pegar os dois valores de uma vez só, porém é um pouco mais confuso
        }
        System.out.println("----EXERCICIO-------");

        Map<Double, Float> map2 = new HashMap<>();
        map2.put(10001.0, 10000F);
        map2.put(101.10, 100F);
        map2.put(105.50, 106F);
        map2.put(99.5, 100F);
        for (Double key : map2.keySet()) {
            System.out.println(key+ " : "+ map2.get(key));
        }

    }


}
