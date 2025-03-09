package IntroducaoJava.PadroesDeProjeto.Test;

import IntroducaoJava.PadroesDeProjeto.Dominio.Aircraft;

public class AircraftTest01 {
    public static void main(String[] args) {
        bookseat("1A");
        bookseat("1A");
    }
    private static void bookseat(String seat) {
        Aircraft aircraft = new Aircraft("boeing 747");
        System.out.println(aircraft.bookSeat(seat)); //quero pegar o assento disponvel
    }
}
