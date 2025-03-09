package IntroducaoJava.Comportamentos.Test;

import IntroducaoJava.Comportamentos.Dominio.Car;
import IntroducaoJava.Comportamentos.Interfaces.CarPredicate;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//Vamos
public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = new ArrayList<>(List.of(new Car("green", 2011),
            new Car("pink", 2013),
            new Car("white", 1987),new Car("red", 1999)));

    public static void main(String[] args) {
//        List<Car> greenCars = filter(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return (car.getColor().equals("white")); //então basicamente criamos uma subClasse anônima da interface que tem este comportamento aqui.
//            }
//        });
//        System.out.println(greenCars);

        List<Car> greenCars = filter(cars, car -> car.getColor().equals("white")); //USANDO LAMBDAS PARA SIMPLIFICAR
        List<Car> redCars = filter(cars, car -> car.getColor().equals("red")); //USANDO LAMBDAS PARA SIMPLIFICAR
        List<Car> FilterByAge = filter(cars, car -> car.getYear()<(2011)); //USANDO LAMBDAS PARA SIMPLIFICAR
        System.out.println(FilterByAge);
        System.out.println(greenCars);
        System.out.println(redCars);

    }


    private static List<Car> filter(List<Car> cars, Predicate<Car> predicate) { //agora deixando o código muiot mais funcional e escalavel.
        List<Car> filteredCar = new ArrayList<>();        //usando polimorfimso
        for (Car car : cars) {
            if (predicate.test(car)) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }



}
