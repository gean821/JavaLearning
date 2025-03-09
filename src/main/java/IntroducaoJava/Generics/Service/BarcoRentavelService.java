package IntroducaoJava.Generics.Service;

import IntroducaoJava.Generics.Dominio.Barco;

import java.util.ArrayList;
import java.util.List;

    public class BarcoRentavelService {
        private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("lancha"), new Barco("Iate")));

        public Barco buscarBarcoDisponivel () {          //Retorna um Barco porque o objetivo dessa função é buscar um Barco disponível e entregá-lo para quem solicitou.
                                                            //Não recebe parâmetros porque a busca não depende de um Barco específico, mas sim do primeiro Barco disponível na lista.
                                                            // Resumo: Essa função fornece um Barco ao chamador, então retorna um Barco e não precisa receber parâmetros.
            System.out.println("Buscando Barco disponivel");
            Barco Barco = barcosDisponiveis.removeFirst();
            System.out.println("Alugando Barco : " + Barco);
            System.out.println("Barcos disponiveis para alugar : ");
            System.out.println(barcosDisponiveis);
            return Barco;
        }

        public void retornarBarcoAlugado (Barco Barco){
            System.out.println("Devolvendo Barco:" + Barco);
            barcosDisponiveis.add(Barco);
            System.out.println("Barcos disponiveis para alugar : ");
            System.out.println(barcosDisponiveis);
        }

    }
    /*
Recebe um Barco como parâmetro porque quem chamou essa função já tem um Barco alugado e agora precisa devolvê-lo.
Não retorna nada (void) porque o objetivo é somente adicionar o Barco de volta à lista, e não há necessidade de um retorno.
🔹 Resumo: Essa função recebe um Barco para devolução, então precisa do parâmetro Barco Barco, mas não precisa retornar nada.
*/




