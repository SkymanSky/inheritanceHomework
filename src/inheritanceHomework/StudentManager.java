package inheritanceHomework;

public class StudentManager extends UserManager {
	
	public void add(User user) {
		System.out.println("Ogrenci: "+user.getFirstName()+" eklendi.");
	}
	
	public void list(User user) {
		System.out.println("Ogrenciler listelendi");
	}
	
	public void update(User user) {
		System.out.println("Ogrenci "+user.getFirstName()+" guncellendi.");
	}
	
	
	public void delete(User user) {
		System.out.println("Ogrenci "+user.getFirstName()+" silindi.");
	}

}
