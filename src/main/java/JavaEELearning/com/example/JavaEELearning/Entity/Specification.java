package JavaEELearning.com.example.JavaEELearning.Entity;

public class Specification {
	
	private final Color color;
	private final EngineType engineType;
	
	public Specification(Color color, EngineType engineType) {
		super();
		this.color = color;
		this.engineType = engineType;
	}

	public Color getColor() {
		return color;
	}

	public EngineType getEngineType() {
		return engineType;
	}
	
	
	

}
