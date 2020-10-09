package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {
    private List<Car> cars;

    @Override
    public List<Car> getCarsList() {
        cars = new ArrayList<>();
        cars.add(new Car("BMW 5E39", "WBADR39xxxxx", 2001));
        cars.add(new Car("BMW 3E46", "WBADR46xxxxx", 2003));
        cars.add(new Car("BMW 5E61", "WBADR66xxxxx", 2005));
        cars.add(new Car("BMW 3E90", "WBADR96xxxxx", 2009));
        cars.add(new Car("BMW 3F30", "WBADR36xxxxx", 2015));
        return cars;
    }

    @Override
    public List<Car> getCarsListByCount(int count) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            cars.add(getCarsList().get(i));
        }
        return cars;
    }
}
