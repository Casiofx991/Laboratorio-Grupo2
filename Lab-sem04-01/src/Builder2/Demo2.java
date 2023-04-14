package Builder2;
import java.io.*;

public class Demo2 {
	public static void main(String[] args) {
		
			 
		
		
		
		Book book= new BookBuilder().setautor("Pedro").build();
		Plant plant= new PlantBuilder().setage(19).build();
		
		System.out.println(book);
		
		System.out.println(plant);		
		         
	}
}
