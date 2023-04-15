package FactoryMethod;

public class CarFactory {
	
	public Car build(int type) {
		
		switch(type) {
		case 1:
			return new ToyotaCar();
		case 2 :
			return new RenaultCar();
		case 3 :
			return new NissanCar();			
		}
		return null;	
	}

}
