package Entrevista.Dominio;

public class Andar {
    private int numeroAndar;

    public Andar (int numeroAndar) {
        this.numeroAndar = numeroAndar;
    }

    public void pressionarBotaoChamado(Elevador elevador) {
        System.out.println("Botao de chamada pressionado no Andar  " + numeroAndar);
        elevador.chamarElevador(numeroAndar);

    }


    public int getNumeroAndar() {
        return numeroAndar;
    }



}



