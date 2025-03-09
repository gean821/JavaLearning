package IntroducaoJava.CrudJDBC.Test;

import IntroducaoJava.CrudJDBC.Dominio.Produto;
import IntroducaoJava.CrudJDBC.Service.ProdutoService;
import lombok.extern.log4j.Log4j2;

import java.sql.SQLException;
import java.util.List;
//codigo funcional, porém preciso arrumar as infos de log que nao estão aparecendo!!!
//no banco de dados, salva,deleta,atualiza,acha por nome, e todos.
@Log4j2
public class ProdutoTest01 {
    public static void main(String[] args) throws SQLException {
        Produto produto = Produto.builder()
                .nome("Macarrao").id(1)
                .preco(8.99)
                .quantidade(100)
                .build();
        ProdutoService.saveProduct(produto);
        //ProdutoService.deleteProduct(1);
        List<Produto> produtos = ProdutoService.findAll();
        log.info("products found '{}'", produtos);



    }
}
