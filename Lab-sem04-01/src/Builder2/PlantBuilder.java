package Builder2;

public class PlantBuilder {
	private int id;

	private String color;

	private String climate;

	private String scientificName;
	
	private String lightPreference;

	private int age ;

	private int size ;
	
	public PlantBuilder setcolor(String color) {		
		this.color = color;
		return this;	
}

public PlantBuilder setclimate(String climate) {		
	this.climate = climate;
	return this;
}
public PlantBuilder setscientificName(String scientificName) {		
	this.scientificName = scientificName;
	return this;
}
public PlantBuilder setlightPreference(String lightPreference) {		
	this.lightPreference = lightPreference;
	return this;
}
public PlantBuilder setage(int age) {		
	this.age = age	;
	return this;	
}

public PlantBuilder setsize(int size) {		
	this.size = size	;
	return this;	
}
public Plant build() {
	
	Plant plant = new Plant();
	
 

	plant.setcolor(this.color);
	plant.setclimate(this.climate);
	plant.setscientificName(this.scientificName);
	plant.setlightPreference(this.lightPreference);
	plant.setage(this.age);
	plant.setsize(this.size);
	
	return plant;
}
}
