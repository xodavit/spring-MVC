package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {

    List<Car> getCarsList();

    List<Car> getCarsListByCount(int count);

}
