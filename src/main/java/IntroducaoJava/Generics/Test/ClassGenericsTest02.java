package IntroducaoJava.Generics.Test;

import IntroducaoJava.Generics.Dominio.Barco;
import IntroducaoJava.Generics.Dominio.Carro;
import IntroducaoJava.Generics.Service.BarcoRentavelService;
import IntroducaoJava.Generics.Service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClassGenericsTest02 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fiat uno"),new Carro("Nissan March")));
        RentalService<Carro> carroRentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = carroRentalService.buscarObjetoDisponivel();
        if (carro!=null) {
            System.out.println("Usando carro");
             carroRentalService.retornarObjetoAlugado(carro);
        }else {
            System.out.println("Sem carros disponiveis no momento.");
        }
        System.out.println("------------------------");
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("lancha"),new Barco("iate")));
        RentalService<Barco> barcoRentalService = new RentalService<>(barcosDisponiveis);
        Barco barco = barcoRentalService.buscarObjetoDisponivel();
       if (barco!= null )   {
           System.out.println("Alugando Objeto.");
           barcoRentalService.retornarObjetoAlugado(barco);
       }else {
           System.out.println("Nenhum barco disponivel");
       }



    }
}
