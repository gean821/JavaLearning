package IntroducaoJava.Interfaces.Dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10; // todos atributos em interface sao constatnes
    public abstract void load();

    public default void checkPermission() { //quando nao queremos que o método nao seja obrigatório para outras classes usamos default
        System.out.println("fazendo checagem de permissoes");
    }


    public static void retrieveMaxDataSize() {
        System.out.println("Dentro de retrieveMaxDataSize na interface ");
    }


}





              //ele sempre é abstrato os métodos de uma interface.
