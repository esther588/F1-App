package com.esther588.F1App.user;

import com.esther588.F1App.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class UserController {

	private final UserService userService;

	@GetMapping("/entry")
	String signUpPage(User user) {
		return "entry";
	}

	@PostMapping("/entry")
	String signUp(User user) {
		userService.signUpUser(user);
		return "redirect:/homepage";
	}

	@GetMapping("/homepage")
	String homepage() {
		return "homepage";
	}

}
