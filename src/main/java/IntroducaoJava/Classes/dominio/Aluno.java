package IntroducaoJava.Classes.dominio;

public class Aluno {
    public String nome;
    public String matricula;
    public double[] notas = new double[4];

    public void imprimeDados() {
        System.out.println("nome : "+this.nome);
        System.out.println("Matricula : " + this.matricula);
        System.out.println("Notas : ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
    }

    public double calculaMedia() {
        double soma = 0;
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        media = soma / notas.length;
        System.out.println("A média das notas é : "+media);
        return media;
    }
    public void verificaAprovacao() {
        double media = calculaMedia();
        if (media <6) {
            System.out.println("Aluno: " +this.nome + " Você está reprovado");
        }else
            System.out.println("Aluno: "+ this.nome + " voce está aprovado.");
    }
}


