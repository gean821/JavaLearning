package IntroducaoJava.Jdbc.Dominio;
//como no sql criamos producer ID e name fazemos a mesmsa coisa aqui.
//ESSA É A TABELA DO BANCO DE DADOS.
import lombok.Builder;
import lombok.Value;
//quero fazer a classe ser imutada e ter um
// builder usando lombok.
//assim abrevia toda aqueles códigos.

@Builder //coloca equals,haschode,getter,etc;
@Value //para ser imutável(FINAL)
public final class Producer {
    private Integer id;
    private String name;



}

