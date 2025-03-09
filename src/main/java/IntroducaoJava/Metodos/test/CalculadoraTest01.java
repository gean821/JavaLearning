package IntroducaoJava.Metodos.test;
import IntroducaoJava.Metodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.nome = "Nome: qualquer um";
        calculadora.modelo = "Modelo: cientifica";
        calculadora.imprime();
        calculadora.soma(99,113);
        calculadora.multiplica(9,13);
        double resultado = calculadora.divide(9,3); //para a função eu criei outra variavel para imprimir
        System.out.println(resultado);
    }
}
