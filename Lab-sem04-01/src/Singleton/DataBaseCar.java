package Singleton;

public class DataBaseCar {
	
	private static DataBaseCar database ;
	
	
	private DataBaseCar() {
		
	}
	
	public static DataBaseCar GetInstace() {
		
		if(database == null) {
			return new DataBaseCar();
		}
		else
		{
			return database;
		}		
	}
}
