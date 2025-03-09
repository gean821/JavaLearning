package IntroducaoJava.ClassesAbstratas.Test;

import IntroducaoJava.ClassesAbstratas.Dominio.Desenvolvedor;
import IntroducaoJava.ClassesAbstratas.Dominio.Funcionario;
import IntroducaoJava.ClassesAbstratas.Dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args)  {
        //por ser uma classe abstrata nos nao criamos o objeto funcionario, apenas os extends dele
        Gerente gerente = new Gerente("Carlos", 4500);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Gean", 3000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}

