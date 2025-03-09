package IntroducaoJava.Nio;
import java.nio.file.Path;
import java.nio.file.Paths;
//CLASSE MAIS ATUALIZADA DE FILE
public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\PC ATEMPORAL\\IdeaProjects\\Projeto\\file.txt");
        Path p2 = Paths.get("C:\\Users\\PC ATEMPORAL\\IdeaProjects\\Projeto", "file.txt"); //outra forma de passar
        Path p3 = Paths.get("C","\\\\Users\\\\PC ATEMPORAL\\\\IdeaProjects\\\\Projeto", "file.txt");
        Path p4 = Paths.get("C","Users","Gean", "Luca", "Documents","IdeaProjects", "Projeto","file.txt"); //posso passar do caminho que quiser.
        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());
        System.out.println(p4.getFileName());
    }
}
