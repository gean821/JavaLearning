package IntroducaoJava.Classes.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprime() {                // faz a mesma funcao do getter
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String nome) {
       this.nome = nome;
    }
   public void setIdade(int idade) {
        if (idade<1) {
            System.out.println("idade inválida");
            return;
        }
        this.idade = idade;
   }
   public String getNome() { //pega o tipo "String" da variavel nome ;
        return this.nome;
   }
   public int getIdade() {
        return this.idade;
   }

}
