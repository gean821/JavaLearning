package IntroducaoJava.Heranca.Test;
import IntroducaoJava.Heranca.Dominio.Funcionario;

public class HerancaTest02 {
    //0 -bloco de inicailizao estatico da sper classe é executada quado a JVM carregar a classe pai
    //1- bloco de inicializacao estatico da sub classae é executado quando a JVM carregar classe filha
    //2- alocado espaco em memória pro objeto da classe pai
    //3- cada atributo da classe é criado e inicializado com avlores defaut ou o que for passado da classe pai
    //4 - bloco de inicialização é executado na ordem em que aparece
    //5- construtor da superclasse é executado
    //agora faz tudo isso na subclasse.

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("cabrito");
    }
}
