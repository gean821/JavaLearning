package IntroducaoJava.Io.Test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File directory = new File("Folder");
        boolean isDirectory = directory.mkdir();
        System.out.println("Diretório existe : "+isDirectory);

        File arquivo = new File(directory,"arquivo.txt"); //agora criando o arquivo dentro da pasta directory
        boolean isArquivo = arquivo.createNewFile(); //criando ele com o nome acima "arquivo.txt".
        System.out.println("Arquivo criado : "+isArquivo);
        //agora renomeando um arquivo
        File renamed = new File(directory,"arquivo_renomeado.txt");
        boolean isRenamed = arquivo.renameTo(renamed);
        System.out.println("Renomeado : "+isRenamed);

        //renomeando diretório agora
        File directoryRenamed = new File( "Pasta");
        boolean isDirectoryRenamed = directory.renameTo(directoryRenamed);
        System.out.println("Diretorio renomeado : "+isDirectoryRenamed);



    }
}








