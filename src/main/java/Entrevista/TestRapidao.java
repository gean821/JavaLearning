package Entrevista;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestRapidao {
    public static void main(String[] args) {
        File file = new File("Test2.txt");
        try (FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Aqui estou escrevendo no novo Teste rapidao. Sou lindo e gostoso");
            bw.newLine();
            bw.flush();
        }catch (IOException ex) {
            ex.printStackTrace();
        }
        boolean delete = file.delete();
        System.out.println("Deletado : "+delete);

    }
}
