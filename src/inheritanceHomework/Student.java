package inheritanceHomework;

public class Student extends User {
	
	String registeredCourseName;

	public Student(int id, String firstName, String lasstName, String email, String password, boolean status,
			String registeredCourseName) {
		super(id, firstName, lasstName, email, password, status);
		this.registeredCourseName = registeredCourseName;
	}
	
	public Student() {
		
	}

	public String getRegisteredCourseName() {
		return registeredCourseName;
	}

	public void setRegisteredCourseName(String registeredCourseName) {
		this.registeredCourseName = registeredCourseName;
	}
	
	
	
}
