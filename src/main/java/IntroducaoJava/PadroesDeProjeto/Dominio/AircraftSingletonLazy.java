package IntroducaoJava.PadroesDeProjeto.Dominio;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonLazy {

    private static  AircraftSingletonLazy INSTANCE;
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    // O construtor deve ser privado para impedir a criação de novas instâncias
    private AircraftSingletonLazy(String name) {
        this.name = name;

    }


    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    // Getter para acessar a única instância
    public static AircraftSingletonLazy getINSTANCE() {
        //THREAD SAFE.
        if (INSTANCE == null) {
            synchronized (AircraftSingletonLazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AircraftSingletonLazy("boeing 747");
                }
                return INSTANCE;
            }
        }
        return INSTANCE;

    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }






}
