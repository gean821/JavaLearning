package IntroducaoJava.Streams.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//AGORA VAMOS CRIAR O STREAM DIRETAMENTE
// SEM UMA LISTA DE VARIAVEL ESPECIFCA
// JA CRIADA.
public class StreamTest09 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,50).filter(n->n % 2 ==0).forEach(n-> System.out.print(n+" ")); //pegando os numeros pares de 1 ate 50
        System.out.println();
        IntStream.range(10,100).filter(n->n%2==0).forEach(System.out::println); //aqui vai ate antes de 100

         Stream.of("eu quero ser gigante e vou ser")
                 .map(String::toUpperCase).forEach(System.out::println);
        System.out.println();

        int num [] = {1,2,3,4,5,6,7,8}; //criando um stream dele.
        Arrays.stream(num).forEach(System.out::println);

        //POSSO TRABALHAR TAMBÉM COM FILES E IMPRIMIR O QUE ESTÁ LA DENTRO
        try(Stream<String> lines = Files.lines(Paths.get("file.txt"))) {
            lines.filter(l->l.contains("Java")).forEach(System.out::println);

        }catch(IOException ex) {
            ex.printStackTrace();
        }


    }
}
