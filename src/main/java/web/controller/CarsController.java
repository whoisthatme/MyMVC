package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.Service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    @Autowired
    private CarService carService;
    List<Car> output = new ArrayList<>();
    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(required = false, defaultValue = "5") int count, Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", 1, 2020));
        cars.add(new Car("Honda", 2, 2019));
        cars.add(new Car("Ford", 3, 2018));
        cars.add(new Car("Chevrolet", 4, 2017));
        cars.add(new Car("Nissan", 5, 2016));
        output = carService.processCars(cars,count);
        model.addAttribute("cars", output);
        return "cars";
    }
}
