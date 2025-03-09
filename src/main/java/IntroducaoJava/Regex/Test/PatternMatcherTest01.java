package IntroducaoJava.Regex.Test;
//expressao regulares, é uma linguagem usando simbolos para encontrar padrões no texto.
//Validação – E-mails, telefones, CPFs, senhas fortes, etc.
//✅ Busca eficiente – Encontrar padrões específicos em textos grandes.
// ✅ Substituição avançada – Alterar partes específicas de strings.
//✅ Filtros em logs e arquivos – Muito usado em análise de dados.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regularExpressao = "aba"; //se eu colocar ab no regexc ele procura todos 'ab' no texto
        //String texto = "ababaaba"; //entao ele encontra "aba" nesse texto na posicao 0,2 e 5
        String texto2 = "abababa";
        Pattern pattern = Pattern.compile(regularExpressao); //criamos um pattern e precisamos compilar as expressoes
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto : " +texto2);
        System.out.println("Indice: 0123456789");
        System.out.println("expressão regular : "+regularExpressao);
        System.out.println("posicoes encontradas");
        while(matcher.find()) {
            System.out.print(matcher.start()+" "+matcher.group() +"\n");
        }
    }
}
