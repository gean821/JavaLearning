package IntroducaoJava.Gassociacao.Test;
import IntroducaoJava.Gassociacao.dominio.Escola;
import IntroducaoJava.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Roberto");
        Professor professor2 = new Professor("Ana");
        Escola escola = new Escola("Nobel");
        //como nao tem a associação, preciso criar um array para professores.
        Professor [] professores = {professor1, professor2};
        escola.setProfessores(professores); //aqui estou fazendo a associação de professores para escola.
        escola.imprime();

    }
}
