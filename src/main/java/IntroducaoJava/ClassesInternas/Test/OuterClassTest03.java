package IntroducaoJava.ClassesInternas.Test;

public class OuterClassTest03 {
    private String name;
    static class Nested {
        void print() {
            OuterClassTest03 outClass = new OuterClassTest03();
            System.out.println("nome " + outClass.name);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();

    }
}