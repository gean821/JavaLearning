package IntroducaoJava.Gassociacao.dominio;

import org.w3c.dom.ls.LSOutput;

public class Escola {
    private String nome;
    private Professor[] professores;


    public void imprime() {
        System.out.println("Escola : "+this.nome);
        if (professores != null) {
            for (Professor professores : professores) {
                System.out.println(professores);
                System.out.println("professor : "+professores.getNome());//usando for each, nao preciso ver cada iteração de i
            }
        }else {
                System.out.println("Escola sem professor ");
            }

            //for (int i =0; i<professores.length;i++) {   //usanod for normal
              //  System.out.println(this.professores[i]);
                //System.out.println(professores[i].getNome());

        }
    public Escola (String nome) {
        this.nome = nome;  //so coloquei o nome no construtor pq uma escola pode começar sem ter um professor.
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public void setProfessores  (Professor[] professores) {
        this.professores = professores;
    }
    public Professor [] getProfessores  () {
        return this.professores;

    }


}
