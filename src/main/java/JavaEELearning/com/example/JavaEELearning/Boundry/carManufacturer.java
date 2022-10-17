package JavaEELearning.com.example.JavaEELearning.Boundry;

import java.util.UUID;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;

import JavaEELearning.com.example.JavaEELearning.Control.CarFactory;
import JavaEELearning.com.example.JavaEELearning.Control.CarRepository;
import JavaEELearning.com.example.JavaEELearning.Entity.Car;
import JavaEELearning.com.example.JavaEELearning.Entity.CarCreated;
import JavaEELearning.com.example.JavaEELearning.Entity.Specification;

@Stateless
public class carManufacturer {

	
	@Inject
	CarFactory carFactory;
	@Inject
	CarRepository carRepository;
	
	@Inject
	Event<CarCreated> carCreated;
	
	
	public Car manufatureCar(Specification specification) {
		Car car = carFactory.createCar(specification);
		carRepository.store(car);
		carCreated.fire(new CarCreated(car.getIdentifier()));
		return car;

	}
	
	public List<Car> retrieveCars(){
		return carRepository.loadCars();
	}
	
	
}
