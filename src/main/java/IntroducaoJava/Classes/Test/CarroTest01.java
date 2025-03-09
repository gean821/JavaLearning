package IntroducaoJava.Classes.Test;
import IntroducaoJava.Classes.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();
        carro.nome = "Bugatti Chiron";
        carro.modelo = "Sport";
        carro.ano = 2020;
        carro2.nome = "Nissan March";
        carro2.modelo = "hatch";
        carro2.ano = 2012;
        System.out.println("Nome : " +carro.nome+ "\nModelo : " +carro.modelo+ "\nAno: "+carro.ano );
        System.out.println();
        System.out.println("Nome : " +carro2.nome + "\nModelo : " +carro2.modelo + "\nAno: "+ carro2.ano);

    }


}
