package pl.codemakesfun.builder.entities;

public class Generator {
	private double activePower;
	private double reactivePower;
	private String type;
	private String producerName;
	
	public double getActivePower() {
		return activePower;
	}
	
	public void setActivePower(double activePower) {
		this.activePower = activePower;
	}
	
	public double getReactivePower() {
		return reactivePower;
	}

	public void setReactivePower(double reactivePower) {
		this.reactivePower = reactivePower;
	}
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getProducerName() {
		return producerName;
	}
	
	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}

	@Override
	public String toString() {
		return "Generator [activePower=" + activePower + ", reactivePower=" + reactivePower + ", type=" + type
				+ ", producerName=" + producerName + "]";
	}

	
}
