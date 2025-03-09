package IntroducaoJava.Lambdas.Test;

import IntroducaoJava.Comportamentos.Dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdasTest01 {
    private static List<Car> cars = new ArrayList<>(List.of(new Car("green", 2011),
            new Car("pink", 2013),
            new Car("white", 1987), new Car("red", 1999)));


    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, car -> car.getColor().equals("white"));
        System.out.println(greenCars);

        List<Car> redCars = filter(cars, car -> car.getYear()<2011);
        System.out.println(redCars);

        List<Integer> numeros = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        System.out.println(filter(numeros, num -> num %2==0)); //então usando uma lambda aqui, nos fazemos tudo de uma vez.
        //nos pegamos o nome da lista (numeros, damos um nome para ela em seguida(num -> e fazemos nossa lógica de negócio.

    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filter = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                filter.add(e);
            }
        }
        return filter;
    }
}


