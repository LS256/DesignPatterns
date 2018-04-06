package pl.codemakesfun.builder;

import pl.codemakesfun.builder.entities.WindTurbine;

public class ClientBuilder {

	public static void main(String[] args) {
		WindTurbineBuilder windTurbineBuilder = new VestasBuilder();
		WindTurbineDirector windTurbineDirector = new WindTurbineDirector(windTurbineBuilder);
		windTurbineDirector.makeWindTurbine();
		
		WindTurbine windTurbine = windTurbineDirector.getWindTurbine();
		
		System.out.println(windTurbine);

	}

}
