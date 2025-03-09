package IntroducaoJava.PadroesDeProjeto.Dominio;

public class Person {
    private String firstName;
    private String lastName;
    private String username;
    private String email;

    //acesso ao construtor no Builder é privado.
    private Person(String firstName, String lastName, String username, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private String username;
        private String email;

        public PersonBuilder firstName(String firstName) { //no padrão builder nos colocamos o set retornando a propria builder
            this.firstName = firstName;
            return this; //retorno o próprio objeto.
        }

        public PersonBuilder lastName(String lastName) {
            this.lastName =lastName;
            return this; //retorno o próprio objeto.
        }

        public PersonBuilder username(String username) { //no padrão builder nos colocamos o set retornando a propria builder
            this.username = username;
            return this; //retorno o próprio objeto.
        }

        public PersonBuilder email(String email) {
            this.email = email;
            return this; //retorno o próprio objeto.
        }


        public Person build() {
            return new Person(firstName, lastName, username, email);
        }

    }

    public String getFirstName() {
        return firstName;
    }
}
