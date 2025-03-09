package IntroducaoJava.CrudJDBC.Repository;

import IntroducaoJava.CrudJDBC.Conn.ConnectionFactory2;
import IntroducaoJava.CrudJDBC.Dominio.Produto;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProdutoRepository {
    public static void saveProduct(Produto produto) {
        String sql = "INSERT INTO `mercado`.`produto` (`id`, `nome`, `preco`, `quantidade`) VALUES (?, ?, ?,?)";
        try (Connection conn = ConnectionFactory2.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, produto.getId());
            ps.setString(2, produto.getNome());
            ps.setDouble(3, produto.getPreco());
            ps.setInt(4, produto.getQuantidade());
            int rowsAffected = ps.executeUpdate();
            log.info("Product '{}' inserted with rows '{}' affected",produto.getId(),rowsAffected);
        } catch (SQLException e) {
            log.info("Cannot save Product '{}'", produto.getNome());
        }
    }

    public static void deleteProduct(int id) {
        String sql = "DELETE FROM `mercado`.`produto` WHERE id = ?";
        try (Connection conn = ConnectionFactory2.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            int rowsAffected = ps.executeUpdate();
            log.info("product id '{}' deleted with total rows affected '{}'",id,rowsAffected );
        } catch (SQLException e) {
            log.info("Cannot delete product id '{}'", id);
        }
    }

    public static List<Produto> findAll() throws SQLException {
        log.info("Finding all products:");
        String sql = "SELECT id, nome, preco ,quantidade FROM mercado.produto;";
        List<Produto> produtos = new ArrayList<>();
        try (Connection conn = ConnectionFactory2.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Produto produto = Produto.builder()
                        .id(rs.getInt("id"))
                        .nome(rs.getString("nome"))
                        .preco(rs.getDouble("preco"))
                        .quantidade(rs.getInt("quantidade"))
                        .build();
                produtos.add(produto);
            }
        } catch (SQLException e) {
                log.error("Error trying to show all Products",e);
          }
        return produtos;
    }
    public static List<Produto> findByName(String nome) {
        String sql = "SELECT * FROM mercado.produto WHERE nome like ? ";
        List<Produto> produtosName = new ArrayList<>();
        try(Connection conn = ConnectionFactory2.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,String.format("%%%s%%",nome));
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Produto produto = Produto.builder()
                        .nome(rs.getString("nome"))
                        .id(rs.getInt("id"))
                        .build();
                produtosName.add(produto);
            }
            return produtosName;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void updateProduct(Produto produto) {
        String sql = "UPDATE mercado.produto SET id = ?, nome = ?, preco = ?, quantidade = ? WHERE id = ?";
        try (Connection conn = ConnectionFactory2.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,produto.getId());
            ps.setString(2,produto.getNome());
            ps.setDouble(3,produto.getPreco());
            ps.setInt(4,produto.getQuantidade());
            ps.setInt(1,produto.getId());
            int rowsAffected = ps.executeUpdate();
            log.info("Updated product name '{}' from row '{}'", produto.getNome(),rowsAffected);
        } catch (SQLException e) {
            log.error("error trying to update product '{}'", produto.getNome(),e);
        }

    }

}

        








