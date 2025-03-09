package IntroducaoJava.Polimorfismo.Servico;
import IntroducaoJava.Polimorfismo.Dominio.Funcionario;

public class CadastroFuncionarios {

    public static  void exibeListaFuncionarios(Funcionario funcionario) {
        System.out.println("Lista de funcionarios : ");
        System.out.println("Nome : " +funcionario.getNome() + ",Salario total  ->  " +funcionario.calcularSalario());
        System.out.println("-----------");





    }

}
