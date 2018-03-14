package pl.codemakesfun.builder;

import pl.codemakesfun.builder.entities.Generator;
import pl.codemakesfun.builder.entities.Rotor;
import pl.codemakesfun.builder.entities.Tower;
import pl.codemakesfun.builder.entities.WindTurbine;

public class GamesaBuilder implements WindTurbineBuilder {

	WindTurbine windTurbine;
	
	GamesaBuilder(){
		windTurbine = new WindTurbine();
	}
	
	public void buildTower() {
		Tower tower = new Tower();
		tower.setHeight(105);
		tower.setMaterial("steel");
		tower.setTowertype("Tubular");
		
		windTurbine.setTower(tower);
	}

	public void buildRotor() {
		Rotor rotor = new Rotor();
		rotor.setDiameter(120.0);
		rotor.setMaterial("fiber gass");
		
		windTurbine.setRotor(rotor);
	}

	public void buildGenerator() {
		Generator generator = new Generator();
		generator.setActivePower(2000);
		generator.setReactivePower(2050);
		generator.setProducerName("Gamesa");
		generator.setType("Double fed");
		
		windTurbine.setGenerator(generator);
	}

	public WindTurbine getWindTurbine() {
		return windTurbine;
	}

}
