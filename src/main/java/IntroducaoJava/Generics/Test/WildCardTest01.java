package IntroducaoJava.Generics.Test;
//FAZENDO O CÓDIGO USANDO ARRAYS AO INVES DE LISTAS.
abstract class Animal {
    public abstract void consulta (); //aqui vou criar uma classe abstrata e colocar este método para obrigar todos os animais a terem ele.

}
class Cachorro extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando Cachorro");
    }
}
class Gato extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando Gato");
    }
}

public class WildCardTest01 {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()}; //faco assim e nao new Cachorro[2] pq assim pode nao inicializar os objetos e dar exceção.
        Gato[] gatos = {new Gato(), new Gato()};
        printConsulta(cachorros);
        printConsulta(gatos);


     }
    private static void printConsulta(Animal[] animals) {
        for (Animal animal: animals) {
           animal.consulta();
        }



    }
}
