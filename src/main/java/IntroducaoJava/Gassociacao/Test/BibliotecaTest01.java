package IntroducaoJava.Gassociacao.Test;
import IntroducaoJava.Gassociacao.dominio.Autor;
import IntroducaoJava.Gassociacao.dominio.Livro;

public class BibliotecaTest01 {
    public static void main(String[] args) {
     Autor autor1 = new Autor("Marcus Rashford");
     Autor autor2 = new Autor("Ronald Koeman");
     Livro livro1 = new Livro("Harry Potter ");
     Livro livro2 = new Livro("As armadilhas ");
     Autor [] autores = {autor1,autor2};
     Livro [] livros = {livro1,livro2};
     livro1.setAutores(autores);
     livro2.setAutores(autores);
     autor1.setLivros(livros);
     autor2.setLivros(livros);
        System.out.println("Detalhe dos livros : ");
     livro1.imprime();
     livro2.imprime();
        System.out.println("Detalhe dos autores : ");
     autor1.imprime();
     autor2.imprime();







    }
}
