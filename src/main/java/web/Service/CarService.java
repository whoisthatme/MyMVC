package web.Service;

import org.springframework.stereotype.Service;
import web.Model.Car;

import java.util.List;

@Service
public interface CarService {
 List<Car> processCars(List<Car> cars, int count);
}
