package IntroducaoJava.Io.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt"); //preciso passar o nome do caminho. //1. se eu quiser apenas criar a onde o programa está sendo executado apsso apenas o nome. 2.Se quiser salvar ele em lugar especifico preciso passar o caminho absoluto.
        try {
            boolean iscreated = file.createNewFile();//preciso lançar excecao
            System.out.println("Created : "+iscreated);
            System.out.println("path : " +file.getPath());
            System.out.println("Path absolute : " +file.getAbsolutePath());
            System.out.println("Is directory : "+file.isDirectory()); //é um diretório ou arquivo?
            System.out.println("Is hidden : "+file.isHidden());
            System.out.println("Is file : "+file.isFile());
            System.out.println("Last modified : "+new Date(file.lastModified())); //para trabalhar com Data correta.
            if (file.exists()) {
                System.out.println("file deleted : " +file.delete());
            }
        }catch(IOException exception) {
            exception.printStackTrace();

        }


    }
}
