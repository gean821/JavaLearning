package IntroducaoJava.Nio;
import java.nio.file.Path;
import java.nio.file.Paths;
//APENAS PARA CONECTAR UM CAMINHO AO OUTRO.
//dado dois paths, como faço para chegar no path2 a partir do p1
public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/gean");
        Path clazz = Paths.get("/home/gean/pikaGrossa/olaMundo.java");
        System.out.println(dir.relativize(clazz)); //é basicamente pegar o caminho já feito pra conectar os dois caminhos.
        Path absolute1 = Paths.get("/home/gean");
        Path absolute2 = Paths.get("/usr/local");
        Path absolute3 = Paths.get("/home/gean/pikaGrossa/olaMundo.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.20301230213");
        System.out.println("1." +absolute1.relativize(absolute3));
        System.out.println("2." +absolute3.relativize(absolute1));
        System.out.println("3." +absolute1.relativize(absolute2));
        System.out.println("4." +relativo1.relativize(relativo2));
        System.out.println("5." +absolute1.relativize(relativo1));

    }
}

