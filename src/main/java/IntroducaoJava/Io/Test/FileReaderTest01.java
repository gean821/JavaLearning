package IntroducaoJava.Io.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt"); //sempre precisamos comprar um File.
        try (FileReader fr = new FileReader(file)) { //usamos try with resources para fechar automaticamente a fileReader.
//            char [] in = new char[40];
//           fr.read(in); //ele retorna um Integer(primeiro caractere da nossa file por tabela ASCII)
//           for (char i: in) {
//               System.out.println(i);
//            }
        int i;
        while (( i = fr.read()) != -1) { //enquanto esse fr.read nao retornar -1 que é o final da pasta me dá o texto .
                System.out.print((char) i); //faço o cast para ter caracteres ao invés de numeros
                //entao basiacmente ele retorna por asc posicao por posicao e precisamos fazer o Cast para transformar para caractere
        }
        }catch(IOException exception) {
            exception.printStackTrace();
        }
    }
}
 //entao o que sabemos é que fileRead e fileWriter sao mais simples e vamos usar muito mais Buffered dos dois por ser mais moderno.