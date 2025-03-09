package IntroducaoJava.Nio;

import javax.xml.transform.sax.SAXSource;
import java.nio.file.*;

public class PathmatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("pasta/subpasta/file.bkp");
        Path path2 = Paths.get("pasta/subpasta/file.txt");
        Path path3 = Paths.get("pasta/subpasta/file.java");
        Path path4 = Paths.get("pasta/outro_arquivo.txt");
        Path path5 = Paths.get("pasta/teste123.txt");
        Path path6 = Paths.get("subpasta/arquivo-final.txt");

        // 1. Verifica apenas no diretório atual
        matches(path1, "glob:*.bkp"); // ❌ Falha porque o arquivo está dentro de subpastas

        // 2. Permite qualquer subdiretório
        matches(path1, "glob:**/*.bkp"); // ✅ Funciona porque aceita qualquer subdiretório

        // 3. Verifica se o arquivo tem uma das extensões listadas
        matches(path2, "glob:**/*.{bkp,txt,java}"); // ✅ Funciona para txt, java e bkp

        // 4. Verifica qualquer arquivo dentro da pasta "pasta", mas não dentro de subpastas
        matches(path2, "glob:pasta/*"); // ❌ Falha porque "subpasta/file.txt" não está diretamente em "pasta"
        matches(path4, "glob:pasta/*"); // ✅ Funciona porque "outro_arquivo.txt" está diretamente na pasta "pasta"

        // 5. Verifica nomes que começam com "teste" seguido de qualquer número
        matches(path5, "glob:pasta/teste[0-9]*.txt"); // ✅ Funciona porque "teste123.txt" segue o padrão

        // 6. Corresponde a qualquer arquivo finalizando com "-final.txt"
        matches(path6, "glob:**/*-final.txt"); // ✅ Funciona porque o arquivo termina com "-final.txt"

        // 7. Corresponde a um único caractere usando "?"
        matches(path5, "glob:pasta/teste?.txt"); // ❌ Falha porque "teste123.txt" tem mais de um caractere após "teste"
        matches(Paths.get("pasta/teste1.txt"), "glob:pasta/teste?.txt"); // ✅ Funciona porque tem exatamente um caractere após "teste"

        // 8. Verifica um arquivo específico independente do caminho
        matches(path1, "glob:**/file.bkp"); // ✅ Funciona pois ignora os diretórios e foca no nome do arquivo
    }

    public static void matches(Path path, String pattern) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(pattern);
        boolean result = matcher.matches(path);
        System.out.println("Path: " + path + " | Padrão: " + pattern + " | Match: " + result);
    }
}









