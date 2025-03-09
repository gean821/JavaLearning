package IntroducaoJava.Regex.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // meta caracteres : \d = retorna todos os digitos numericos;
        //\D = retorna tudo o que nao for digito numérico.
        // \s = retorna todos os espaços em branco \t \m \f \r
        // \S = retorna todos os caracteres excluindo os brancos
        // \w = retorna tudo que for de A-Z-A, digitos e _
        // \W = retorna tudo que nao for incluso no \w .
        String regex = "\\W";
        String regularExpressao = "aba";
        //String texto = "ababaaba";
         String texto2 = "hh312_@h3213";
        Pattern pattern = Pattern.compile(regex); //criamos um pattern e precisamos compilar as expressoes
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto : " +texto2);
        System.out.println("Indice: 0123456789");
        System.out.println("expressão regular : "+regex);
        System.out.println("posicoes encontradas");
        while(matcher.find()) {
            System.out.print(matcher.start()+" "+matcher.group() +"\n");
        }
    }
}
