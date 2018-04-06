package pl.codemakesfun.builder.entities;

public class WindTurbine {
	private Generator generator;
	private Rotor rotor;
	private Tower tower;
	
	public Generator getGenerator() {
		return generator;
	}
	
	public void setGenerator(Generator generator) {
		this.generator = generator;
	}
	
	public Rotor getRotor() {
		return rotor;
	}
	
	public void setRotor(Rotor rotor) {
		this.rotor = rotor;
	}
	
	public Tower getTower() {
		return tower;
	}
	
	public void setTower(Tower tower) {
		this.tower = tower;
	}

	@Override
	public String toString() {
		return "WindTurbine [generator=" + generator + ", rotor=" + rotor + ", tower=" + tower + "]";
	}
	
}
