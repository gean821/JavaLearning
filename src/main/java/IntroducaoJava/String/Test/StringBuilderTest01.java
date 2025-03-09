package IntroducaoJava.String.Test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Gean Luca";
        nome.concat("Costa");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Gean Luca");
        sb.append(" DevDojo").append(" Academy");
        sb.reverse();
        sb.delete(0,3); //deleta os caracteres 0 até a posicao 3
        System.out.println(sb);
    }
}
//trabalhando com string builder posso alterar sem criar uma nova memória (pool de piscinas).