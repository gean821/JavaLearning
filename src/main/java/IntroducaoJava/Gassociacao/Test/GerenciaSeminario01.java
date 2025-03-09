package IntroducaoJava.Gassociacao.Test;
import IntroducaoJava.Gassociacao.dominio.Aprofessor;
import IntroducaoJava.Gassociacao.dominio.Estudante;
import IntroducaoJava.Gassociacao.dominio.Local;
import IntroducaoJava.Gassociacao.dominio.Seminario;

public class GerenciaSeminario01 {
    public static void main(String[] args) {
        Local local = new Local("Duartina 410");
        Aprofessor professor = new Aprofessor("Carlitos", "Oratoria");
        Estudante  estudante1 = new Estudante("Ronaldo",19);
        Estudante  estudante2 = new Estudante("Messi",40);
        Seminario seminario = new Seminario ("Biologia");
        estudante1.setSeminario(seminario);
        estudante2.setSeminario(seminario);
        seminario.setEstudante(estudante1);
        professor.setSeminario(seminario);
        seminario.setLocal(local);

        System.out.println("Sobre o Seminario : ");
        seminario.imprime();
        System.out.println("endereço : ");
        local.imprime();
        System.out.print("Professor : ");
        professor.imprime();
        System.out.println("Estudante(s) ");
        estudante1.imprime();
        estudante2.imprime();








    }
}
