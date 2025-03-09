package Entrevista.Dominio;

import java.util.LinkedList;
import java.util.Queue;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private boolean[] chamadas;
    private Queue<Integer> andaresChamados; //fila armazenando os andares chamados antes


    public Elevador(int totalAndares) {
        this.totalAndares = totalAndares;
        this.chamadas = new boolean[totalAndares];
        this.andarAtual = 1;
        this.andaresChamados = new LinkedList<>();

    }

    public void chamarElevador(int andar) {
        //registrando a chamada do elevador
        if (andar >= 1 && andar <= totalAndares) {
            chamadas[andar - 1] = true;
            andaresChamados.add(andar);
            System.out.println("Elevador chamado para o andar : " + andar);

        }
    }

    public void mover() {  //simulando o movimento do elevador.
        if (andaresChamados.isEmpty()) {
            System.out.println("Elevador retornado ao andar 1.");
            andarAtual = 1;
            return;
        }
        while (!andaresChamados.isEmpty()) {
            int proximoAndar = andaresChamados.poll(); //retirando proximo andar da fila
            System.out.println("Elevador movendo para o andar : " + proximoAndar);
            andarAtual = proximoAndar;
        }
        System.out.println("Elevador retornando para o andar 1.");
        andarAtual = 1;
    }

        public int getAndarAtual () {
            return this.andarAtual;
        }

        public int getTotalAndares () {
            return this.totalAndares;
        }

        public void setTotalAndares ( int totalAndares){
            this.totalAndares = totalAndares;
        }

        public boolean[] getChamadas () {
            return this.chamadas;
        }
    }
















