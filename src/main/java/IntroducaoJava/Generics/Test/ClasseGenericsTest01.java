package IntroducaoJava.Generics.Test;
import IntroducaoJava.Generics.Dominio.Barco;
import IntroducaoJava.Generics.Dominio.Carro;
import IntroducaoJava.Generics.Service.BarcoRentavelService;
import IntroducaoJava.Generics.Service.CarroRentavelService;

public class ClasseGenericsTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        if (carro!= null) {
            System.out.println("Usando carro por um mês...");
            carroRentavelService.retornarCarroAlugado(carro);
        }else {
            System.out.println("nenhum carro no momento.");
        }
        System.out.println("--------------------------");

        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        if (barco!= null) {
            System.out.println("Alugando barco.");
            barcoRentavelService.retornarBarcoAlugado(barco);
        }else {
            System.out.println("Nenhum barco encontrado no momento para alugar.");
        }


    }

}
