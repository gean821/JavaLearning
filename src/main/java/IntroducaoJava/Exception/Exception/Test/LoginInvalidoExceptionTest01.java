package IntroducaoJava.Exception.Exception.Test;
import IntroducaoJava.Exception.Dominio.LoginInvalidoException;
import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
        private static void logar () throws LoginInvalidoException {
            Scanner scanner = new Scanner(System.in);
            String userNameDb = "Goku";
            String senhaDb = "maringa";
            System.out.println("Usuario :");
            String usernameDigitado = scanner.nextLine();
            System.out.println("Senha :");
            String senhaDigitada = scanner.nextLine();
            if (!userNameDb.equals(usernameDigitado) || !senhaDb.equals(senhaDigitada)) {
                throw new LoginInvalidoException ("Usuario ou senha inválidos.");
            }
            System.out.println("Usuario logado com sucesso");


        }

}

