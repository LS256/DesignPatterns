package pl.codemakesfun.builder.entities;

public class Rotor {
	private double diameter;
	private String material;
	
	public double getDiameter() {
		return diameter;
	}
	
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		return "Rotor [length=" + diameter + ", material=" + material + "]";
	}
}
