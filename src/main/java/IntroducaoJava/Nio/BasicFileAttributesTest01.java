package IntroducaoJava.Nio;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;


public class BasicFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        //BasicFileAttributes,DosFileAttributes,PosixFileAttributes
        LocalDateTime date = LocalDateTime.now().minusDays(10);
       // File file = new File("pasta2/novo.txt");
       // boolean newFile = file.createNewFile();
        //boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());

        Path pasta = Paths.get("pasta2-novo_path");
        if (Files.notExists(pasta)) {
            Files.createDirectory(pasta);
        }
        Path filePath = Paths.get(pasta.toString(),"arquivoTeste.txt");
        System.out.println(Files.createFile(filePath));


        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(pasta,fileTime);
        System.out.println(Files.isExecutable(pasta));
        System.out.println(Files.isReadable(pasta));
        System.out.println(Files.isWritable(pasta));






    }

}
