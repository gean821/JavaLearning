package IntroducaoJava.Jdbc.Test;
//camada de vista
import IntroducaoJava.Jdbc.Dominio.Producer;
import IntroducaoJava.Jdbc.Service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

//agora sim de fato chamando o connectorFactory e pega
//conexao
@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
      // Producer producer = Producer.builder().name("Amazon").id(40).build();
        //ProducerService.save(producer); //eu posso trocar aqui o nome e passar por parametro para SQL e usar a mesma variavel, e assim ir criando
        //ProducerService.delete();
        Producer producerToUpdate = Producer.builder()
                .name("EA SPORTS updateToPreparedStt").id(1)
                .build();
               // ProducerService.update(producerToUpdate);
        List<Producer> producers = ProducerService.findAll();
        System.out.println("Producers found : "+producers);

        //List<Producer> producers2 = ProducerService.findByName("e"); //para buscar um nome abreviado, ele puxa EA sports que já está no banco de dados.
        //System.out.println("Name founded : "+producers2);
        //ProducerService.showProducerMetadata();
        //ProducerService.showDriverMetaData();
        //ProducerService.showTypeScrollSensitiveWorking();

        //ProducerService.findByNameAndUpdate("Ama");
        System.out.println(ProducerService.findByNamePreparedStatement("Ama"));
        ProducerService.updatePrepareStatement(producerToUpdate);

    }
}

//entao agora eu crio de forma dinâmica, onde se eu quiser
// outro producer é só criar outro objeto
// e passar para o método save
