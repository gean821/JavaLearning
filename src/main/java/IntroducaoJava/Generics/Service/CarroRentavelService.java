package IntroducaoJava.Generics.Service;
//vamos imaginar que estmaos fazendo uma classe que vai alugar um carro ou barco.

import IntroducaoJava.Generics.Dominio.Carro;
import java.util.ArrayList;
import java.util.List;

//simulando um banco de dados de carro usando um array list normal
public class CarroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("Fiat uno"), new Carro("Mercedes")));

        public Carro buscarCarroDisponivel () {          //Retorna um Carro porque o objetivo dessa função é buscar um carro disponível e entregá-lo para quem solicitou.
                                                            //Não recebe parâmetros porque a busca não depende de um carro específico, mas sim do primeiro carro disponível na lista.
                                                                                                      // Resumo: Essa função fornece um carro ao chamador, então retorna um Carro e não precisa receber parâmetros.
            System.out.println("Buscando carro disponivel");
            Carro carro = carrosDisponiveis.removeFirst();
            System.out.println("Alugando carro : " + carro);
            System.out.println("Carros disponiveis para alugar : ");
            System.out.println(carrosDisponiveis);
            return carro;
        }

        public void retornarCarroAlugado (Carro carro){
            System.out.println("Devolvendo carro:" + carro);
            carrosDisponiveis.add(carro);
            System.out.println("Carros disponiveis para alugar : ");
            System.out.println(carrosDisponiveis);
        }

    }
    /*
Recebe um Carro como parâmetro porque quem chamou essa função já tem um carro alugado e agora precisa devolvê-lo.
Não retorna nada (void) porque o objetivo é somente adicionar o carro de volta à lista, e não há necessidade de um retorno.
🔹 Resumo: Essa função recebe um carro para devolução, então precisa do parâmetro Carro carro, mas não precisa retornar nada.
*/


