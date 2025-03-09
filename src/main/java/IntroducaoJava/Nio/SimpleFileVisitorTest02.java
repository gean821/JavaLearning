package IntroducaoJava.Nio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;


    class ListAllFiles extends SimpleFileVisitor<Path> {
        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            return super.preVisitDirectory(dir, attrs);
        }

        @Override
        public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
            return super.visitFileFailed(file, exc);
        //ele lança a exceçao para quando um arquivo nao está certo.
        }

        @Override
        public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
            return super.postVisitDirectory(dir, exc);
        //basicamente
        }

        @Override //da sf1..
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
            if (file.getFileName().toString().endsWith(".java")) {
                System.out.println(file.getFileName());
            }
            return FileVisitResult.CONTINUE;
        }
    }
    public class SimpleFileVisitorTest02 {
        public static void main(String[] args) throws IOException {
            Path root = Paths.get(".");
            Files.walkFileTree(root,new ListJavaFiles());
        }
    }


