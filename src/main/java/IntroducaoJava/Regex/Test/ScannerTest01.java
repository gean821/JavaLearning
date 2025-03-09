package IntroducaoJava.Regex.Test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Levi, Eren, Mikasa";
        String[] nomes = texto.split(","); //retorna array
        for (String nome : nomes) {
            System.out.println(nome.trim());  //o trim tira o espaço em branco

        }
    }
}
