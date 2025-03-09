package IntroducaoJava.PadroesDeProjeto.Dominio;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonEager {
    //EAGER INITIALIZATION, A classe é criada e fica ali durante todo o momento.
    private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("boeing 747");
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    // O construtor deve ser privado para impedir a criação de novas instâncias
    private AircraftSingletonEager(String name) {
        this.name = name;

    }


    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    // Getter para acessar a única instância
    public static AircraftSingletonEager getINSTANCE() {
        return INSTANCE;
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }

}





