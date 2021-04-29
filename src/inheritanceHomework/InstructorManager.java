package inheritanceHomework;

public class InstructorManager extends UserManager{
	public void add(User user) {
		System.out.println("Ogretmen: "+user.getFirstName()+" eklendi.");
	}
	

}
