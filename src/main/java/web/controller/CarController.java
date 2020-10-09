package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public String printCarsByCount(@RequestParam(value = "count", required = false, defaultValue = "5") Integer count, ModelMap model) {
        List<Car> cars;

        if (count > 0 && count < 5) {
            cars = carService.getCarsListByCount(count);

        } else {
            cars = carService.getCarsList();
        }
        model.addAttribute("cars", cars);

        return "cars";
    }
}
