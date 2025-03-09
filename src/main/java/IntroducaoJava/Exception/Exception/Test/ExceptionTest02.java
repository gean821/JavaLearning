package IntroducaoJava.Exception.Exception.Test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException { /**
     usando o throws aqui também significa que  não é necessário usar try-catch porque o main está propagando a exceção. */
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() throws IOException { //fazendo isso eu obrigo o cara a fazer o tratamento (try catch da chamada do método.) ou então eu posso colocar throws no main
        File file = new File("arquivo//teste.txt"); //aqui eu criei um novo arquivo através de um diretório. Como coloquei .txt eu criei um novo arquivo txt dentro da pasta arquivo.
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado : " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}

