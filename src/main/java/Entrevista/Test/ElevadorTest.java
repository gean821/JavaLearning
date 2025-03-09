package Entrevista.Test;
import Entrevista.Dominio.Andar;
import Entrevista.Dominio.ControleElevador;
import Entrevista.Dominio.Elevador;
import java.util.Scanner;

public class ElevadorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalAndares = 10;
        Elevador elevador = new Elevador(totalAndares);
        ControleElevador controle = new ControleElevador(totalAndares);


        Andar[] andares = new Andar[totalAndares];
        for (int i = 0; i < totalAndares; i++) {
            andares[i] = new Andar(i + 1);
        }

        //interagindo com o usuario aqui :

        while (true) {
            System.out.println("\tEscolha uma opção :");
            System.out.println("1.Chamar elevador para um andar");
            System.out.println("2. Selecionar andar dentro do elevador");
            System.out.println("3. Mover elevador");
            System.out.println("4. Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Qual andar deseja ir ?");
                    int andarChamada = scanner.nextInt();
                    andares[andarChamada - 1].pressionarBotaoChamado(elevador);
                    break;
                case 2:
                    System.out.println("Qual andar deseja selecionar ?");
                    int andarSelecionado = scanner.nextInt();
                    controle.selecionaBotao(andarSelecionado);
                    break;
                case 3:
                    elevador.mover();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("ESCOLHA INVÁLIDA.");
                    break;
            }
        }
    }
}

