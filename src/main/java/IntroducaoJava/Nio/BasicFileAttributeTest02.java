package IntroducaoJava.Nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributeTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("arquivoTeste.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);//este atributo diz que quando a classe files le esse atributo, o objeto que tem que ser retornado é um obj que passa pelo test basicFile
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime LastAcessTime = basicFileAttributes.lastAccessTime();
        FileTime LastModifiedTime = basicFileAttributes.lastModifiedTime();

        System.out.println("Creation Time :"+creationTime);
        System.out.println("Last Modified :"+LastModifiedTime);
        System.out.println("LastAcessTime :"+LastAcessTime);
        System.out.println("--------------");

        BasicFileAttributeView FileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class); //serve para mudar os atributos da File, como ultima modificacao, hora de criação,etc
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis()); //criei aqui para registrar o momento exato de criação do arquivo para passar abaixo
        FileAttributeView.setTimes(LastModifiedTime,newCreationTime,creationTime);

        creationTime = FileAttributeView.readAttributes().creationTime();
        LastAcessTime = FileAttributeView.readAttributes().lastAccessTime();
        LastModifiedTime = FileAttributeView.readAttributes().lastModifiedTime();

        System.out.println("Creation Time :"+creationTime);
        System.out.println("Last Modified :"+LastModifiedTime);
        System.out.println("LastAcessTime :"+LastAcessTime);

    }
}
