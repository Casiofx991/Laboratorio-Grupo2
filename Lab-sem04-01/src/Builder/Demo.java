package Builder;
import java.io.*;

public class Demo {
	
	public static void main(String[] args) {
		
			
		
		
		
		Student student= new StudentBuilder().setId(1).setCode("1234").setName("Pedro").build();
		
		System.out.println(student);		
		
	}

}