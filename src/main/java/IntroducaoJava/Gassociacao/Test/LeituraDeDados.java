package IntroducaoJava.Gassociacao.Test;
import java.util.Scanner;
public class LeituraDeDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("qual o seu nome : ");
        String nome = scanner.nextLine();
        System.out.println("digite sua idade : ");
        int idade = scanner.nextInt();
        System.out.println("digite seu sexo (F/M)");
        char sexo = scanner.next().charAt(0); //para caracter o charAt(0)
        while (sexo != 'F' && sexo != 'M') {
            System.out.println("erro, informe novamente : ");
            sexo = scanner.next().charAt(0);
        }




    }
}
