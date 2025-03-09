package IntroducaoJava.Polimorfismo.Test;

import IntroducaoJava.Polimorfismo.Dominio.Estagiario;
import IntroducaoJava.Polimorfismo.Dominio.Funcionario;
import IntroducaoJava.Polimorfismo.Dominio.Gerente;
import IntroducaoJava.Polimorfismo.Dominio.Vendedor;
import IntroducaoJava.Polimorfismo.Servico.CadastroFuncionarios;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Estagiario("Gean", 1500);
        Funcionario funcionario2 = new Gerente("Carlos",4000);
        Funcionario funcionario3 = new Vendedor("Alberto",1800,15);

        CadastroFuncionarios.exibeListaFuncionarios(funcionario);
        CadastroFuncionarios.exibeListaFuncionarios(funcionario2);
        CadastroFuncionarios.exibeListaFuncionarios(funcionario3);




    }
}
