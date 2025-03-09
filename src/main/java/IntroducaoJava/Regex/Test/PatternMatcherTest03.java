package IntroducaoJava.Regex.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
            public static void main(String[] args) {
                // meta caracteres : \d = retorna todos os digitos numericos;
                //\D = retorna tudo o que nao for digito numérico.
                // \s = retorna todos os espaços em branco \t \m \f \r
                // \S = retorna todos os caracteres excluindo os brancos
                // \w = retorna tudo que for de A-Z-A, digitos e _
                // \W = retorna tudo que nao for incluso no \w .
                // [] = retorna range de palavras
                String regex = "[a-zA-C]"; //para retornar ou a ou b ou C
                String texto2 = "cafeBABE";
                Pattern pattern = Pattern.compile(regex); //criamos um pattern e precisamos compilar as expressoes
                Matcher matcher = pattern.matcher(texto2);
                System.out.println("Texto : " +texto2);
                System.out.println("Indice: 0123456789");
                System.out.println("expressão regular : "+regex);
                System.out.println("posicoes encontradas");
                while(matcher.find()) {
                    System.out.print(matcher.start()+" "+matcher.group() +"\n");
                }
                String regex2 = "0[xX][0-9a-fA-F]";
                String texto = "12 0x 0x 0xFFABC 0X109 0X1";
                Pattern pattern2 = Pattern.compile(regex2); //criamos um pattern e precisamos compilar as expressoes
                Matcher matcher2 = pattern.matcher(texto);
                System.out.println("Texto : " +texto);
                System.out.println("Indice: 0123456789");
                System.out.println("expressão regular : "+regex2);
                System.out.println("posicoes encontradas");

                while(matcher.find()) {
                    System.out.print(matcher2.start()+" "+matcher2.group() +"\n");
                }
                int numeroHex = 0x59F86A; //precisa começar com 0x e não pode passar de F

                System.out.println(numeroHex); //retorna o numero decimal





            }


        }



