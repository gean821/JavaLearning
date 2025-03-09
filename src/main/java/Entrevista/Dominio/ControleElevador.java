package Entrevista.Dominio;

public class ControleElevador {
    private  boolean [] botoes;

    public ControleElevador(int totalAndares) {
        this.botoes = new boolean[totalAndares];
    }

    public void selecionaBotao(int andar) {
        if (andar >= 1 && andar <= botoes.length) {
            botoes[andar - 1] = true;
            System.out.println("Botão pressionado para o andar : " + andar);
        }
    }
    public boolean [] getBotoes() {
        return this.botoes;
    }

}

