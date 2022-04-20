package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;


import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/")
public class CarsController {

//    private CarService carService;
//    @Autowired
//    public CarsController(CarService carService) {
//        this.carService = carService;
//    }

    private Car car;
    @GetMapping(value = "cars")
    public String listOfCars(@RequestParam (required = false, defaultValue = "5", value = "count") int a, ModelMap model) {
        List<Car> listOfCars = new ArrayList<>();
        listOfCars.add(new Car("Citroen DS3", "Yellow", 2010));
        listOfCars.add(new Car("Jeep Wrangler", "Red", 1998));
        listOfCars.add(new Car("Ford", "Black", 2013));
        listOfCars.add(new Car("Fiat 123", "Pink", 2007));
        listOfCars.add(new Car("Vedro", "Grey", 1990));

        if (a >= 0 && a < 5) {
            model.addAttribute("listOfCars", listOfCars.subList(0, a));
        } else {
            model.addAttribute("listOfCars", listOfCars);
        }
        return "cars";
    }

}
