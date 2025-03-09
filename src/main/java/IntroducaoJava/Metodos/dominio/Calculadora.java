package IntroducaoJava.Metodos.dominio;

public class Calculadora {
    public String nome;
    public String modelo;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.modelo);
    }

    public void soma(int a, int b) { //esse é o metodo funcao da classe calculadora.
        System.out.println(a + b);   // aqui eu coloquei para passar por parametro um valor qualquer e retornar dps no teste dela.
    }

    public void multiplica(int a, int b) {
        System.out.println(a * b);
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Não é possivel dividir por zero.");
        }
        return (a / b);

    }

    public void alteraNumeros(int a, int b) {   //por primitivo.
        a = 99;
        b = 33;
        System.out.println("dentro da função nao altera original =  " + a + " " + b);
        a = 105;
    }

    public void somaArray(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        System.out.println("A soma é : " + soma);
    }

    public void somaVarArgs(int... vetor) {   //aqui serve para passar a quantidade que eu desejar pra um vetor.sem declarar o tamanho
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        System.out.println("A soma é : " + soma);
    }
}
