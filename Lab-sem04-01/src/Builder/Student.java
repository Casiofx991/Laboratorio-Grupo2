package Builder;

public class Student {
	
	private int id;
	private String code;
	private String name;
	private String courses;
	private int age ;
	private int pension ;
	private String lastName;
	private String carreer;
	private boolean isActive;
	


	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setCode(String code) {
		this.code = code;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public int getId(int id) {
		return id;
	}
	
	public String getCode(String code) {
		return code;
	}

	public String getName(String name) {
		return name;
	}

	
	
}