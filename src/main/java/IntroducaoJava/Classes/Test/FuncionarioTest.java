package IntroducaoJava.Classes.Test;

import IntroducaoJava.Classes.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Gean") ;
        funcionario.setIdade(19);
        funcionario.setSalarios( new double[] {1000,987,2000});
        funcionario.imprimeDados();
        funcionario.calculaMedia();

    }
}



