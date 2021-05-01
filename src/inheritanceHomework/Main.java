package inheritanceHomework;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setFirstName("Skyman");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(user1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(user1);
		
		UserManager userManager1 = new UserManager();
		userManager1.add(user1);
		
		System.out.println("--------------------");
		
		UserManager[] userManagers= new UserManager[] {new StudentManager(), new InstructorManager(), new UserManager()};
		
		for (UserManager userManager : userManagers) {
			userManager.add(user1);
			userManager.list(user1);
			userManager.update(user1);
			userManager.delete(user1);
		}

	}

}
