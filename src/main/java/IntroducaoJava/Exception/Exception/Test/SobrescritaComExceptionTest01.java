package IntroducaoJava.Exception.Exception.Test;

import IntroducaoJava.Exception.Dominio.Funcionario;
import IntroducaoJava.Exception.Dominio.LoginInvalidoException;
import IntroducaoJava.Exception.Dominio.Pessoa;

import java.io.File;
import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
