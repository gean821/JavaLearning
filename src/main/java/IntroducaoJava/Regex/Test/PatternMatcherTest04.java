package IntroducaoJava.Regex.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
// meta caracteres : \d = retorna todos os digitos numericos;
        //\D = retorna tudo o que nao for digito numérico.
        // \s = retorna todos os espaços em branco \t \m \f \r
        // \S = retorna todos os caracteres excluindo os brancos
        // \w = retorna tudo que for de A-Z-A, digitos e _
        // \W = retorna tudo que nao for incluso no \w .
        // [] = retorna range de palavras
        // ? zero ou uma
        // * zero ou mais ocorrencias
        // + uma ou mais ocorrencias
        //{n,m} de n ate m
        // () agrupamento
        // | o(v/c)o ovo | oco
        // $ representa o fim da linha.
        // . 1.3 representa = 123,133,103,1A3


    String regex = "0[xX]([0-9a-fA-F])+\\s|$";
    String texto = "12 0x 0x 0xFFABC 0X10G 0X1";
    Pattern pattern = Pattern.compile(regex); //criamos um pattern e precisamos compilar as expressoes
    Matcher matcher = pattern.matcher(texto);
                System.out.println("Texto : " +texto);
                System.out.println("Indice: 0123456789");
                System.out.println("expressão regular : "+regex);
                System.out.println("posicoes encontradas");

                while(matcher.find()) {
        System.out.print(matcher.start()+" "+matcher.group() +"\n");
    }
    int numeroHex = 0x59F86A; //precisa começar com 0x e não pode passar de F

                 //retorna o número decimal
    }
}
