package inheritanceHomework;

public class Instructor extends User{
	
		private String details;
		private String courseName;
		
		public Instructor(int id, String firstName, String lasstName, String email, String password, boolean status,
				String details, String courseName) {
			super(id, firstName, lasstName, email, password, status);
			this.details = details;
			this.courseName = courseName;
		}
		
		public Instructor() {
			
		}

		public String getDetails() {
			return details;
		}

		public void setDetails(String details) {
			this.details = details;
		}

		public String getCourseName() {
			return courseName;
		}

		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}
		
		
		
}
