package IntroducaoJava.Nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException{
        Path pasta = Paths.get("PastaPath");//isso agora é o mesmo que new file "pasta"
        if (Files.notExists(pasta)) { //se a pasta ainda nao existe, criamos ela com try catch na assinatura ou normal para evitar lançar exceção.
            Path pastaDirectory = Files.createDirectory(pasta); //usamos isso agora para criar um diretório da pasta. //lancei excecao na assinatura para deixar codigo maais clean
        }
        Path subPastaPath = Paths.get("PastaPath/subpasta/subsubpasta");
        Path subPastaDirectory = Files.createDirectories(subPastaPath); //isso seria para criar mais subpastas dentro do diretorio

        Path filePath = Paths.get(subPastaPath.toString(),"file.txt"); //isso aqui para criar um arquivo dentro das pastas
        if (Files.notExists(filePath)) {
            Path filePathCreated = Files.createFile(filePath);
        }

        Path source = filePath; //a origem
        Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt"); //tentativa de mudar o nome do arquivo que está na subpasta com a variavel filePath
        Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING); //ESSE Standard e replace servem para quando eu digitar em um arquivo ir para o outro que está renomeado também.
        //porém o que acontece usando FILE.copy é que eu duplico o arquivo file.txt, por isso é criado outro igual o renamed.
        //usando files.move da mesma forma ele ao invés de copiar um arquivo apenas renomeia.


    }
}
