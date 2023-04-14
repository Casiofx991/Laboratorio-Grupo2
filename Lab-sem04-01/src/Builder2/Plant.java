package Builder2;

import java.util.Date;

public class Plant {
	private int id;

	private String color;

	private String climate;

	private String scientificName;
	
	private String lightPreference;

	private int age ;

	private int size ;
	

public Plant setcolor(String color) {		
		this.color = color;
		return this;	
}	

public Plant setclimate(String climate) {		
	this.climate = climate;
	return this;
}
public Plant setscientificName(String scientificName) {		
	this.scientificName = scientificName;
	return this;
}
public Plant setlightPreference(String lightPreference) {		
	this.lightPreference = lightPreference;
	return this;
}
public Plant setage(int age) {		
	this.age = age;
	return this;	
}

public Plant setsize(int size) {		
	this.size = size;
	return this;	
}

}
