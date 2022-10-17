package JavaEELearning.com.example.JavaEELearning.Control;

import java.awt.Color;

import javax.enterprise.inject.Produces;
import javax.inject.Named;

public class DefaultColorExposer {

	@Produces
	@Diesel
	public Color exposeDefaultColor() {
		return Color.RED;
	}
}
