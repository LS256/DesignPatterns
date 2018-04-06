package pl.codemakesfun.builder.entities;

public class Tower {
	
	private int height;
	private String material;
	private String towertype;
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public String getMaterial() {
		return material;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public String getTowertype() {
		return towertype;
	}

	public void setTowertype(String towertype) {
		this.towertype = towertype;
	}
	
	@Override
	public String toString() {
		return "Tower [height=" + height + ", material=" + material + ", towertype=" + towertype + "]";
	}
}
