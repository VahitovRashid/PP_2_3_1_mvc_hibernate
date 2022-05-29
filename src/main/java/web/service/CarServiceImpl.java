package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> listCars(Integer i) {
        List<Car> cars = new ArrayList<>();
        Car car1 = new Car(111, "BMW", "Black");
        Car car2 = new Car(222, "Audi", "White");
        Car car3 = new Car(333, "Mersedes", "Red");
        Car car4 = new Car(444, "WV", "Blue");
        Car car5 = new Car(555, "Opel", "Grey");
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        cars = cars.subList(0, i);

        return cars;
    }
}
