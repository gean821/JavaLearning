package IntroducaoJava.Exception.Exception.Test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();

    }

    private static void criarNovoArquivo() {

        File file = new File("arquivo//teste.txt"); //aqui eu criei um novo arquivo através de um diretório. Como coloquei .txt eu criei um novo arquivo txt dentro da pasta arquivo.
        try {//vai verificar se o diretório existe, caso contrário, cria
            //ele vai tentar este código abaixo e se der erro vai pular logo para o catch, se n der continua normalmente e retorna true ou false
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado : " + isCriado);

        } catch (IOException e) { //NUNCA DEIXAR BLOCO CATCH EM BRANCO
            e.printStackTrace(); //para imprimir tudo que aconteceu na stack de try, se o diretório está invalido ou errado jogará uma mensagem daqui.
        }                          //nunca colocar regra de negócio aqui


    }
}

//Definição do nome do arquivo: A variável arquivo armazena o nome do arquivo a ser criado, neste caso, "ArquivoTeste.txt".
//Instanciação do objeto File: O objeto file é criado com base no nome do arquivo fornecido.
//Criação do arquivo: Dentro do bloco try, o método createNewFile() é chamado para criar o arquivo. Este método retorna true se o arquivo foi criado com sucesso e false se o arquivo já existe.
//Tratamento de exceções: Caso ocorra uma exceção do tipo IOException durante a criação do arquivo, ela será capturada pelo bloco catch, e a pilha de execução será impressa usando e.printStackTrace().
//Uma observação importante é que o método createNewFile() não cria diretórios inexistentes no caminho especificado; ele apenas cria o arquivo. No seu caso, como o nome do arquivo não inclui um caminho de diretório, o arquivo será criado no diretório de trabalho atual da aplicação. Se você desejar especificar um diretório diferente, certifique-se de que ele exista ou crie-o previamente utilizando os métodos mkdir() ou mkdirs() da classe File.
//Além disso, é uma boa prática verificar se o arquivo já existe antes de tentar criá-lo, utilizando o método exists(). Isso pode evitar a tentativa de criação de um arquivo que já está presente no sistema de arquivos.
//Para mais informações sobre o método createNewFile(), você pode consultar a documentação oficial da Oracle.

