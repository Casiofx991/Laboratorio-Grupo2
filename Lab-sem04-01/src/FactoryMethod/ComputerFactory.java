package FactoryMethod;

public class ComputerFactory {
	
	public Computer build(int type) {
		
		switch(type) {
		case 1:
			return new DellComputer();
		case 2 :
			return new MacComputer();
		case 3 :
			return new AsusComputer();			
		}
		return null;	
	}

}
