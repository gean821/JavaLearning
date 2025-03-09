package IntroducaoJava.Nio;
//resolve basicamente resolve e coloca dois caras juntos
import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {
        Path directory = Paths.get("home/gean");//caminho relativo
        Path arquivo = Paths.get("dev/arquivo.txt"); //dessa forma o java nao acharia a pasta pq ela nao tem o primeiro caminho por ser relativo. entao resolvemos ela.
        Path resolve = directory.resolve(arquivo);
        System.out.println(resolve);

        Path absoluto = Paths.get("/home/gean");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.txt23");
        System.out.println("1 " + absoluto.resolve(relativo));
        System.out.println("2 " + absoluto.resolve(file));

        System.out.println("3 " + relativo.resolve(absoluto));
        System.out.println("4 " + relativo.resolve(file));
        System.out.println("5 " + file.resolve(absoluto));
        System.out.println("6 " + relativo.resolve(relativo));



    }
}
