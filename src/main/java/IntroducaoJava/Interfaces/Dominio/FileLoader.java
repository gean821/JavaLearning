package IntroducaoJava.Interfaces.Dominio;

public class FileLoader implements DataLoader,DataRemover {
    @Override //preciso obrigatoriamente criar um metodo implementado
    public void load() {
        System.out.println("carregando dados de um arquivo");

    }

    @Override
    public void remove() {
        System.out.println("deletando dados do arquivo");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando dados de um arquivo");
    }
}


