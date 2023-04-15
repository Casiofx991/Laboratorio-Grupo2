package FactoryMethod;



public class Store {
	
	
	//Dell
	//Mac
	//Asus ,....
	
	//tipo 1 return Dell
	//Tipo 2 return MAc
	//Tipo 3 return Asus
	
	
	public Computer sale(int type) {//Antigua
		
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
	
	
	
	public Computer sale2(int type) { /// Forma con patron
	
		return new ComputerFactory().build(type);
	}

	
	
}