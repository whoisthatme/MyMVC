package web.Service;

import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{
    public List<Car> processCars(List<Car> cars, int count) {
        if (cars.size() >= count) {
            return cars.subList(0, count);
        } else {
            return cars;
        }

    }
}
