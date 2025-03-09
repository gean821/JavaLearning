package IntroducaoJava.Polimorfismo.Servico;

import IntroducaoJava.Polimorfismo.Repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("salvando em memoria");
    }
}
