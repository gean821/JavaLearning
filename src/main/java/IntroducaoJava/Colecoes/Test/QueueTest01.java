package IntroducaoJava.Colecoes.Test;
/*
 EXPLICAÇÃO : A interface Queue em Java representa uma fila, seguindo o conceito FIFO (First-In, First-Out)—ou seja, o primeiro elemento inserido é o primeiro a ser removido.
 📌 Principais implementações de Queue:
 🔹 LinkedList<E> → Implementação simples baseada em lista encadeada.
 🔹 PriorityQueue<E> → Uma fila onde os elementos são ordenados por prioridade.
 🔹 ArrayDeque<E> → Uma fila baseada em um array redimensionável, eficiente para adição e remoção nas extremidades.
 🚀 Principais Métodos de Queue
 Os métodos principais para manipular uma Queue são:
 Método	Descrição
 * add(E e)	Adiciona um elemento e lança exceção se a fila estiver cheia.
 * offer(E e)	Adiciona um elemento e retorna false se a fila estiver cheia.
 * remove()	Remove o primeiro elemento e lança exceção se a fila estiver vazia.
 * poll()	Remove o primeiro elemento e retorna null se a fila estiver vazia.
 * element()	Retorna o primeiro elemento sem removê-lo, lança exceção se vazio.
 * peek()	Retorna o primeiro elemento sem removê-lo, retorna null se vazio.
*/

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<Integer> andar = new PriorityQueue<>();
        andar.add(1);
        andar.add(4);
        andar.add(5);
        andar.add(9);
        andar.add(15);
        System.out.println("Fluxo do andar "+andar); //usando direto
        System.out.println("--- POR FOR---");
        for (Integer fila : andar) {
          System.out.println(fila);
      }
        Queue<Integer> andar2 = new PriorityQueue<>();
        andar2.add(4);
        andar2.add(2);
        andar2.add(9);
        andar2.add(0);

        System.out.println("------------");
        while(!andar2.isEmpty()) { // se nao está vazia.
            System.out.println(andar2.remove()); //remove primeiro elemento
        }



    }
}

