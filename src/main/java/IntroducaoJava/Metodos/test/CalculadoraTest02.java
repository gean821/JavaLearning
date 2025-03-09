package IntroducaoJava.Metodos.test;
import IntroducaoJava.Metodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 10;
        int b= 20;
        calculadora.alteraNumeros(a,b);
        System.out.println("dentro do Main :");
        System.out.println(a);
        System.out.println(b);

    }

}
