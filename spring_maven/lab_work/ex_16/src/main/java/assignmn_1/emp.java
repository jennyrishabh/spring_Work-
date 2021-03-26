package assignmn_1;

import org.springframework.stereotype.Component;

@Component
public class emp {
	
	
	private long id; private String firstName; private String lastName; 
	private String emailId;
	
	
	public emp(long id, String firstName, String lastName, String emailId) {
		//super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}
	
	public emp() {
		//super();
		this.id = 101;
		this.firstName = "default";
		this.lastName = "default_2";
		this.emailId = "@yahoo.com";
	}

	@Override
	public String toString() {
		return "emp [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId + "]";
	}
	
	

}
