package JavaEELearning.com.example.JavaEELearning.Control;

import javax.enterprise.event.Observes;

import JavaEELearning.com.example.JavaEELearning.Entity.CarCreated;

public class CarCreationListener {
	
	public void onCarCreation(@Observes CarCreated carCreated) {
		System.out.println("New Car Created with ID: "+carCreated.getIdentifier());
	}

}
