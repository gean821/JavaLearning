package IntroducaoJava.Colecoes.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<> ();
        numeros.add(1);
        numeros.add(2);
        numeros.add(4);
        numeros.add(0);
        // (-(ponto de inserção) -1
        Collections.sort(numeros);
        System.out.println(Collections.binarySearch(numeros,5)); //serve para achar a posicao do item da lista. 2 é o terceiro valor
        //se nao achar retorna -(numero);


    }





}
