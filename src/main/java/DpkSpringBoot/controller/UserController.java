package DpkSpringBoot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {
	
	
	@PostMapping("/signup")
	public ResponseEntity<?> signUpUser(){
		return null;
		
	}
	
	@PostMapping("/signin")
	public ResponseEntity<?> signInUser(){
		return null;
		
	}

}
