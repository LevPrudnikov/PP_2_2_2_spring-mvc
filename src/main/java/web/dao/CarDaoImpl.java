package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao{
    private final List<Car> cars = Arrays.asList(
        new Car("Lada", 666, "green"),
        new Car("Audi", 123, "white"),
        new Car("MB", 456, "grey"),
        new Car("BMW", 789, "black"),
        new Car("KIA", 987, "yellow")
    );

    @Override
    public List<Car> getCars(int count) {
        System.out.println("getCars method " + count);
        return cars.subList(0, count);
    }

    @Override
    public List<Car> getAllCars() {
        System.out.println("getAllCars method");
        return cars;
    }
}
