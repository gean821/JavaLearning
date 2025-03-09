package IntroducaoJava.Jdbc.repository;
//criamos essa classe repositorio
//para salvar esta classe no SQL.
//ESTA É A CAMADA DO BANCO DE DADOS.

import IntroducaoJava.Jdbc.Conn.ConnectionFactory;
import IntroducaoJava.Jdbc.Dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Log4j2 //ele substitui o sout por log que tem um desempenho muito melhor
public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`Producer` (`name`) VALUES ('%s');".formatted(producer.getName()); //pego esse código via SQL e insiro via Java
        try (Connection conn = ConnectionFactory.getconnection(); //pegamos a conexao e precisamos do Statement para alterar os dados do banco.
             Statement stmt = conn.createStatement()) { //pegamos o statement atraves do objeto da conexão
            int rowsAffected = stmt.executeUpdate(sql); //atualiza dados.
            log.info("Inserted producer '{}' in the DataBase rows affected by this change : '{}' ", producer.getName(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}' ", producer.getName(), e); //o e faz a função do e.stackTrace.

        }
    }

    public static void saveTransaction(List<Producer> producers) throws SQLException {
        try (Connection conn = ConnectionFactory.getconnection()) {
            conn.setAutoCommit(false); //faz com que o banco nao salve mais automatic. todas sql que mando
            psSaveTransaction(conn,producers);
            conn.commit(); //agora sim ele salva depois de terminar.
        } catch (SQLException e) {
            log.error("Error while to save producers '{}' ", producers, e);
        }
    }





    public static void psSaveTransaction(Connection conn, List<Producer> producers) throws SQLException {
        String sql = "INSERT INTO `anime_store`.`Producer` (`name`) VALUES ( ? );"; //pego esse código via SQL e insiro via Java
        boolean shouldRollback = false;
        for (Producer p : producers) {
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                log.info("Saving producer '{}'", p.getName());
                if (p.getName().equals("Biosoft")) throw  new IllegalArgumentException("cant save Biosoft");
                ps.setString(1, p.getName()); //crio cada um dos producers e passo pelo for.
                ps.execute();
            } catch (SQLException e) {
                e.printStackTrace();
                shouldRollback = true;
            }
        }
        if (shouldRollback) {
            log.warn("Transaction is going to be rollback");
            conn.rollback();
        }
    }


    public static void delete(int id) {
        String sql = "DELETE FROM `anime_store`.`Producer` WHERE (%d);".formatted(id);
        try (Connection conn = ConnectionFactory.getconnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Deleted producer ID '{}' from the dataBase with rows affected by this change '{}' : ", id, rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to delete Id producer '{}' ", id, e);
        }
    }

    public static void update(Producer producer) {
        String sql = "UPDATE `anime_store`.`Producer` SET `name` = '%s ' WHERE (%d);"
                .formatted(producer.getName(), producer.getId());
        try (Connection conn = ConnectionFactory.getconnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Updated producer Id '{}' from the dataBase with rows affected by this change '{}' : '", producer.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}' ", producer, e);
        }
    }

    public static void updatePreparedStatement(Producer producer) {
        try (Connection conn = ConnectionFactory.getconnection();
             PreparedStatement ps = createPsUpdate(conn, producer)) {
            int rowsAffected = ps.executeUpdate();
            log.info("Updated producer Id '{}' from the dataBase with rows affected by this change '{}' : '", producer.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}' ", producer.getName(), e);
        }
    }


    private static PreparedStatement createPsUpdate(Connection conn, Producer producer) throws SQLException {
        String sql = "UPDATE `anime_store`.`Producer` SET `name` = ? WHERE ('id' = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getId());
        return ps;
    }


    public static List<Producer> findAll() {
        log.info("Finding all producers");
        String sql = "SELECT id, name FROM anime_store.Producer;";
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getconnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) { //PRECISA ESTAR DENTRO DE UM WHILE.
            while (rs.next()) { //enquanto ele tiver proximo, cria o objeto.
                Producer producer = Producer.builder()
                        .id(rs.getInt("id")) // Obtém o valor da coluna "id"
                        .name(rs.getString("name")) // Obtém o valor da coluna "name"
                        .build();
                producers.add(producer); // Adiciona o objeto à lista
            }
        } catch (SQLException e) {
            log.error("Error while trying to find producer ", e);
        }
        return producers;
    }


    public static List<Producer> findByName(String name) {
        String sql = "SELECT * FROM anime_store.Producer where name like '%%%s%%';".formatted(name);
        List<Producer> producersName = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getconnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) { //PRECISA ESTAR DENTRO DE UM WHILE.
            while (rs.next()) { //enquanto ele tiver proximo, cria o objeto.
                Producer producer = Producer.builder()
                        .name(rs.getString("name")).id(rs.getInt("id")) // Obtém o valor da coluna "name"
                        .build();
                producersName.add(producer); // Adiciona o objeto à lista
            }
        } catch (SQLException e) {
            log.error("Error while trying to findName producer ", e);
        }
        return producersName;
    }

    public static List<Producer> findByNamePreparedStatement(String name) {
        log.info("Finding producer by name : ");
        List<Producer> producersName = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getconnection();
             PreparedStatement ps = createPreparedStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Producer producer = Producer.builder()
                        .name(rs.getString("name")).id(rs.getInt("id")) // Obtém o valor da coluna "name"
                        .build();
                producersName.add(producer); // Adiciona o objeto à lista
            }
        } catch (SQLException e) {
            log.error("Error while trying to findName producer ", e);
        }
        return producersName;
    }

    private static PreparedStatement createPreparedStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.Producer where name like ?;"; //agora fica assim usando PS.
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;

    }


    public static void showProducerMetaData() { //Neste cenário, o ResultSet e ResultSetMetaData são essenciais para
        log.info("Showing producer Metadata : "); //obter as informações sobre as colunas da tabela, mas ele não é usado para manipular dados, apenas para leitura de metadados.
        String sql = "SELECT * FROM anime_store.Producer"; //para selecionar tdos.
        try (Connection conn = ConnectionFactory.getconnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) { //PRECISA ESTAR DENTRO DE UM WHILE.
            ResultSetMetaData rsMetaData = rs.getMetaData();//para pegar os metaDados
            int columnCount = rsMetaData.getColumnCount();//pega quantidade de colunas
            log.info("columns count : '{}'", columnCount);
            for (int i = 1; i <= columnCount; i++) {
                log.info("Table name '{}' ", rsMetaData.getTableName(i));
                log.info("Column name '{}' ", rsMetaData.getColumnName(i));
                log.info("Column size '{}'", rsMetaData.getColumnDisplaySize(i));
                log.info("Column type '{}'", rsMetaData.getColumnTypeName(i));
            }

        } catch (SQLException e) {
            log.error("Error while trying to findName producer ", e);
        }


    }


    public static void showDriverMetaData() { //mas ele é mais voltado para obter informações sobre o driver de banco de dados e suas capacidades,
        log.info("Showing driver Metadata : ");
        String sql = "SELECT * FROM anime_store.Producer"; //para selecionar tdos.
        try (Connection conn = ConnectionFactory.getconnection()) {
            DatabaseMetaData dbMetaData = conn.getMetaData();
            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                log.info("Supports TYPE_FORWARD_ONLY");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And supports CONCUR_UPDATE");
                }
            }
            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) { //significa que posso navegar de cima para baixo. e nao atualiza dados em tempo real
                log.info("Supports TYPE_SCROLL_INSENSITIVE");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And supports CONCUR_UPDATE");
                }
            }
            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) { //significa que se alguem mexer no banco de dados enquanto navega, ele mostra o resultado na hora.
                log.info("Supports TYPE_SCROLL_SENSITIVE");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And supports CONCUR_UPDATE");
                }
            }

        } catch (SQLException e) {
            log.error("Error while trying to findName producer ", e);
        }
    }

    public static void showTypeScrollWorking() {
        String sql = "SELECT * FROM anime_store.Producer";
        try (Connection conn = ConnectionFactory.getconnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE); //falamos qual resultSet queremos trabalhar.
             ResultSet rs = stmt.executeQuery(sql)) {
            log.info("Last row '{}'", rs.last());
            log.info("row number '{}'", rs.getRow());
            Producer producer = Producer.builder()
                    .name(rs.getString("name")).id(rs.getInt("id")) // Obtém o valor da coluna "name"
                    .build();
            log.info(producer);

            log.info("first Row '{}', row number '{}'", rs.first(), rs.getRow());
            log.info(Producer.builder()
                    .name(rs.getString("name")).id(rs.getInt("id")) // Obtém o valor da coluna "name"
                    .build());

            log.info("row Absolute ? '{}'", rs.absolute(2));
            log.info("row number  '{}'", rs.getRow());
            log.info(Producer.builder()
                    .name(rs.getString("name")).id(rs.getInt("id")) // Obtém o valor da coluna "name"
                    .build());

            log.info("row relative ? '{}'", rs.relative(-1));
            log.info("row number '{}'", rs.getRow());
            log.info(Producer.builder()
                    .name(rs.getString("name")).id(rs.getInt("id")) // Obtém o valor da coluna "name"
                    .build());

            log.info("is last '{}'", rs.isLast());
            log.info("row number '{}", rs.getRow());

            log.info("is first '{}", rs.isFirst());
            log.info("row number '{}", rs.getRow());

            log.info("Last row '{}'", rs.last());
            log.info("row number '{}'", rs.getRow());
            log.info("-----------");
            while (rs.previous()) { //para ir debaixo para cima.
                log.info(Producer.builder()
                        .name(rs.getString("name")).id(rs.getInt("id")) // Obtém o valor da coluna "name"
                        .build());
            }


        } catch (SQLException e) {
            log.error("Error while trying to findName producer ", e);
        }
    }

    public static List<Producer> findByNameAndUpdate(String name) { //usando resultSet para atualizar, porém update é melhor.
        log.info("Finding and updating to UpperCase");
        String sql = "SELECT * FROM anime_store.Producer;";
        List<Producer> producersName = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getconnection();
             Statement stmt = conn.createStatement((ResultSet.TYPE_SCROLL_INSENSITIVE), ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) { //PRECISA ESTAR DENTRO DE UM WHILE.
            while (rs.next()) { //enquanto ele tiver proximo, cria o objeto.
                rs.updateString("name", rs.getString("name").toUpperCase());
                rs.updateRow();
                Producer producer = Producer.builder()
                        .name(rs.getString("name")).id(rs.getInt("id")) // Obtém o valor da coluna "name"
                        .build();
                producersName.add(producer); // Adiciona o objeto à lista
            }
        } catch (SQLException e) {
            log.error("Error while trying to findName producer ", e);
        }
        return producersName;
    }
}




//O que está acontecendo aqui é //O método formatted():
// ele substitui o %s pelo valor //que você passar para ele,
// neste caso, o valor do name do objeto producer. Ou seja,
//o nome do produtor será inserido no banco de dados
// , não um valor fixo como "T-Bag".