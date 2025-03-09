package IntroducaoJava.Classes.Test;
import IntroducaoJava.Classes.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        //pessoa.nome = "marcus"; // aqui vemos que nao dá pra chamar o nome pq ele é privado...
        pessoa.setNome("marcus");               //aqui usamos o setter e chamamos o nome como método pq é priavdo
        pessoa.setIdade(0);
        System.out.println("nome : " +pessoa.getNome());
        System.out.println("Idade :" +pessoa.getIdade()); //agora criamos a função get para pegar a idade e nome da classe

    }
}
