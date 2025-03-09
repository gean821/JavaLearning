package IntroducaoJava.Generics.Test;
//EXERCICIO Feito
import java.util.ArrayList;
import java.util.List;


    abstract  class Farmacia {
        public abstract void tomandoRemedio();

    }
    class Dipirona extends Farmacia {
        @Override
        public void tomandoRemedio() {
            System.out.println("Tomando dipirona.");
        }
    }

    class Paracetamol extends Farmacia {
        @Override
        public void tomandoRemedio() {
            System.out.println("Tomando remédio.");
        }
    }



public class WildCardTest03 {

    public static void main(String[] args) {
        List<Dipirona> dipironas = new ArrayList<>();
        dipironas.add(new Dipirona());
        dipironas.add(new Dipirona());
        List<Paracetamol> paracetamols = new ArrayList<>();
        paracetamols.add(new Paracetamol());
        paracetamols.add(new Paracetamol());
        TomaRemedio(dipironas);
        TomaRemedio(paracetamols);



    }
    private static void TomaRemedio(List<? extends Farmacia> farmacias) {
        for (Farmacia farmacia : farmacias) {
           farmacia.tomandoRemedio();
        }

    }


}
