package IntroducaoJava.Nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String directoryProject = ".idea/Home/Dev";
        String arquivoTxt = "../../arquivo.txt";
        Path path1 = Paths.get(directoryProject, arquivoTxt);
        System.out.println(path1); //nao está normalizado pois ainda aparece o camihno completo
        System.out.println(path1.normalize());
        Path path2 = Paths.get("/home/./gean/./dev");
        System.out.println(path2);
        System.out.println(path2.normalize());

    }
}
