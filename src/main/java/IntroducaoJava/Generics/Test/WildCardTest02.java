package IntroducaoJava.Generics.Test;

import java.util.ArrayList;
import java.util.List;
//FAZENDO AGORA USANDO LISTAS (RECOMENDADO.)
public class WildCardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = new ArrayList<>();
        cachorros.add(new Cachorro());
        cachorros.add(new Cachorro());

        List<Gato> gatos = new ArrayList<>();
        gatos.add(new Gato());
        gatos.add(new Gato());

        consultaAnimal(gatos);
        consultaAnimal(cachorros);

        List<Animal> animais = new ArrayList<>();
        printConsultaAnimal(animais);

    }
    private static void consultaAnimal(List< ?extends Animal> animais) { //usamos um Curinga "?" que faz aceitar a lista de animais como cachorros e gatos.
        for (Animal animal : animais) {    //isso por conta de que criamos uma lista de CACHORROS e outra de GATOS, mesmo ela extendendo de animais fica propenso a só cachorro e gato e nao animais.
             animal.consulta(); //no array funciona pq ele já relaciona um ao outro, porém listas sao mais eficaze.
        }
        //Exatamente, você pegou a ideia! 🚀Quando você cria uma List<Cachorro>, o compilador entende que essa lista só pode conter objetos do tipo Cachorro. Diferente dos arrays, as listas não permitem conversões automáticas para List<Animal>, porque isso poderia gerar inconsistências.
        //🔥 Resumindo:
        //List<Cachorro> não é uma List<Animal> → Não podemos simplesmente passar uma lista de cachorros para um método que espera List<Animal>.
        //Precisamos do curinga (? extends Animal) → Isso diz ao compilador:
        //"Aceite qualquer lista que contenha elementos de uma subclasse de Animal (Cachorro, Gato, etc.), mas sem permitir modificações na lista (adição de novos elementos de tipo diferente)."
    //Agora você entendeu bem o conceito! 🏆

    }
    private static void printConsultaAnimal(List<? super Animal > animais) { //fazendo desta forma eu posso passar qualquer subclasse sem problemas
            animais.add(new Gato());
            animais.add(new Cachorro());
//🔥 Resumindo:
//Use ? extends Animal quando quiser ler elementos, mas não modificar a lista.
//Use ? super Animal quando quiser modificar a lista, adicionando novos elementos.
        }
    }















