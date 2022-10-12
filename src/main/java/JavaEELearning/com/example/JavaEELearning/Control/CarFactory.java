package JavaEELearning.com.example.JavaEELearning.Control;

import java.util.UUID;

import JavaEELearning.com.example.JavaEELearning.Entity.Car;
import JavaEELearning.com.example.JavaEELearning.Entity.Specification;

public class CarFactory {
	public Car createCar(Specification specification) {
		Car car = new Car();
		car.setIdentifier(UUID.randomUUID().toString());
		car.setColor(specification.getColor());
		car.setEnginetype(specification.getEngineType());
		return car;
	}
	
}
