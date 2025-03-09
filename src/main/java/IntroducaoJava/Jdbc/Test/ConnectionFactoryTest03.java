package IntroducaoJava.Jdbc.Test;

import IntroducaoJava.Jdbc.Dominio.Producer;
import IntroducaoJava.Jdbc.Service.ProducerService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConnectionFactoryTest03 {
    public static void main(String[] args) throws SQLException {
        Producer producer1 = Producer.builder()
                .name("Biosoft").build();
        Producer producer2 = Producer.builder()
                .name("Slack").build();
        Producer producer3 = Producer.builder()
                .name("Treetech").build();

        ProducerService.saveTransaction(List.of(producer1,producer2,producer3)); //ele não salva automaticamente no SQL.

    }
}
