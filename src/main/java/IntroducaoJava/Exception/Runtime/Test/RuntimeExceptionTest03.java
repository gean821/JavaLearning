package IntroducaoJava.Exception.Runtime.Test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        System.out.println(abreConexao());
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexao aberta.";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo sistema operacional.");
        }
        return null;
    }
}
/*O código dentro do finally sempre será executado, independentemente de uma exceção ter ocorrido ou não.
A mensagem "Fechando recurso liberado pelo sistema operacional." será impressa, mesmo se o try executar corretamente ou se uma exceção for lançada.
Esse bloco é utilizado para liberar recursos (como fechar arquivos, conexões de rede, etc.), garantindo que isso aconteça, mesmo que ocorra uma exceção durante a execução do try.
 */

