package DpkSpringBoot.pojo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class SignUpRequest {

	@NotBlank
	@Size(min = 6, max = 25)
	private String userName;
	
	@NotBlank
	@Size(min = 8)
	private String password;
	
	@NotBlank
	@Email
	private String email;

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}
	
	
}
