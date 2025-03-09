package IntroducaoJava.String.Test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Gean"; //String constat pool
        String nome2 = "Gean"; //para comparar a memoria fazemos ==
        nome.concat("Luca"); //dessa forma é criado uma nova string, e nao é referenciada ao nome
        System.out.println(nome == nome2);
        nome = nome.concat("Luca"); //dessa forma sim é referenciada.
        System.out.println(nome == nome2);
        String nome3 = new String("Gean"); //1 variavel de referencia, 2 objeto do tipo String, 3. uma String no pool de String
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
//as String sao imutaveis e preciso tomar cuidado ao associar um novo valor a variavel de referencia senão nao consgio utilizar o valor novo.