package IntroducaoJava.PadroesDeProjeto.Test;

import IntroducaoJava.PadroesDeProjeto.Dominio.Aircraft;
import IntroducaoJava.PadroesDeProjeto.Dominio.AircraftSingletonEager;

public class AircraftTest02 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }


    private static void bookSeat(String seat) {
        AircraftSingletonEager aircraft = AircraftSingletonEager.getINSTANCE(); //n posso mais dar new. so por getInstance.
        System.out.println(aircraft.bookSeat(seat));
    }
}