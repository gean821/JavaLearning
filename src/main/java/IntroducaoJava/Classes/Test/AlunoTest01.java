package IntroducaoJava.Classes.Test;
import java.util.Scanner;
import IntroducaoJava.Classes.dominio.Aluno;

public class AlunoTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Aluno aluno = new Aluno();
        aluno.nome = "Marcus";
        aluno.matricula = "ADS";

        for (int i = 0; i<aluno.notas.length;i++) {
            System.out.println("informe as notas do aluno : ");
            aluno.notas[i] = scanner.nextDouble();

        }
        aluno.imprimeDados();
        aluno.calculaMedia();
        aluno.verificaAprovacao();
    }



}

