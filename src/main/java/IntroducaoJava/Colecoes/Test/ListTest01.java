package IntroducaoJava.Colecoes.Test;
import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) { //coloca por padrao o tamaho inicial 16, ou 10.
        List<String> nomes = new ArrayList<>(16); //como era feito ate a versao 1.4, colocamos o tipo da lista <String,int,char> dentro do <>
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("Gean"); //assim se preenche. para criar a list só pode ser usado WRAPPER.(INTEGER,STRING);
        nomes.add("Dev dojo");
        nomes2.add("Estudo");
        nomes2.add("Academy");
        nomes.remove(0); //posso remover por nome do objeto, ou pelo indice.
        nomes.addAll(nomes2); //para adicionar itens de uma lista em outra usamos um nomes.addAll e escolhemos a lista que vamos juntar na outra.
        for (String nome : nomes) { //faço um for each pegando o tipo  "String" e um nome que quero dar e : "nomes" que é a variavel que estou trabalhando
            System.out.println(nome);
        }
        nomes.add("carlos");
        System.out.println("---------------"); //e assim seria usando um for normal.
        for (int i = 0;i <nomes.size();i++) {
            System.out.println(nomes.get(i));
        }
        System.out.println(nomes); //para imprimir a lista separadamente.





    }
}

