package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.Car;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
@Component
public class CarDaoImpl implements CarDao {
    @Transactional
    @Override
    public List<Car> listOfCars() {
        List<Car> listOfCars = new ArrayList<>();
        listOfCars.add(new Car("Citroen DS3", "Yellow", 2010));
        listOfCars.add(new Car("Jeep Wrangler", "Red", 1998));
        listOfCars.add(new Car("Ford", "Black", 2013));
        listOfCars.add(new Car("Fiat 123", "Pink", 2007));
        listOfCars.add(new Car("Vedro", "Grey", 1990));
        return listOfCars;
    }
}
