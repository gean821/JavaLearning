package IntroducaoJava.Metodos.test;
import IntroducaoJava.Metodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.nome = "SLA";
        calculadora.modelo = "cientifica";
        calculadora.imprime();
        int[] vetor = {1, 2, 3, 4, 5};
        calculadora.somaArray(vetor);
        calculadora.somaVarArgs(2, 3, 4, 131231, 23, 4, 5); //com var args posso passar o que eu quiser aqui
    }
}

