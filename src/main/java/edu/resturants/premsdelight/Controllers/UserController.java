package edu.resturants.premsdelight.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.resturants.premsdelight.config.ResponseStructure;
import edu.resturants.premsdelight.dto.UserDto;
import edu.resturants.premsdelight.entity.User;
import edu.resturants.premsdelight.service.UserService;



@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/save")
	public ResponseEntity<ResponseStructure<UserDto>> saveUser(@Validated @RequestBody User user) {
		return userService.saveUser(user);
	}

	@GetMapping("/login")
	public ResponseEntity<ResponseStructure<UserDto>> findUserByEmailAndPasswords(@RequestParam String email,
			@RequestParam String password) {
		return userService.findUserByEmailAndPassword(email, password);
	}

	@DeleteMapping("/delete")
	public void removeUserById(@RequestParam long id) {

	}

	@GetMapping("/findById")
	public void findUserById(@RequestParam long id) {

	}
}

