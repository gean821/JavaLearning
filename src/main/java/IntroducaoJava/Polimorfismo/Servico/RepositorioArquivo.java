package IntroducaoJava.Polimorfismo.Servico;
import IntroducaoJava.Polimorfismo.Repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");

    }
}
