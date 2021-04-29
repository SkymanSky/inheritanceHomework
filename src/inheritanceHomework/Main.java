package inheritanceHomework;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setFirstName("Engin");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(user1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(user1);
		
		UserManager userManager = new UserManager();
		userManager.add(user1);

	}

}
