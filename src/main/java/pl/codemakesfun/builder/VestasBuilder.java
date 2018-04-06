package pl.codemakesfun.builder;

import pl.codemakesfun.builder.entities.Generator;
import pl.codemakesfun.builder.entities.Rotor;
import pl.codemakesfun.builder.entities.Tower;
import pl.codemakesfun.builder.entities.WindTurbine;

public class VestasBuilder implements WindTurbineBuilder {
	private WindTurbine windTurbine;
	
	VestasBuilder(){
		windTurbine = new WindTurbine();
	}
	
	public void buildTower() {
		Tower tower = new Tower();
		tower.setHeight(125);
		tower.setMaterial("steel");
		tower.setTowertype("Tubular");
		
		windTurbine.setTower(tower);
	}

	public void buildRotor() {
		Rotor rotor = new Rotor();
		rotor.setDiameter(114.0);
		rotor.setMaterial("fiber gass");
		
		windTurbine.setRotor(rotor);
	}

	public void buildGenerator() {
		Generator generator = new Generator();
		generator.setActivePower(2000);
		generator.setReactivePower(2100);
		generator.setProducerName("Vestas");
		generator.setType("Double fed");
		
		windTurbine.setGenerator(generator);
	}

	public WindTurbine getWindTurbine() {
		return windTurbine;
	}

}