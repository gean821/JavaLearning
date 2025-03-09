package IntroducaoJava.Generics.Service;

import IntroducaoJava.Generics.Dominio.Carro;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
//é uma classe genérica.
public class RentalService<T> { //colocamos o T para mostrar que vamos trabalhar com um tipo de elemento que vamos passar na criação do objeto
    private List<T> objetosDisponiveis; //para apenas trocar o tipo de objeto e diminuir código. "barco,carro,moto..."


    public RentalService(List<T> objetosDisponiveis){ //criando construtor para obrigar a relacionar qual objeto vmos passar.
       this.objetosDisponiveis = objetosDisponiveis;

    }
            //MÉTODOS
        public T buscarObjetoDisponivel () {
            System.out.println("Buscando objeto disponivel");
            T type = objetosDisponiveis.removeFirst();
            System.out.println("Alugando objeto : " + type);
            System.out.println("Objetos disponiveis para alugar : ");
            System.out.println(objetosDisponiveis);
            return type;
        }

        public void retornarObjetoAlugado (T type){
            System.out.println("Devolvendo objeto : "+type);
            objetosDisponiveis.add(type);
            System.out.println("Objetos disponiveis para alugar : ");
            System.out.println(objetosDisponiveis);
        }

    }



