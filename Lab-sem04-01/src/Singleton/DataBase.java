package Singleton;

public class DataBase {
	
	private static DataBase database ;
	
	
	private DataBase() {
		
	}
	
	public static DataBase GetInstace() {
		
		if(database == null) {
			return new DataBase();
		}
		else
		{
			return database;
		}		
	}

}
