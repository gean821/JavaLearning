package IntroducaoJava.Classes.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double media;
    private double[] salarios = new double[3];

    public void imprimeDados() {
        System.out.println("nome : " + this.nome);
        System.out.println("idade : " + this.idade);
        System.out.println("Salários :");
        for (int i = 0; i < salarios.length; i++) {
            System.out.println(salarios[i] + "  ");
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }
    public String getNome() {
        return this.nome;
    }
    public int getIdade() {
        return this.idade;
    }
    public double getMedia() {
        return this.media;
    }
    public double[] getSalarios() {
        return this.salarios;
    }

    public double calculaMedia() {
        double soma = 0;
        for (int i = 0; i < salarios.length; i++) {
            soma += salarios[i];
        }
        media = soma / salarios.length;
        System.out.println("a média dos salários é : " + media);
        return media;
        }

}



