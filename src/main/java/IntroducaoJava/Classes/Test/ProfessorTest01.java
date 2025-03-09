package IntroducaoJava.Classes.Test;
import IntroducaoJava.Classes.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Moreno";
        professor.idade = 49;
        professor.sexo = 'M';
        System.out.println("Nome : " +professor.nome + " \nIdade : " +professor.idade + " \nSexo: " +professor.sexo);
    }
}
//aqui fiz a impressao dos dados em uma linha só.