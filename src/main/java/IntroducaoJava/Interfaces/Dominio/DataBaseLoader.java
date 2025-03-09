package IntroducaoJava.Interfaces.Dominio;
public class DataBaseLoader implements DataLoader,DataRemover { //trabalhando com interface utilizamos implements ao inves de extends
    @Override               //além disso eu posso implementar quantas classes eu quiser para interface.
    public void load() {
        System.out.println("carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("deletando dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissoes no banco de dados");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro de retrieveMaxDataSize na classe databaseLoadeer ");
    }    //por ser estatico eu nao consgio sobrescrevelo




}

