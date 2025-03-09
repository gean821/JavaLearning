package IntroducaoJava.Regex.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
    // [^abc] exclui tudo que nao for a,b,c


        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z]+))+";
        String texto = "luffy@hotmail.com,123jotaro@gmail.com, #@zoro@mail.br, test@gnail.com, sakura@mail";
        System.out.println("Email válido : ");
        System.out.println("#@zoro@mail.br".matches(regex));
        Pattern pattern = Pattern.compile(regex); //criamos um pattern e precisamos compilar as expressoes
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto : " +texto);
        System.out.println("Indice: 0123456789");
        System.out.println("expressão regular : "+regex);
        System.out.println("posicoes encontradas");
        while(matcher.find()) {
            System.out.print(matcher.start()+" "+matcher.group() +"\n");
        }


    }
}






