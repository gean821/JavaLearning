package IntroducaoJava.Comportamentos.Interfaces;

import IntroducaoJava.Comportamentos.Dominio.Car;

public interface CarPredicate {
    public abstract boolean test(Car car);
    //anonimas, funções,deixar código mais conciso.
    //qualquer interface funcional podemos utilizar lambdas.

}
