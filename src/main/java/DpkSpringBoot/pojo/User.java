package DpkSpringBoot.pojo;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
	
	@Id
	private ObjectId id;
	
	private String userName;
	
	
	private String password;
	
	private String email;
	
	private List<?> roles;

	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<?> getRoles() {
		return roles;
	}

	public void setRoles(List<?> roles) {
		this.roles = roles;
	}
	
	
	
	

}
