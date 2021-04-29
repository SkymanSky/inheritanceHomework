package inheritanceHomework;

public class User {
	private int id;
	private String firstName;
	private String lasstName;
	private String email;
	private String password;
	private boolean status;
	
	
	public User(int id, String firstName, String lasstName, String email, String password, boolean status) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lasstName = lasstName;
		this.email = email;
		this.password = password;
		this.status = status;
	}
	
	public User() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLasstName() {
		return lasstName;
	}
	public void setLasstName(String lasstName) {
		this.lasstName = lasstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	

}
