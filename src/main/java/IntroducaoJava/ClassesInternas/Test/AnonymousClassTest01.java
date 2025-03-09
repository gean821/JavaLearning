package IntroducaoJava.ClassesInternas.Test;
//sao classes que vao existir brevemente por um determinado peridodo de código e que nao podem ser reutilizadas em nenhum otutro lugar

class Animal {
    public void walk() {
        System.out.println("Animal walking.");
    }
}


public class AnonymousClassTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){ //assim estou criando uma subClasse anônima
            @Override
            public void walk() {
                System.out.println("Walking dentro da classe anonima");
            }
        };
        animal.walk(); //puxando a função agora eu vejo walking da classe anonima e nao da classe de cima.

    }











}
