package JavaEELearning.com.example.JavaEELearning.Boundry;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import JavaEELearning.com.example.JavaEELearning.Entity.Car;

@Path("cars")
@Produces(MediaType.APPLICATION_JSON)
public class CarResource {
	
	@Inject
	carManufacturer carManufacturer;
	
	@GET
	public List<Car> retrieveCars(){
		return carManufacturer.retrieveCars();
		
	}

}
