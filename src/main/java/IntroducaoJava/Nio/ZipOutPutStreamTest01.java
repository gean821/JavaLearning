package IntroducaoJava.Nio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

//gera um zip, sempre que vejo Stream significa que estamos trabalhando com dados de baixo nivel
public class ZipOutPutStreamTest01 {
    public static void main(String[] args) {
        Path arquivoZip = Paths.get("pasta/arquivo.zip");
        Path arquivosParaZipar = Paths.get("pasta/subpasta");
        zip(arquivoZip, arquivosParaZipar);

    }

    private static void zip(Path arquivoZip, Path arquivosParaZipar) {
        try (ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivosParaZipar)) {
            for (Path file : directoryStream) {
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(file,zipStream);
                zipStream.closeEntry();

            }
            System.out.println("arquivo criado com sucesso.");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}








