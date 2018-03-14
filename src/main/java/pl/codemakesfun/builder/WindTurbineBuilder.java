package pl.codemakesfun.builder;

import pl.codemakesfun.builder.entities.WindTurbine;

public interface WindTurbineBuilder {
	
	public void buildTower();
	
	public void buildRotor();
	
	public void buildGenerator();
	
	public WindTurbine getWindTurbine();

}
