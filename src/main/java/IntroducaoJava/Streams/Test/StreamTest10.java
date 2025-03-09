package IntroducaoJava.Streams.Test;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;
//GERANDO STREAMS INFINITAS.
public class StreamTest10 {
    public static void main(String[] args) {
        Stream.iterate(1, n -> n + 2).limit(50).
                forEach(System.out::println);
        //fazendo fibonacci (sempre soma com o outro).
        //Stream.iterate(1,(x,y)-> x+y).forEach(System.out::println); minha tentativa.
        System.out.println("--------FIBONACCI-------");
        Stream.iterate(new int[] {0,1}, n-> new int[]{n[1], n[0] + n[1]}).limit(30).map(n->n[0]).forEach(System.out::println);

        ThreadLocalRandom geraNumeroAleatorio = ThreadLocalRandom.current();
        Stream.generate(()-> geraNumeroAleatorio.nextInt(1,500)).limit(10).forEach(System.out::println);
    }
}

