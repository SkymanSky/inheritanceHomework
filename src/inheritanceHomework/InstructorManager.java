package inheritanceHomework;

public class InstructorManager extends UserManager{
	public void add(User user) {
		System.out.println("Ogretmen: "+user.getFirstName()+" eklendi.");
	}
	
	public void list(User user) {
		System.out.println("Ogretmenler listelendi");
	}
	
	public void update(User user) {
		System.out.println("Ogretmen "+user.getFirstName()+" guncellendi.");
	}
	
	
	public void delete(User user) {
		System.out.println("Ogretmen "+user.getFirstName()+" silindi.");
	}
	

}
