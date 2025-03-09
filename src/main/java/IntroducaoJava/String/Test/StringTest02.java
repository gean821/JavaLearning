package IntroducaoJava.String.Test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Luffy";
        String numeros = "012345";
        System.out.println(nome.charAt(4));//pega a letra na posicao
        System.out.println(nome.length()); //tamanho
        System.out.println(nome.replace("f","l")); //troca todas letras de f por l
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0,2)); //pega de onde quero começar ate onde quero terminar. Mas o ultimo é -1
        System.out.println(nome.trim()); //remove valores em brnco do inicio e fim



    }
}
