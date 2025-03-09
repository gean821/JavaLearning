package IntroducaoJava.Exception.Dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa {

    public void salvar() throws LoginInvalidoException, FileNotFoundException{
        System.out.println("Salvando funcionario");
    }
}

/*Ao sobrescrever um método com execeção eu n preciso declarar a mesma.
 /ou entao posso colocar uma  ou todas execeção e depois tratar  dela no teste
 e posso adicionar qualquer exceção do tipo unchecked, ou nao posso adicionar exceções mais genéricas como IOexception
 e nao posso adicionar nenhuma exceção do tipo checked que nao foi declarada no método original.
 */
