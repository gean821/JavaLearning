package IntroducaoJava.Io.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw)) {  //preciso encapsular writer com buffered writter.
            bw.write("olá estou escrevendo no arquivo.");
            bw.newLine(); //para separar por linhas as frases
            bw.flush();
            }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
