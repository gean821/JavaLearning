package IntroducaoJava.Nio;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//criada para trabalhar com diretório. serve para pegar todos os arquivos que estao em um tal diretorio.
public class DirectoryStreamTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("C:\\Users\\PC ATEMPORAL\\IdeaProjects\\Projeto");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) { //faz um stream que é como um array e pega todos diretorios ali presentes .basicamente pega cada um desses arquivos que temos no Intelij e vai associar a um Path
            for(Path path : stream) {
                System.out.println(path.getFileName());
            }

        }catch(IOException e){
                e.printStackTrace();
            }

        }
    }

