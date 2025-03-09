package IntroducaoJava.Jdbc.Service;
//camada de regra de negócio
import IntroducaoJava.Jdbc.Dominio.Producer;
import IntroducaoJava.Jdbc.repository.ProducerRepository;

import java.sql.SQLException;
import java.util.List;

public class ProducerService {
    public static void save(Producer producer) {
        requireValidId(producer.getId());
        ProducerRepository.save(producer); //como ele é estático posso chamar o método direto.

    }
    public static void saveTransaction(List<Producer> producers) throws SQLException {
        ProducerRepository.saveTransaction(producers);

    }

    public static void delete(Integer id) {
        requireValidId(id);
        ProducerRepository.delete(id);
    }

    public static void update(Producer producer) {
        requireValidId(producer.getId());
        ProducerRepository.update(producer);
    }
    public static void updatePrepareStatement(Producer producer) {
        requireValidId(producer.getId());
        ProducerRepository.updatePreparedStatement(producer);
    }

    public static List<Producer> findAll() {
        return ProducerRepository.findAll();

    }

    public static List<Producer> findByName(String name) {
        requireValidName(name);
        return ProducerRepository.findByName(name);
    }
    public static void showProducerMetadata () {
        ProducerRepository.showProducerMetaData();

    }
    public static void showDriverMetaData() {
        ProducerRepository.showDriverMetaData();
    }
    public static void showTypeScrollSensitiveWorking() {
        ProducerRepository.showTypeScrollWorking();
    }
    public static void findByNameAndUpdate(String name) {
        ProducerRepository.findByNameAndUpdate(name);
    }
    public static List<Producer> findByNamePreparedStatement(String name) {
        requireValidName(name);
        return ProducerRepository.findByNamePreparedStatement(name);

    }

    private static void requireValidId(Integer id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("invalid Id value");
        }
    }


    private static void requireValidName(String name) {
        if (name == null ) {
            throw new IllegalArgumentException("Illegal name used.");
        }
    }

}


//faço uma camada a mais disso para manter o modelo
//MVC