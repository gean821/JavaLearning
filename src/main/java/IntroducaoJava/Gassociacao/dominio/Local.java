package IntroducaoJava.Gassociacao.dominio;

public class Local {
    private String endereco;

    public Local(String endereco) {
        this.endereco = endereco;
    }
    public void imprime() {
        System.out.println(this.endereco);
        if (endereco == null) {
            System.out.println("Precisa de um local.");
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
