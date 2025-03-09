package IntroducaoJava.Io.Test;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//File //trabalhar com arquivo
//FilWriter //escrever com arquivo
//FileReader //leitura
//BufferedWriter //trabalhando com dados em memoria
//BufferedReader //trabalhandno com
public class FileWritterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try ( FileWriter fw = new FileWriter(file,true)) {      //usando o try com resources ele fecha sozinho e é mais simples, por isso vou usalo
            fw.write("Estou escrevendo na pasta.\n Aqui estou escrevendo e vai acumular por causa do append true haaha" );                                       //quase semrpe que trabalho com sistema operacional eu preciso fechar ele usando .close();
            fw.flush(); //para deixar tudo que há no buffer e evitar erros
        }catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
//usando o append true toda vez que eu executar f10 nesta classe ele repete e acmula a mesma frase varias vezes na file.
