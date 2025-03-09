package IntroducaoJava.Exception.Exception.Test;
import IntroducaoJava.Exception.Dominio.Leitor1;
import IntroducaoJava.Exception.Dominio.Leitor2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
        lerArquivo2();

    }

    public static void lerArquivo() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e) {


        }
    }


        public static void lerArquivo2 () {
            Reader reader = null;
            try {
                reader = new BufferedReader(new FileReader("teste.txt"));
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (reader != null)
                        reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }




