package IntroducaoJava.Polimorfismo.Test;

import IntroducaoJava.Polimorfismo.Repositorio.Repositorio;
import IntroducaoJava.Polimorfismo.Servico.RepositorioArquivo;
import IntroducaoJava.Polimorfismo.Servico.RepositorioBancoDeDados;

public class RepositorioTes {
    public static void main(String[] args) {
        RepositorioArquivo repositorioArquivo = new RepositorioArquivo();
        Repositorio repositorio = new RepositorioBancoDeDados(); //posso trocar para qualquer um dos objetos que implementam a interface que vai dar certo
        repositorio.salvar();       //aqui para programar orientada a interface eu posso criar o objeto INTERFACE (nome) e colocar aquilo q eu quero pegar (banco de dados,memoria,arquivo);
    }
}
