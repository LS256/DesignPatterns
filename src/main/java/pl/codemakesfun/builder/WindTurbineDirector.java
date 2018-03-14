package pl.codemakesfun.builder;

import pl.codemakesfun.builder.entities.WindTurbine;

public class WindTurbineDirector {
	private WindTurbineBuilder windTurbineBuilder;
	
	WindTurbineDirector(WindTurbineBuilder windTurbineBuilder){
		this.windTurbineBuilder = windTurbineBuilder;
	}
	
	public void makeWindTurbine(){
		windTurbineBuilder.buildTower();
		windTurbineBuilder.buildGenerator();
		windTurbineBuilder.buildRotor();
	}
	
	public WindTurbine getWindTurbine(){
		return this.windTurbineBuilder.getWindTurbine();
	}

}
