package IntroducaoJava.PadroesDeProjeto.Test;

import IntroducaoJava.PadroesDeProjeto.Dominio.AircraftSingletonLazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AircraftTest03 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        bookSeat("1A");
        bookSeat("1A");
        Constructor<AircraftSingletonLazy> constructor = AircraftSingletonLazy.class.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        AircraftSingletonLazy aircraftSingletonLazy = constructor.newInstance("boeing 747");
        System.out.println(aircraftSingletonLazy);
    }


    private static void bookSeat(String seat)  {
        AircraftSingletonLazy aircraft =  AircraftSingletonLazy.getINSTANCE();
        System.out.println(aircraft.bookSeat(seat));
    }

}
