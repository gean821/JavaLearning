package IntroducaoJava.CrudJDBC.Service;

import IntroducaoJava.CrudJDBC.Dominio.Produto;
import IntroducaoJava.CrudJDBC.Repository.ProdutoRepository;
import lombok.extern.log4j.Log4j2;

import java.sql.SQLException;
import java.util.List;

@Log4j2
public class ProdutoService {
    public static void saveProduct(Produto produto) {
        ProdutoRepository.saveProduct(produto);
    }
    public static void deleteProduct(int id) {
        ProdutoRepository.deleteProduct(id);
    }
    public static List<Produto> findAll() throws SQLException {
        return ProdutoRepository.findAll();
    }

    public static List<Produto> findByName(String nome) {
        return ProdutoRepository.findByName(nome);
    }
    public static void updateProduct(Produto produto) {
        ProdutoRepository.updateProduct(produto);
    }

    public static void requireValidId(int id) {
        if (id <1) {
            throw new IllegalArgumentException("Insert a valid id for Product");
        }
    }

    public static void requireValidPrice(Double preco) {
        if (preco<0.1) {
            throw new RuntimeException("Invalid price for product");
        }

    }


}
