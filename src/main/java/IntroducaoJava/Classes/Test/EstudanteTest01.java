package IntroducaoJava.Classes.Test;
import IntroducaoJava.Classes.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "gean";
        estudante.idade = 19;
        estudante.sexo = 'M';

        estudante.imprime();
    }
}


