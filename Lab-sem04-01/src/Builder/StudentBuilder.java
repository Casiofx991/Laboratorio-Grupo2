package Builder;

public class StudentBuilder implements   IStudentBuilder {
	
	private int id;
	private String code;
	private String name;
	private String courses;
	private int age ;
	private int pension ;
	private String lastName;
	private String carreer;
	private boolean isActive;
	
	
	
	public StudentBuilder setId(int id) {		
			this.id = id	;
			return this;	
	}
		
	
	public StudentBuilder setCode(String code) {		
			this.code = code;
			return this;	
	}	
	
	public StudentBuilder setName(String name) {		
		this.name = name;
		return this;
	}

	
	
	
	public Student build() {
		
		Student student = new Student();
		
		//if (id == 0 ) { throw new Exception("id is mandatory");}
		
		student.setId(this.id);
		student.setCode(this.code);
		student.setName(this.name);
		
		return student;
	}
		

}