package IntroducaoJava.Classes.dominio;

public class Estudante {
   public String nome;
   public int idade;
   public char sexo;

   public void imprime() {
      System.out.println("Nome : "+this.nome);
      System.out.println("Sexo : "+this.sexo);
      System.out.println("idade : " +this.idade);
   }
}
