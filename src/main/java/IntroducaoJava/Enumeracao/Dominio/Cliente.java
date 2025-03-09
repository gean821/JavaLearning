package IntroducaoJava.Enumeracao.Dominio;

public class Cliente {


    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;
    //public enum tipoPagamento { //também daria pra criar a enumeracao dentro do proprio pacote.
    //porém separei em outra classe.
    //public static final String PESSOA_FISICA = "PESSOA_FISICA"; //sem enumeração seria assim.. SEGUIR EXEMPLHO ABAIXO
    //public static final String PESSOA_JURIDICA = "PESSOA_JURIDICA";

    public Cliente(String nome, TipoCliente tipoCliente,TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente : " +nome + " ,TipoCliente =" +tipoCliente.getNomeRelatorio() + ",Tipo Pagamento :"+ tipoPagamento;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public void SetTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    public TipoCliente getTipoCliente() {
        return this.tipoCliente;
    }
    public void setTipoPagamento (TipoPagamento tipoPagamento)  {
        this.tipoPagamento = tipoPagamento;
    }
    public TipoPagamento getTipoPagamento() {
        return this.tipoPagamento;
    }























    //ASSIM FARÍAMOS SEM ENUMERAÇÃO ....


    //public Cliente(String nome,String tipo) {
       // String tipoNormalizado = tipo.toUpperCase();
        //if (!tipoNormalizado.equals(PESSOA_FISICA) && !tipoNormalizado.equals(PESSOA_JURIDICA)) {
            //return; //se nao for certo, nao cria o cliente.
        //}           //ASSIM FARIAMOS SEM ENUMERAÇÃO, PORÉM É FEIO.
         //   this.nome = nome;
           // this.tipo = tipoNormalizado;
    //}


    //@Override
    //public String toString() {
        //return "Cliente : "+this.nome + ", Tipo : "+this.tipo;
    //}

    //public String getNome() {
        //return nome;
    //}

    //public void setNome(String nome) {
        //this.nome = nome;
    //}

    //public String getTipo() {
       // return tipo;
    //}

    //public void setTipo(String tipo) {
        //this.tipo = tipo;
    //}


}
