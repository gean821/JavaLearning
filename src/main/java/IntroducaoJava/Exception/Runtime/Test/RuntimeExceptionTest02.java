package IntroducaoJava.Exception.Runtime.Test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(1,0));


    }

    /**

     * @param a
     * @param b nao pode ser zero
     * @return
     * @throws IllegalArgumentException
     */

    private static double divisao(int a,int b) {
        if (b==0) {
            throw new RuntimeException("Argumento ilegal, não pode ser zero."); //poderia usar illegalArgumentException que é a mais especifica e certa.
        }   //aqui eu aprendo a fzer o lancamento da exceção e lanço ela "THROW". logo nao precisa ser executado o código abaixo
        return a/b;


        //Try { //Entao aqui fa zemos o try de uma divisao. Se ela nao for possivel ela cai no catch do problema e solta e precisa de um retorno, por isso sai o zero.
            //Return a/b;
        //} catch (ArithmeticException e) {
            //e.printStackTrace();
        //}
        //return 0; //se o catch for executado ele retorna 0.
        //Caso ele nao seja executado cai no outro return.
    }


}
