package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Lada", 666, "green"));
        cars.add(new Car("Audi", 123, "white"));
        cars.add(new Car("MB", 456, "grey"));
        cars.add(new Car("BMW", 789, "black"));
        cars.add(new Car("KIA", 987, "yellow"));
        cars.add(new Car("UAZ", 654, "grey"));
        cars.add(new Car("ZAZ", 321, "orange"));
    }


    @Override
    public List<Car> getCars(int count) {
        if (count < 5) return cars.subList(0, count);
        return cars;
    }
}
