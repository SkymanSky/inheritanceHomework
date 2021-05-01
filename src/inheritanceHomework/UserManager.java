package inheritanceHomework;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullanici "+user.getFirstName()+" eklendi.");
	}
	
	public void list(User user) {
		System.out.println("Kullanicilar listelendi");
	}
	
	public void update(User user) {
		System.out.println("Kullanici "+user.getFirstName()+" guncellendi.");
	}
	
	
	public void delete(User user) {
		System.out.println("Kullanici "+user.getFirstName()+" silindi.");
	}
	
}
