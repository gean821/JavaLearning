package IntroducaoJava.Io.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr)) {
        String linha;
        //br.readLine(); //ele vai ler a linha inteira em vez de caracter por carac.. e retorna nulo no final da linha.
        while((linha = br.readLine()) != null) { //enquanto a linha for diferente de nulo, me dá todo conteúdo
            System.out.println(linha);
        }
        }catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
