package IntroducaoJava.Interfaces.Test;
import IntroducaoJava.Interfaces.Dominio.DataBaseLoader;
import IntroducaoJava.Interfaces.Dominio.DataLoader;
import IntroducaoJava.Interfaces.Dominio.DataRemover;
import IntroducaoJava.Interfaces.Dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader databaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader(); //nao podemos criar objetos abstratos, de interface
        fileLoader.load();
        fileLoader.remove();
        databaseLoader.load();
        databaseLoader.remove();
        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();     //consigo chmar
        DataBaseLoader.retrieveMaxDataSize();




    }


}
