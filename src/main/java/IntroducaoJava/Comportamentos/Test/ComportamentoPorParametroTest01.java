package IntroducaoJava.Comportamentos.Test;

import IntroducaoJava.Comportamentos.Dominio.Car;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = new ArrayList<>(List.of( //criando a lista.
            new Car("preto", 2013),
            new Car("white", 1990),
            new Car("red", 2019),
            new Car("pink",2011)));



    public static void main(String[] args) {
        System.out.println(filterBlackCars(cars));
        System.out.println(filterCarByColor(cars,"white")); //agora deixando o código muito mais funcional.
        System.out.println(filterCarByColor(cars,"pink"));
        System.out.println("------------");
        System.out.println(filterCarByAge(cars,2015));

    }


    private static List<Car> filterBlackCars(List<Car> cars) {
        List<Car> blackCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("preto")) {
                blackCars.add(car);
            }
        }
        return blackCars;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color) { //agora deixando o código muiot mais funcional e escalavel.
        List<Car> carsByColor = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                carsByColor.add(car);
            }
        }
        return carsByColor;
    }
    private static List<Car> filterCarByAge(List<Car> cars, int year) { //agora deixando o código muiot mais funcional e escalavel.
        List<Car> carsByAge = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                carsByAge.add(car);
            }
        }
        return carsByAge;
    }

}







