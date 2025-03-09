package IntroducaoJava.Nio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
//aqui ele serve para listar tudo o que temos no nosso diretório.
//criar outra classe aqui dentro pq so vou usa-la aqui
class ListJavaFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        if (file.getFileName().toString().endsWith(".java")) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}
    public class SimpleFileVisitorTest01 {
        public static void main(String[] args) throws IOException {
            Path root = Paths.get(".");
            Files.walkFileTree(root,new ListJavaFiles());
        }
}
