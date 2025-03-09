package IntroducaoJava.Heranca.Test;
import IntroducaoJava.Classes.dominio.Aluno;
import IntroducaoJava.Heranca.Dominio.Endereco;
import IntroducaoJava.Heranca.Dominio.Funcionario;
import IntroducaoJava.Heranca.Dominio.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua duartina 410");
        endereco.setCep("87080440");
        Pessoa pessoa = new Pessoa("Carlos");
        pessoa.setCpf("12515308937");
        pessoa.setEndereco(endereco);
        System.out.println("Detalhes : ");
        pessoa.imprime();
        System.out.println("-----------------");
        Funcionario funcionario = new Funcionario("Gean");
        funcionario.setCpf("46423192987");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(1500);
        funcionario.imprime();       //entao o funcionario herda todos os métodos de pessoa, inclusive IMPRIME.
        //nao imprime o salário pq o salário está so na classe funcionario e n no imprime da pessoa.

    }
}