package inheritanceHomework;

public class StudentManager extends UserManager {
	
	public void add(User user) {
		System.out.println("Ogrenci: "+user.getFirstName()+" eklendi.");
	}

}
