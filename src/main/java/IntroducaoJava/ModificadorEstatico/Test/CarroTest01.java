package IntroducaoJava.ModificadorEstatico.Test;

import IntroducaoJava.ModificadorEstatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Nissan March", 180);
        Carro carro2 = new Carro("Bugatti Chiron", 440);
        Carro carro3 = new Carro("Ferrari 458", 320);
        Carro.setVelocidadeLimite(180);
        carro1.imprime(); //basicamente como colocamos a velocidade limite em 180, vai ser estatico para todas instancias(objetos) da classe Carro.
        carro2.imprime();
        carro3.imprime();
    }
}
