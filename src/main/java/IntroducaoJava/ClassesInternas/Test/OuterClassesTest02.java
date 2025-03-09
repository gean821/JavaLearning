package IntroducaoJava.ClassesInternas.Test;


//basicamente é criar uma classe local dentro do MÉTODO.
public class OuterClassesTest02 {
     private String nome = "Marucs";

     void print(){
        class PrintLocal {
            public void mensagem() {
                System.out.println("nome : "+nome);
            }

        }
         new PrintLocal().mensagem(); //preciso fazer essa gambiarra pra usar.



     }

     public static void main(String[] args) {
         OuterClassesTest02 outClass = new OuterClassesTest02();
         outClass.print();

    }
}
