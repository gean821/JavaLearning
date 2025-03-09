package IntroducaoJava.Polimorfismo.Servico;

import IntroducaoJava.Polimorfismo.Repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");

    }
}
