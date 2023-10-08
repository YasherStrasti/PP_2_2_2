package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private List<Car> carsList;
    private static int count;

    {
        carsList  = new ArrayList<>();
        carsList.add(new Car("Lada", 1_000_000, count++));
        carsList.add(new Car("BMW", 5_200_000, count++));
        carsList.add(new Car("Lexus", 10_000_000, count++));
        carsList.add(new Car("Mercedes", 20_000_000, count++));
        carsList.add(new Car("Volga", 300_000, count++));
        carsList.add(new Car("Kia", 7_000_000, count++));
    }

    public List<Car> getAllCars() {
        return carsList;
    }

    public List<Car> getCars(Integer count) {
        List<Car> carList = new ArrayList<>();
        System.out.println(count);

        if (count != null && count < 5 && count > 0) {
            for (int i = 0; i < count; i++) {
                carList.add(getAllCars().get(i));
            }
            return carList;
        } else {
            return new ArrayList<>();
        }
    }
}
