package IntroducaoJava.CrudJDBC.Dominio;

import lombok.Builder;
import lombok.Value;
@Builder
@Value

public class Produto {
    private String nome;
    private Integer id;
    private Double preco;
    private Integer quantidade;

}
