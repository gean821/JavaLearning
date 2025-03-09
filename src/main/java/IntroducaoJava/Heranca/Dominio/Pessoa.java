package IntroducaoJava.Heranca.Dominio;

import com.sun.security.jgss.GSSUtil;

public class Pessoa {
    protected String nome;
    protected String cpf;    //eu uso protected para dar o direito das subclasses poderem usar as infos
    protected Endereco endereco;
    static {
        System.out.println("dentro do bloco estatico de pessoa");
    }
    {
        System.out.println("bloco de inicializacao nao estático de pessoa");
    }

    {
        System.out.println("bloco de inicializacao nao estático 2 de pessoa");
    }
    public Pessoa(String nome) {
        System.out.println("dentro do construtor de pessoa");
        this.nome = nome; //sempre que crio construtor na classe mãe preciso alterar na classes filhas.

    }


    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        if (endereco != null) {
            System.out.println(this.endereco.getRua() + " " + this.endereco.getCep());
        } else
            System.out.println("Pessoa sem endereco");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;

    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
