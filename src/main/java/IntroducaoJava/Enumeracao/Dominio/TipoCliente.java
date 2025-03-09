package IntroducaoJava.Enumeracao.Dominio;

public enum TipoCliente {
    PESSOA_FISICA(1,"Pessoa Fisica"),          //criamos uma enumeração para os tipos declientes a serem passados.
    PESSOA_JURIDICA(2,"Pessoa juridica");   //USAMOS ENUM PARA CRIAR E FAZEMOS A RELAÇÃO DPS COM A CLASSE PRINCIPAL
    public final int valor; //colocamos um para nao ser alterado
    private String nomeRelatorio;


    TipoCliente(int valor, String nomeRelatorio) { //entao sempre que coloco numerações como 1,2,3 explicito eu preciso criar um construtor para enumeração;
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;

    }

    public int getValor() {
        return this.valor;
    }
    public void setNomeRelatorio(String nomeRelatorio) {
        this.nomeRelatorio = nomeRelatorio;
    }
    public String getNomeRelatorio() {
        return this.nomeRelatorio;
    }


}




