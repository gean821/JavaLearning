package IntroducaoJava.PadroesDeProjeto.Test;
//Quando o Builder é útil?
//Quando um objeto tem muitos atributos opcionais e diferentes formas de inicialização.
//Quando você quer evitar um construtor gigantesco cheio de parâmetros.
//Quando precisa garantir um código mais legível e flexível para criar instâncias.
import IntroducaoJava.PadroesDeProjeto.Dominio.Person;

public class PersonBuilderPatternTest01 {
    public static void main(String[] args) {
    Person build = new Person.PersonBuilder() //trabalhando com padrao de projeto utilizamos assim para criar um objeto.
            .firstName("Gean")
            .lastName("Luca")
            //.build poderia parar aqui.
            .username("geanluca")
            .email("geanlucaramos@gmail.com")
            .build(); //agora eu posso retornar o build quando eu quiser. Ou seja, se quiser parar no 2 atributo eu paro.
        System.out.println(build);


    }
}
