package IntroducaoJava.Junity.Service;

import IntroducaoJava.Junity.Dominio.Person;

public class PersonService {
    public static boolean isAdult(Person person) {
        if (person.getAge() < 18) {
            throw new RuntimeException("Can't create a person with less than 18 years");
        }
        return false;
    }
}
