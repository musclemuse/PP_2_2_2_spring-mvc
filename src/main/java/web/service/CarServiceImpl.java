package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class CarServiceImpl implements CarService  {
    @Autowired
    private CarDao carDao;
    @Transactional
    public List<Car> listOfCars() {
        return carDao.listOfCars();
    }
}
